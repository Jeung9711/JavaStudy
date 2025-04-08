package ch02;

public class 연습문제02 {
    public static void main(String[] args) {
        int 소프트웨어설계 = 77;
        int 소프트웨어개발 = 50;
        int 데이터베이스구축 = 61;
        int 프로그래밍언어활용 = 69;
        int 정보시스템구축 = 45;
        int 점수 = 소프트웨어설계 + 소프트웨어개발 +
                데이터베이스구축 + 프로그래밍언어활용 + 정보시스템구축;
        float 평균 = (float) (점수)/5;
        System.out.println("정보처리기사 필기시험 결과");
        System.out.printf("점수 : %s, 평균 : %.1f", 점수, 평균);
    }
}
