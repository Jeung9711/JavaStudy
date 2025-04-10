package ch05;

public class Performance {
    public static void main(String[] args) {
        // String과 StringBuffer와 StringBuilder 속도 비교
        long start = 0L;
        long end = 0L;

        String s = "";
        start = System.currentTimeMillis(); // UNIX TIME
        for (int i = 0; i < 50000; i++) {
            s += i;
        }
        end = System.currentTimeMillis();
        System.out.println("String : " + (end - start));

        // Thread Safe
        StringBuffer sb = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            sb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer : " + (end - start));

        StringBuilder bb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            bb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (end - start));
    }
}
