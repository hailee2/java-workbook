package main.java.workbook3.exception;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        try {
            // TODO: op에 따라 계산 및 출력
            if(("+").equals(op)){
                System.out.println(a+b);
            }else if(("-").equals(op)){
                if(a>=b){
                    System.out.println(a-b);
                }else{
                    System.out.println(b-a);
                }
            }else if(("*").equals(op)){
                System.out.println(a*b);
            }else if(("/").equals(op)){
                System.out.println(a/b);
            }else{
                throw new Exception("Invalid operator");
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
