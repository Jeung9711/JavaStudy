package ex;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1Exam {
  public static void main(String[] args) throws IOException {
    // 서버소켓 생성, 연결포트: 20000
    ServerSocket sSocket = new ServerSocket(20000);
    System.out.println("접속 대기중...");
    // 클라이언트 연결 수락
    Socket socket = sSocket.accept();
    System.out.println("접속 완료");

    // 접속한 소켓에서 데이터 가져오기
    InputStream in = socket.getInputStream();
    InputStreamReader isr = new InputStreamReader(in);
    BufferedReader reader = new BufferedReader(isr);

    // Thread 실행하는 함수
    new Server1Listener(reader).start();

    OutputStream out = socket.getOutputStream();
    PrintWriter writer = new PrintWriter(out, true);

    while (true) {
      String data = new Scanner(System.in).nextLine();
      writer.println(data);
      if(data.equals("!!")) break;
    }

    // 서버와의 연결 해제
    sSocket.close();
  }
}