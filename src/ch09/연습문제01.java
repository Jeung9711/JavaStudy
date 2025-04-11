package ch09;

public class 연습문제01 {
    float bottom;
    float height;

    // ① 기본 생성자 작성
    public 연습문제01 () {} // 생성자를 직접 생성하면 기본 생성자 자동 생성 안함

    // ② 매개변수 2개 생성자 작성
    public 연습문제01 (float bottom, float height) {
        // 변수명이 같아서 오류 발생, this 사용
        this.bottom = bottom;
        this.height = height;
    }

    // ③ getArea 메소드 작성
    public Float getArea () {
        return bottom*height;
    }

    // ④ bottom과 height의 setter 메소드 작성
    public void setBottom (float bottom) {
        this.bottom = bottom;
    }

    public void setHeight (float height) {
        this.height = height;
    }
}