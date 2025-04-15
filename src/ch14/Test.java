package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 정석적인 파일 읽기 코드 예외처리
        InputStream in = null;
        try {
            in = new FileInputStream("c:/react/react-weather.html");
            int data = in.read();
            System.out.println((char) data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if( in != null) {
                try{
                    in.close();
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        new Scanner(System.in).next();
    }
}
