package ch09;

public class 연습문제01Main {
    public static void main(String[] args) {
        연습문제01 t1 = new 연습문제01(); // 기본 생성자
        t1.setBottom(100.0f);
        t1.setHeight(200.0f);
        float tArea1 = t1.getArea();
        System.out.println(tArea1);

        연습문제01 t2 = new 연습문제01(20f, 50f); // 매개변수 2개 생성자
        float tArea2 = t2.getArea();
        System.out.println(tArea2);
    }
}
