package ch14;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 연습문제01 {
    public static void main(String[] args) {
        Connection con = Jsoup.connect("http://ggoreb.com/lg");
        try {
            Document doc = con.get();
            Elements eles = doc.select("a");
            Element ele = eles.get(0);  // 첫번째 a태그 요소
            String text = ele.text();
            System.out.println(text); // 메모장 출력
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("소나기.txt"));
            String text = "";
            while (true) {
                String data = reader.readLine();
                if (data == null) break;
                text += data + "\n";
            }
            System.out.println(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
