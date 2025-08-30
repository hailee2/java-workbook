package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Language {                                                   //부모 클래스
    abstract void displayInfo();                                            // 서브클래스에서 구현해야 하는 추상 메서드
}

class JavaLanguage extends Language {                                       //Language 상속받은 JavaLanguage 클래스
    void displayInfo() {
        System.out.println("This is Java language");
    }     //부모 클래스의 메서드를 오버라이딩
}

class PythonLanguage extends Language {                                     //Language 상속받은 PythonLanguage 클래스
    void displayInfo() {
        System.out.println("This is Python language");
    }   //부모 클래스의 메서드 오버라이딩
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Language[] arr = new Language[3];                                   //Language 타입의 객체를 담을 수 있는 배열 생성
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            arr[i] = type.equals("java") ? new JavaLanguage() : new PythonLanguage();  //입력값에 따라 JavaLanguage 또는 PythonLanguage 객체 생성
        }
        for (Language lang : arr) {                                 //배열 arr의 각 원소를 lang으로 참조
            lang.displayInfo();                                     //lang의 displayInfo() 메서드 호출(오버라이딩된 메서드 실행)
        }
    }
}
