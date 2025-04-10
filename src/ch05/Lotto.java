package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lotto {
    public static void main(String[] args) throws IOException {
        // 서버통신으로 받아와서 해결하기
        String address = "https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1";
        URL url = new URL(address);
        InputStream in = url.openStream();
        InputStreamReader isr = new InputStreamReader(in, "euc-kr");
        BufferedReader reader = new BufferedReader(isr);

        String text = "";
        while (true) {
            String data = reader.readLine(); //한줄씩 데이터 가져오기
            if (data == null) break;
            text += data + "\n";
        }

        // 필요한 요소 추출하기
        int start = text.indexOf("class=\"num win\"");
        int end = text.indexOf("</div>", start);
        text = text.substring(start, end);
        System.out.println(text);

        // () 안의 항목만 group으로 추출 가능
        Pattern p = Pattern.compile(">([0-9]+)<");
        Matcher m = p.matcher(text);

        while (m.find()) {
            String result = m.group(1);
            System.out.println(result);
        }
    }
}
