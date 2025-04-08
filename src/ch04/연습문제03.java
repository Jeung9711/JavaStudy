package ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class 연습문제03 {
    public static void main(String[] args) {
        //창을 만드는 메소드
        JFrame j = new JFrame();
        JButton jb = new JButton();
        j.add(jb);
        jb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String link = "http://www.naver.com";
                try {
                    Desktop.getDesktop().browse(new URI(link));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
        j.setSize(300, 200);
        j.setVisible(true);
    }
}
