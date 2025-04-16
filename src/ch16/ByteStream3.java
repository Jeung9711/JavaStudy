package ch16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteStream3 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("byte-stream-write.txt");
        out.write((int)'H');
        out.write((int)'e');
        out.write((int)'l');
        out.write((int)'l');
        out.write((int)'o');
        out.flush();
        out.close();
    }
}
