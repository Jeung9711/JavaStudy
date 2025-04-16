package ch16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 연습문제01 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("src/ch16/output.txt");

        out.write('F');
        out.write('i');
        out.write('l');
        out.write('e');
        out.write('\n');
        out.write('O');
        out.write('u');
        out.write('t');

        out.flush();
        out.close();
    }
}
