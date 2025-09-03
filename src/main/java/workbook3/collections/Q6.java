package main.java.workbook3.collections;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        // TODO: 합집합과 교집합 구해 출력 (HashSet 이용)
        //합집합 : 중복 없는 집합. 두 리스트를 addAll() 메서드로 합치기
        Set<Integer> union = new HashSet<>(list1);      //ArrayList를 HashSet으로 변환
        union.addAll(list2);
        //교집합 : 두 집합에 있는 원소만 남기. retainAll()메서드 사용
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);

        System.out.println("합집합 : "+ union);
        System.out.println("교집합 : "+ intersection);

        sc.close();
    }
}