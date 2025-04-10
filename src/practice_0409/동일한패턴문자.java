package practice_0409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 동일한패턴문자 {
    public static void main(String[] args) throws IOException {
        String address = "http://ggoreb.com/quiz/pattern.html";
        URL url = new URL(address);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
        String text = "";
        String data;
        while ((data = in.readLine()) != null) {
            text += data;
        }

        text = text.substring( text.lastIndexOf("<!--") );

        // ^ 부정을 의미
        Pattern p = Pattern.compile("[^A-Z][A-Z]{3}([a-z]{1})[A-Z]{3}[^A-Z]");
        Matcher m = p.matcher(text);

        while(m.find()) {
            // 소괄호로 묶인 녀석만 추출, 괄호안에 소괄호의 순번을 작성
            String result = m.group(1);
            System.out.print(result);
        }


    }
}
