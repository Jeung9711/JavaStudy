package practice_0409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 김첨지 {
    public static void main(String[] args) throws IOException {
        String name = URLEncoder.encode("운수좋은날","utf-8");
        String address = "http://ggoreb.com/quiz/"+name+".txt";

        URL url = new URL(address);
        InputStream in = url.openStream();
        InputStreamReader isr = new InputStreamReader(in, "euc-kr");
        BufferedReader reader = new BufferedReader(isr);

        String text = "";
        while (true) {
            String data = reader.readLine();
            if(data == null) break;
            text += data + "\n";
        }

        // 정규 표현식을 이용해 공백이 있는 값도 찾기
        // \\s* : 공백 문자 0개 이상
//        Pattern p = Pattern.compile("(김\\s*첨\\s*지)");
        Pattern p = Pattern.compile("김[ ]*첨[ ]*지");
        Matcher m = p.matcher(text);

        int count = 0;
        while (m.find()) {
            count++;
            String result = m.group();
            System.out.println(result);
        }
        System.out.println(count);
    }
}
