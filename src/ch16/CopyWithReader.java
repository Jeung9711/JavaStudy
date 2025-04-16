package ch16;

import java.io.*;
public class CopyWithReader {
 public static void main(String[] args) throws IOException {
   FileReader reader = null;
   FileWriter writer = null;
   reader = new FileReader("dog.jpg");
   writer = new FileWriter("dog_copy_reader.jpg");
   int data;
   while ((data = reader.read()) != -1) {
     writer.write(data); // 한 문자씩 복사
   }
   System.out.println("Reader로 복사 완료 (파일 손상)");
   reader.close();
   writer.close();
 }
}
