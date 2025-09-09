package main.java.workbook3.genericenum;

import java.util.Scanner;

enum Level { LOW, MEDIUM, HIGH }        //enum 클래스 : LOW,MEDIUM,HIGH 세 상수값을 갖고있음

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Level level = Level.valueOf(input);         // input LOW입력하면 LOW 출력, MEDIUM입력 - MEDIUM출력, HIGH입력 - HIGH출력
        System.out.println(level);
    }
}