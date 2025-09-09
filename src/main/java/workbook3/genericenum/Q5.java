package main.java.workbook3.genericenum;

import java.util.Scanner;

enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day day = Day.valueOf(sc.next());
        // TODO: switch 문으로 Work 또는 Rest 출력
        switch(day){
            case MON , TUE, WED, THU, FRI :
                System.out.println("Work");
                break;
            case SAT, SUN:
                System.out.println("Rest");
        }
    }
}