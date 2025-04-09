package ch05;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 소나기2 {
    public static void main(String[] args) throws IOException {
        // 서버통신으로 받아와서 해결하기
        String word = URLEncoder.encode("소나기", "utf-8");
        String address = "http://ggoreb.com/quiz/"+word+".txt";
        URL url = new URL(address); // 통신 실패시 메서드 추가

        // 한글자씩 데이터 읽어오기
        InputStream in = url.openStream(); // 데이터 읽어오기

        // 한줄씩 데이터 읽어오도록 stream을 reader로 변환
        // encoding 에러 발생 시 charset 시도
        InputStreamReader isr = new InputStreamReader(in, "euc-kr");
        BufferedReader reader = new BufferedReader(isr);  // 성능이 좋은 reader로 변환
        String text = "";

        while (true) {
            String data = reader.readLine(); //한줄씩 데이터 가져오기
            if(data==null) break;
            text += data + "\n";
        }

//        System.out.println(text);

        // 소나기 정규표현식으로 검사하기
        Pattern p = Pattern.compile("소나기");
        Matcher m = p.matcher(text);

        while (m.find()) {
            String result = m.group();
            System.out.println(result);
        }
    }
}
