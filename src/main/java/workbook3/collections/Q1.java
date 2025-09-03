package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 입력받은 문자열을 N개를 ArrayList에 저장한 후 모든 원소를 순서대로 출력하는 프로그램을 작성하시오.
        List<String> str = new ArrayList<>();
        for(int i = 0; i<n; i++){
            str.add(sc.next());             //리스트는 배열처럼 인덱스를 이용해 대입할 수 없음. add()메서드를 사용해 요소 추가 가능
        }
        for (String s : str) {
            System.out.println(s);
        }
        sc.close();
    }
}