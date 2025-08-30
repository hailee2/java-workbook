package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Shape {                              //부모 클래스
    abstract double area();                         //서브 클래스에서 구현해야 하는 추상 메서드
}

class Circle extends Shape {                        //부모 클래스를 상속받은 Circle 클래스
    double r;                                       //Circle의 반지름 필드

    Circle(double r) {
        this.r = r;
    }                //Circle의 생성자 : 필드값 r을 매개변수로 넣어서 만듦. 필드r 초기화

    double area() {
        return Math.PI * r * r;
    }       //부모 클래스의 area()메서드 오버라이딩
}

class Square extends Shape {                        //부모 클래스를 상속받은
    double s;                                       //Square의 속성(필드)값

    Square(double s) {
        this.s = s;
    }                //필드(속성)값을 매개변수로 넣은 생성자 | 필드 s 초기화 생성자

    double area() {
        return s * s;
    }                 //부모 클래스의 메서드를 오버라이딩하여 메서드 생성
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] list = new Shape[3];                        //Shape 타입 객체를 담을 수 있는 배열
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                list[i] = new Circle(sc.nextDouble());      //입력값에 따른 객체 생성
            } else {
                list[i] = new Square(sc.nextDouble());
            }
        }
        for (Shape s : list) {                              //list의 각 원소를 s에 참조
            System.out.println(s.area());                   //s의 오버라이딩된 area()메서드 호출
        }
    }
}