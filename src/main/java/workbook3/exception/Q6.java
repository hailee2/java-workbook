package main.java.workbook3.exception;

import java.util.Scanner;

class FileMissingException extends Exception {
    FileMissingException(String msg) {
        super(msg);
    }
}

public class Q6 {
    //openFile() 메서드 : throw 역할. 예외를 던지기. 메서드로 분리해서 재사용성 확보하고 '예외 발생'과 '예외 처리' 역할을 분리.
    static void openFile(String name) throws FileMissingException {
        // TODO: 파일이 없다고 가정하고 예외 throw
        throw new FileMissingException("File doesn't exist.");       //예외 발생시키기 ""안의 내용이 출력되는게 아니라 FileMissingException에 메세지를 담아서 던진 것임. 예외 객체 안에 이 메세지를 저장.
    }                                                    //e.getMessage()하면 "file doesn't exist"가 출력됨

    //메인 메서드 : catch 역할. 예외 발생 시 처리.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        try {
            openFile(filename);
        } catch (FileMissingException e) {                      //예외 처리하기
            System.out.println("File not found : " + e.getMessage());
        }
    }
}
