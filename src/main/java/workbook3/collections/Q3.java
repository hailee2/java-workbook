package main.java.workbook3.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 문자열과 정수 쌍을 N개 입력받아 HashMap<String,Integer>에 저장한 후, 주어진 키에 대한 값을 출력하는 프로그램을 작성하시오.
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String key = sc.next();
            int val = sc.nextInt();
            map.put(key,val);
        }
        String query = sc.next();
        System.out.println(map.get(query));
        sc.close();
    }
}
/*
put(key,value) 값 추가/ 수정
get(key) 값 조회
remove(key) 값 삭제
 */

/*
1. HashMap<String, Integer> map = new HashMap<>();
변수 타입을 구체적인 구현체(HashMap)로 선언
나중에 구현체를 바꾸고 싶을 때 코드 수정 필요

2. Map<String, Integer> map = new HashMap<>();
 변수 타입은 인터페이스(Map)
 실제 구현체는 HashMap
 나중에 TreeMap이나 LinkedHashMap으로 바꾸기 편함
 코드가 유연하고 유지보수에 좋음
 */