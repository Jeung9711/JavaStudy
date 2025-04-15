package ch12;

public interface Remote {
    // 인터페이스에서 선언한 변수는 컴파일러가 상수로 변환
    // public static final String name
    String name = "동물"; // 변수가 아니라 상수

    // public abstract void sound();
    void sound();
}
