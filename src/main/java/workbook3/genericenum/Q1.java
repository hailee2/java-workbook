package main.java.workbook3.genericenum;

import java.util.Scanner;

class GenericBox<T> {                             //제네릭 클래스
    T value;                                      //필드. T 타입

    GenericBox(T value) {
        this.value = value;
    }   //생성자의 매개변수는 value (타입이 T)
                                                  //T는 클래스에서 선언한 "타입 매개변수"

    T get() {
        return value;
    }                     //T value의 값을 반환하는 get() 메서드
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();
        GenericBox<Integer> box1 = new GenericBox<>(i);
        GenericBox<String> box2 = new GenericBox<>(s);
        System.out.println(box1.get());     // i 출력
        System.out.println(box2.get());     // s 출력
        sc.close();
    }
}