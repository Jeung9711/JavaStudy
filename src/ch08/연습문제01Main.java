package ch08;

public class 연습문제01Main {
    public static void main(String[] args) {
        연습문제01 e = new 연습문제01();
        e.images = new String[] { "a.jpg", "b.jpg" };
        e.shopName = "국제밀면";
        e.shopDesc = "부산 3대 밀면 전문점";
        e.tel = "051-501-5507";
        e.address = "부산광역시 연제구 거제1동";
        e.hit = 5451;

        System.out.println(e);

        연습문제01 e2 = new 연습문제01();
        System.out.println(e2);
    }
}
