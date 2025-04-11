package TextRPG;

import java.util.Scanner;

public class Game {

    // 실제 게임을 진행하는 메소드
    public void start() {
        Player p = new Player();
        p.hp = 30;
        Monster m = new Monster();
        m.hp = 50;
        boolean result = true;

        while (result) {
            System.out.printf("플레이어 체력: %s\n몬스터 체력: %s\n", p.hp, m.hp);

            Scanner sc = new Scanner(System.in);
            System.out.println("플레이어의 공격을 선택하세요\n 베기 / 찌르기");
            String type = sc.next();
            p.attack(m,type);
            m.attack(p);

            result = checkBattleResult(p,m);
        }
    }

    public boolean checkBattleResult(Player p, Monster m) {
        if(p.hp <= 0) {
            System.out.println("전투에서 패배하였습니다!");
            System.out.println("플레이어의 패배로 게임이 종료되었습니다.");
            return false;
        } else if(m.hp <= 0) {
            System.out.println("전투에서 승리하셨습니다!");
            System.out.println("몬스터를 무찔렀습니다.");
            return false;
        } else {
            return true;
        }
    }
}
