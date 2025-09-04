package main.java.workbook3.genericenum;

import java.util.Scanner;

public class Q2 {
    static <T> void swap(T[] arr, int i, int j) {           //제네릭 메서드 swap()
        // TODO: arr[i]와 arr[j] 교환
        T t = arr[i];                                       //arr[i] 값을 T t에 임시 저장
        arr[i] = arr[j];                                    //arr[j] 값을 arr[i]에 대입
        arr[j] = t;                                         //원래의 arr[i] 값이었던 t를 arr[j]에 대입
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = {sc.next(), sc.next()};           //문자열 2개 입력받아서 문자 배열 strArr에 저장
        Integer[] intArr = {sc.nextInt(), sc.nextInt()};    //Integer 2개 입력받아 Integer배열 intArr에 저장
        swap(strArr, 0, 1);                             //swap() 메서드 실행 : strArr[0]과 strArr[1] 교환
        swap(intArr, 0, 1);                             //swap() 메서드 실행 : intArr[0]과 intArr[1] 교환
        System.out.println(strArr[0] + " " + strArr[1]);    //strArr[0], strArr[1] 값 출력 -> 값이 swap됨
        System.out.println(intArr[0] + " " + intArr[1]);    //intArr[0], intArr[1] 값 출력 -> 값이 swap됨
        sc.close();
    }
}