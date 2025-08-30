package main.java.workbook3.exception;

import java.util.Scanner;

class NegativeAgeException extends Exception {
    NegativeAgeException(String msg) {
        super(msg);
    }   //부모 클래스인 Exception의 생성자를 호출해서 예외 메시지를 저장
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            // TODO: age가 0보다 작으면 NegativeAgeException throw
            if(age<0){
                throw new NegativeAgeException("Invalid age");
            }else{
                System.out.println(age);
            }
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}