package TextRPG;

import java.util.Random;
import java.util.Scanner;

public class Game {
    // 전체에서 사용하는 메소드 선언
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    // 게임 제어를 위한 변수 선언
    private boolean win = false;
    private boolean gameover = false;


    // 객체 생성
    Player p = new Player(random, sc);
    Monster m = new Monster(p, random, sc);
    Display dp = new Display();

    // 실제 게임을 진행하는 메소드
    public void start() {
        dp.printPlayerStatus(p.getHp());
        dp.printMonsterStatus(m.getHp());

        while (true) {
            playerTurn();
            monsterTurn();
            if(checkBattleResult(p,m)) break;
        }
    }

    // 플레이어 턴
    public void playerTurn() {
        dp.print("플레이어의 행동을 선택하세요");
        dp.print("공격/ 방어 / 도망");
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
            dp.print("도망에 성공했다!");
        } else if(!isRun && isChase){
            dp.print("도망에 실패했다! 몬스터가 반격합니다.");
        }
    }

    // 배틀 결과 확인
    public boolean checkBattleResult(Player p, Monster m) {
        if(p.getHp() <= 0) {
            win = false;
            dp.printBattleResult(win);
            return gameover = true;
        } else if(m.getHp() <= 0) {
            win = true;
            dp.printBattleResult(win);
            return gameover = true;
        } else {
            return gameover = false;
        }
    }


}
