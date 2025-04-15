package ch14;

public class CheckException extends Exception {
    // 매개변수 없는 기본 생성자
    public CheckException() {

    }
    // 매개변수 한개짜리 생성자
    public CheckException(String message) {
        super(message);
    }
}
