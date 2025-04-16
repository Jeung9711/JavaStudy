package ch16;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
//        InputStream in = new FileInputStream("dog.jpg");
        InputStream in = new FileInputStream("c:/users/user/test.zip");
        OutputStream out = new FileOutputStream("c:/users/user/test_copy.zip");

        // buffer 사용시 속도 확연히 상승
        byte[] buffer = new byte[4];

        while (true) {
            int data = in.read(buffer);
            out.write(data);

            if(data == -1) break;
        }

        in.close();
        out.close();
    }
}
