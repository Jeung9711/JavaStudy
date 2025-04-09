package ch04;

import java.io.File;

public class Continue {
    public static void main(String[] args) {
        // Shift + Ctrl + F10 현재파일 실행
        File folder = new File("C:\\Users\\user\\Desktop\\LG CNS CAMP\\BE\\JAVA");
        File[] list = folder.listFiles();

        for(int i=0; i<list.length; i++) {
            File file = list[i];
            String name = file.getName();

            if(name.length() > 12) {
                // 파일 이름 길이가 12를 초과하면 continue
                // 아래 프린트는 실행하지 않고 for문 반복
                continue;
            }
            System.out.println(name);
        }
    }
}
