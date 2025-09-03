package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();     //빈 리스트 생성
        for(int i=1;i<=n;i++) list.add(i);          //리스트에 1부터 n까지 채워 넣음
        // TODO: list를 역순으로 출력
        for(int i = list.size()-1; i>=0; i--){      //list의 인덱스를 거꾸로 출력
            System.out.println(list.get(i));        //리스트는 메서드로 접근해야 함 |예 : add(), get(), set()
        }
        sc.close();
    }
}