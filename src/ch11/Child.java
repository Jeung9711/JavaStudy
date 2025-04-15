package ch11;

public class Child extends Parent {
    @Override // annotation 자바 컴파일러에게 알려주는 주석
    public void run() {
        System.out.println("Child run");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.run();
    }
}
