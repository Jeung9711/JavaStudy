package ex;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1Exam {
  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket socket = new Socket("127.0.0.1", 20000);

    // 클라이언트 데이터 송신처리
    OutputStream out = socket.getOutputStream();
    PrintWriter writer = new PrintWriter(out, true);

    // 클라이언트 데이터 수신처리
    InputStream in = socket.getInputStream();
    InputStreamReader isr = new InputStreamReader(in);
    BufferedReader reader = new BufferedReader(isr);

    new Client1Listener(reader).start();

    while (true) {
      String data = new Scanner(System.in).nextLine();
      writer.println(data);
      if(data.equals("!!")) break;
    }

//    String data2 = reader.readLine();
//    System.out.println(data2);
    
    socket.close();
  }
}