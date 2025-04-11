package ch08.EscapeGame;

public class Room {
    // 문이 열렸는지 여부
    boolean doorOpen = false;

    // 문을 여는 기능
    void openDoor(Boolean haskey) {
        // TODO: 문을 열고 메시지 출력
        if(haskey) {
            System.out.println("문이 열립니다.\n탈출!!");
        } else {
            System.out.println("문이 열리지 않습니다.");
        }
    }
}
