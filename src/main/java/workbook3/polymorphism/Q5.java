package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Polygon {                            //부모 클래스
    abstract double area();                         //면적을 구하는 추상메서드
    abstract double perimeter();                    //둘레를 구하는 추상메서드
}

class Triangle extends Polygon {                    //부모클래스를 상속받은 삼각형 클래스
    double a, b, c;                                 //삼각형 클래스의 필드값

    Triangle(double a, double b, double c) {        // 생성자: 변 길이를 매개변수로 받아 필드 초기화
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {                                     //삼각형의 면적을 구하는 메서드(추상메서드를 오버라이딩)
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));
    }

    double perimeter() {
        return a + b + c;
    }           //삼각형의 둘레를 구하는 메서드(추상메서드를 오버라이딩)
}

class Rectangle extends Polygon {                      //부모 클래스를 상속받은 사각형 클래스
    double w, h;                                       //사각형 클래스의 필드값

    Rectangle(double w, double h) {                    //필드값을 초기화한 생성자
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;
    }                    //부모클래스의 메서드를 오버라이딩하여 사각형의 면적을 구하는 메서드 구현

    double perimeter() {
        return 2 * (w + h);
    }         //부모클래스의 메서드 오버라이딩하여 사각형의 둘레길이 구하는 메서드
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            String t = sc.next();
            // TODO: 입력받은 t의 값에 따라 Polygon 타입의 참조변수 p 에 알맞은 구현체를 넣어(참조해)줍니다.
            Polygon p;
            if(t.equals("triangle")){
                // TODO: triangle은 세변 a, b, c를 입력받습니다.
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                p = new Triangle(a, b, c);
            }else{
                // TODO: rect은 넓이(w)와 높이(h) 값을 입력받습니다.
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                p = new Rectangle(w,h);
            }
            // TODO: System.out.println(p.area() + " " + p.perimeter()); 를 선언하여 면적과 둘레를 출력한다.
            System.out.println(p.area() + " " + p.perimeter());
        }
    }
}