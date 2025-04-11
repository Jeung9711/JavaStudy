package TextRPG;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Random random = new Random();
    Player p = new Player(random);
    Monster m = new Monster(random);
    boolean result = true;
    Scanner sc = new Scanner(System.in);

    // 실제 게임을 진행하는 메소드
    public void start() {
        printStatus();

        while (result) {
            playerTurn();
            monsterTurn();
            if(!checkBattleResult(p,m)) break;
        }
    }

    public void printStatus() {
        System.out.printf("플레이어 체력: %s\n몬스터 체력: %s\n", p.getHp(), m.getHp());
    }

    public void playerTurn() {
        System.out.println("플레이어의 공격을 선택하세요\n 베기 / 찌르기");
        String type = sc.next();
        p.attack(m, type);
    }
    public void monsterTurn() {
        m.attack(p);
    }

    public boolean checkBattleResult(Player p, Monster m) {
        if(p.getHp() <= 0) {
            System.out.println("전투에서 패배하였습니다!");
            System.out.println("플레이어의 패배로 게임이 종료되었습니다.");
            return false;
        } else if(m.getHp() <= 0) {
            System.out.println("몬스터를 무찔렀습니다.");
            System.out.println("전투에서 승리하셨습니다!");
            return false;
        } else {
            return true;
        }
    }
}
