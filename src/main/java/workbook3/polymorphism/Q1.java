package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {                              //Animal을 상속받은 Dog 클래스
    void sound() {
        System.out.println("Woof");
    }        //Animal의 sound()메서드 오버라이딩
}

class Cat extends Animal {                              //Animal을 상속받은 Cat 클래스
    void sound() {
        System.out.println("Meow");
    }        //Animal의 sound()메서드 오버라이딩
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            animals[i] = t.equals("dog") ? new Dog() : new Cat();   //입력값 "dog" -> Dog 생성 | 그 외 -> Cat 생성
        }
        for (Animal a : animals) {                                  //animals 배열의 각 원소를 a로 참조
            a.sound();                                              //a의 sound() 메서드 호출 (오버라이딩된 메서드 실행)
        }
    }
}
