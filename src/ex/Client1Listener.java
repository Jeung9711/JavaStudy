package ex;

import java.io.BufferedReader;
import java.io.IOException;

public class Client1Listener extends Thread {
    // 클아이언트 입력을 처리하는 로직 클래스화
    BufferedReader reader;
    public Client1Listener(BufferedReader reader) {
        this.reader = reader;
    }
    @Override
    public void run() {
        while (true) {
            String data = null;
            try {
                data = reader.readLine();
                System.out.println(data);
                if(data.equals("!!")) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
