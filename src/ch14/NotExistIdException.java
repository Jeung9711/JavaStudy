package ch14;

public class NotExistIdException extends Exception{
    public NotExistIdException() {}
    public NotExistIdException(String msg) {
        super(msg);
    }
}
