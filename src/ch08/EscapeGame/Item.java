package ch08.EscapeGame;

public class Item {
    // 아이템 이름
    String name;

    // 열쇠가 들어있는지 여부
    boolean hasKey;

    // 아이템을 조사하는 기능
    void check(Player player,Room room) {
        // TODO: 열쇠가 있다면 플레이어에게 전달, 없다면 메시지 출력
        System.out.println(name+" 조사중");
        if(hasKey) {
            System.out.println(name+"에서 열쇠를 주웠다!");
            player.pickUpKey(room);
        } else {
            System.out.println("아무것도 얻지 못했다...");
        }
    }
}
