package main.java.workbook3.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.next(), sc.nextInt());
        }
        // TODO: map의 키와 값 목록 출력
        //keySet() values() 메서드 사용
        for (String s : map.keySet()) {     //keySet() : 키만 가져올 때, Set으로 반환
            System.out.print(s);
        }
        System.out.println();
        for (Integer value : map.values()) {        //values() : 값만 가져올 때, Collection으로 반환
            System.out.print(value);
        }
        sc.close();
    }
}
