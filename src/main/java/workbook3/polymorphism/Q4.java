package main.java.workbook3.polymorphism;

import java.util.Scanner;

interface Renderer {                                                //인터페이스 Renderer
    void render();                                                  //인터페이스를 상속받을 경우 반드시 구현해야하는 메서드
}

class SquareRenderer implements Renderer {                          //Renderer를 상속받은 클래스 SquareRenderer
    public void render() {
        System.out.println("Render square");
    }   //Renderer의 메서드를 오버라이딩함.
}

class CircleRenderer implements Renderer {                          //Renderer를 상속받은 클래스 CircleRenderer
    public void render() {
        System.out.println("Render circle");
    }   //Renderer의 메서드를 오버라이딩함.
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 배열의 크기가 3인 Renderer 인터페이스 타입 배열을 선언, 변수명은 arr
        Renderer[] arr = new Renderer[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            // TODO: t 입력값이 "square"인 경우 SquareRenderer 타입 객체 아니면 CircleRenderer 타입 객체를 arr 배열에 추가합니다.
            if(t.equals("square")){
                arr[i] = new SquareRenderer();
            }else{
                arr[i] = new CircleRenderer();
            }
        }
        // TODO: arr 배열에 추가된 객체들의 render() 메서드를 호출합니다.
        for (Renderer renderer : arr) {
            renderer.render();
        }
    }
}
