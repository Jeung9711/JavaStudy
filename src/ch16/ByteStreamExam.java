package ch16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreamExam {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("byte-stream-data.txt");

        // read()
//        while (true) {
//            int letter = in.read();
//            if(letter == -1) break;
//            System.out.printf("ASCII 값 : %s\n", letter);
//            System.out.printf("문자 형태로 변환된 값 %s\n", (char) letter);
//        }

        // read(byte [] )
        byte[] buffer = new byte[8];

        while (true) {
            int readByteNum = in.read(buffer);
            if(readByteNum == -1) break;

            for(int i=0; i<readByteNum; i++) {
                System.out.printf("%s", (char) buffer[i]);
            }
        }
//        int letter = in.read();
//        System.out.printf("ASCII 값 : %s\n", letter);
//        System.out.printf("문자 형태로 변환된 값 %s\n", (char) letter);
//        letter = in.read();
//        System.out.printf("ASCII 값 : %s\n", letter);
//        System.out.printf("문자 형태로 변환된 값 %s\n", (char) letter);
        in.close();
    }
}

