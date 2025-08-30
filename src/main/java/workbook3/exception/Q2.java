package main.java.workbook3.exception;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            // TODO: index 입력 받기
            int index = sc.nextInt();                           //배열의 크기는 n. index는 n보다 작아야함.
            // TODO: arr[index] 출력
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    sc.close();
    }
}