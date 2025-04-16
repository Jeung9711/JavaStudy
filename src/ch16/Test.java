package ch16;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("c:/java");
        if(!file.isDirectory()) {
            // 폴더 없으면 생성
            file.mkdirs();
        }else {
            file.delete();
        }
    }
}
