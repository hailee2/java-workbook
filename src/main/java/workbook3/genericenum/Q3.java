package main.java.workbook3.genericenum;

import java.util.Scanner;

public class Q3 {
    static <T extends Number> double sumNumbers(T[] arr) {
        // TODO: arr 요소의 합을 반환
        double sum = 0;                         //T extends Number : T는 Integer, float, double등 Number의 하위 타입 -> 그 중 가장 넓은 범위를 표현하는 double을 사용
        for(int i = 0; i<arr.length; i++){
            sum += arr[i].doubleValue();        //Number 클래스가 제공하는 double 타입으로 변환 해주는 메서드
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] nums = new Number[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextDouble();
        }
        System.out.println(sumNumbers(nums));
        sc.close();
    }
}
/*
 상한(bounded) 타입 파라미터 : 타입 매개변수 T의 타입 범위를 제한하는 기능
 -기본 제네릭 : 제한 없음
 -상한 타입 파라미터(bounded type parameter)
  class NumberBox <T extends Number>{..}
  static <T extends Number> double add(..){..}
  -> T는 반드시 Number 또는 그 하위 클래스여야 함.
 -여러 개 제한도 가능 : T extends 클래스 & 인터페이스
 */
