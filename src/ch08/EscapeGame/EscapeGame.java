package ch08.EscapeGame;

public class EscapeGame {
    public static void main(String[] args) {
        // TODO: 객체 생성 및 게임 흐름 구성
        // 예: 아이템 조사 → 열쇠 획득 → 문 열기 시도

        Player player = new Player();
        player.name = "최요원";

        Room room = new Room();
        player.tryToOpenDoor(room);

        Item desk = new Item();
        desk.name = "책상";
        desk.hasKey = false;

        Item box = new Item();
        box.name = "상자";
        box.hasKey = true;



        desk.check(player, room);
        box.check(player, room);


    }
}
