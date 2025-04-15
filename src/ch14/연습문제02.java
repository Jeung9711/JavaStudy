package ch14;

public class 연습문제02 {
    public static void main(String[] args) {
        연습문제02 e = new 연습문제02();

        try {
            e.login("white", 1234); // ① 예외처리
        } catch (NotExistIdException ex) {
            throw new RuntimeException(ex);
        } catch (WrongPasswordException ex) {
            throw new RuntimeException(ex);
        }
        try {
            e.login("blue", 4321); // ② 예외처리
        } catch (NotExistIdException ex) {
            throw new RuntimeException(ex);
        } catch (WrongPasswordException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void login(String id, int pw)
            throws NotExistIdException, WrongPasswordException{
        if(!id.equals("blue")) {
            // ④ NotExistIdException 예외 발생시키기
            throw new RuntimeException();
        }
        if(pw != 1234) {
            // ⑤ WrongPasswordException 예외 발생시키기
            throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
        }
    }
}
