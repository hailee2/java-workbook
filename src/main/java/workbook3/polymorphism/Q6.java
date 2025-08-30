package main.java.workbook3.polymorphism;

import java.util.Scanner;

interface Playable {                                            //인터페이스
    void play();                                                //반드시 구현해야하는 메서드
}

class Piano implements Playable {                               //인터페이스를 상속받은 피아노 클래스
    public void play() {
        System.out.println("Piano plays");
    }   //메서드 오버라이딩
}

class Guitar implements Playable {                              //인터페이스를 상속받은 기타 클래스
    public void play() {
        System.out.println("Guitar plays");
    }  //메서드 오버라이딩
}

class Drum implements Playable {                                //인터페이스를 상속받은 드럼 클래스
    public void play() {
        System.out.println("Drum plays");
    }    //메서드 오버라이딩
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 배열의 크기가 3인 Playable 인터페이스 타입 배열을 선언, 변수명은 instruments
        Playable[] instruments = new Playable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            // TODO: t 입력값이 "piano"인 경우 Piano 타입 객체, "guitar"인 경우 Guitar 타입 객체, "drum"인 경우 Drum 타입 객체를 instruments 배열에 추가합니다.
            if(t.equals("piano")){
                instruments[i] = new Piano();
            }else if(t.equals("guitar")){
                instruments[i] = new Guitar();
            }else if(t.equals("drum")){
                instruments[i] = new Drum();
            }
        }
        // TODO: instruments 배열에 추가된 객체들의 play() 메서드를 호출합니다.
        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}