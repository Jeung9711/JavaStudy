package TextRPG;

import java.util.Random;
import java.util.Scanner;

public class Game {
    // 전체에서 사용하는 메소드 선언
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    // 객체 생성
    Player p = new Player(random, sc);
    Monster m = new Monster(p, random, sc);
    boolean result = true;

    // 실제 게임을 진행하는 메소드
    public void start() {
        printStatus();

        while (result) {
            playerTurn();
            monsterTurn();
            if(!checkBattleResult(p,m)) break;
        }
    }

    // 상태 출력
    public void printStatus() {
        System.out.printf("플레이어 체력: %s\n몬스터 체력: %s\n", p.getHp(), m.getHp());
    }

    // 플레이어 턴
    public void playerTurn() {
        System.out.println("플레이어의 행동을 선택하세요");
        System.out.println("공격/ 방어 / 도망");
        String action = sc.next();
        p.chooseAction(action);
        handleRun(p.isRun(), m.isChase());
    }
    // 몬스터 턴
    public void monsterTurn() {
        m.checkHeal();
        m.attack(p);
    }

    // 도망 판정
    public void handleRun(boolean isRun, boolean isChase) {
        if(isRun && !isChase) {
            System.out.println("도망에 성공했다!");
            p.setIsRun(false);
            m.setIsChase(false);
        } else if(!isRun && isChase){
            System.out.println("도망에 실패했다! 전투에 집중하자");
        }
    }

    // 배틀 결과 확인
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
