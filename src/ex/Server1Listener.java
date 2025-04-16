package ex;

import java.io.BufferedReader;
import java.io.IOException;

public class Server1Listener extends Thread {
    // 클아이언트 입력을 처리하는 로직 클래스화
    BufferedReader reader;
    public Server1Listener(BufferedReader reader) {
        this.reader = reader;
    }
    @Override
    public void run() {
        while (true) {
            String data = null;
            try {
                data = reader.readLine();
                System.out.println(data);
                if(data == "null") break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
