package ch07;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class Json {
    //외부 라이브러리 사용하기
    public static void main(String[] args) throws IOException {
        String[] names = {"김길동","홍길동","류재관"};

        // 문자열을 Json으로 변환하는 메소드
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(names);
        System.out.println(json);

        // html 로또 번호 Json으로 변환하기
        String address = "http://ggoreb.com/api/lotto.jsp";
        URL url = new URL(address);
        Map map = om.readValue(url, Map.class);
        System.out.println(map);
    }
}
