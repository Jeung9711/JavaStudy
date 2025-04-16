package ch16;

import java.io.*;

public class ChacaterStreamExam {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("byte-stream-data2.txt");
        // 한글 text 문서에 사용하는 공식
        InputStream in = new FileInputStream("byte-stream-data2.txt");
        // euc-kr 또는 MS949 등 인코딩 방식 수동 입력
        InputStreamReader isr = new InputStreamReader(in, "euc-kr");
        BufferedReader br = new BufferedReader(isr);
        br.readLine();


        int data = 0;
        // 비교 연산자 > 대입 연산자, 우선순위를 위해 괄호 사용
        while ((data = reader.read()) != -1) {
            System.out.printf("%s", (char) data);
        }
//        int letter = reader.read();
//        System.out.printf("ASCII 값 : %s\n", letter);
//        System.out.printf("문자 형태로 변환된 값 %s\n", (char) letter);
//        letter = reader.read();
//        System.out.printf("ASCII 값 : %s\n", letter);
//        System.out.printf("문자 형태로 변환된 값 %s\n", (char) letter);
//        reader.close();

    }
}
