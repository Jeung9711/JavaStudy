package ch16;

import java.io.*;
public class CopyWithStream {
 public static void main(String[] args) throws IOException {
   FileInputStream in = null;
   FileOutputStream out = null;
   in = new FileInputStream("dog.jpg");
   out = new FileOutputStream("dog_copy_stream.jpg");
   int data;
   while ((data = in.read()) != -1) {
     out.write(data); // 한 바이트씩 복사
   }
   System.out.println("InputStream으로 복사 완료");
   in.close();
   out.close();
 }
}
