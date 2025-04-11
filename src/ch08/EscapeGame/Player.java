package ch08.EscapeGame;

public class Player {
    // 플레이어의 이름
    String name;

    // 열쇠 보유 여부
    boolean hasKey;

    // 열쇠를 줍는 기능
    void pickUpKey(Room room) {
        // TODO: 열쇠를 주웠을 때 상태 변경 및 메시지 출력
        System.out.println("열쇠를 얻었다!");
        hasKey = true;
        tryToOpenDoor(room);
    }

    // 문을 열려고 시도하는 기능
    void tryToOpenDoor(Room room) {
        // TODO: 열쇠 보유 여부에 따라 문을 열 수 있는지 결정
        System.out.println("문을 열어보자");
        room.openDoor(hasKey);
    }
}
