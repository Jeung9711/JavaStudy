package ch12;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


// 내꺼 클래스가 MouseListener인 척 하려고 상속
class 내꺼 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("click");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
// 인터페이스 상속
public class TriangleImpl implements IFigure {

    @Override
    public void area(int x, int y) {

    }

    public static void main(String[] args) {
        JFrame j = new JFrame();
        JButton btn = new JButton();
        MouseListener 변수 = new 내꺼();
        btn.addMouseListener(변수);

        j.add(btn);
        j.setSize(300,200);
        j.setVisible(true);
    }
}
