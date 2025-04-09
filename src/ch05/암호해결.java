package ch05;

public class 암호해결 {
    public static void main(String[] args) {
        String s = """
                g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.
                """;
        int len = s.length();
        // 특수문자, 공백 해결해서 완전한 문장으로 만들기
        for (int i=0; i< len; i++) {
            char c = s.charAt(i);
            c = (char) (c + 2); // char + int = int
            System.out.print(c);
        }
    }
}
