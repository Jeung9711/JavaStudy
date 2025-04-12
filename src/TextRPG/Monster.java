package TextRPG;

import java.util.Random;
import java.util.Scanner;

public class Monster {
    // 몬스터 기본 정보
    private int hp;
    private int startHp;
    private boolean isChase = false;
    private boolean healUsed = false;
    private Random random;
    private Scanner sc;

    // 생성자
    public Monster() {}
    public Monster(Player p, Random random, Scanner sc) {
        this.random = random;
        this.sc = sc;

        int playerHp = p.getHp();
        int bonus = random.nextInt(21) + 10;
        hp = playerHp + bonus;
        startHp = hp;
    }

    public int getHp() {
        return hp;
    }
    public void setIsChase(boolean isChase) {
        this.isChase = isChase;
    }

    // 공격
    public void attack(Player p) {
        int playerHp = p.getHp();
        // max 함수 이용 난이도 조절
        // 최솟값 1로 설정
        int power = Math.max(1, (int) ((50 - playerHp) / 20));
        int damage = random.nextInt(power) +1;

        p.takeDamage(damage);
    }

    // 공격 받기
    public void takeDamage(String type, int damage) {
        hp -= damage;
        System.out.printf("몬스터가 플레이어의 %s 공격에 %s만큼의 공격을 입었다!\n몬스터 남은 체력: %s\n",
                type, damage, hp);
    }

    // 추격 확률 계산
    public boolean isChase() {
        int tryChase = random.nextInt(11);
        if(tryChase > 8) isChase = true;

        return isChase;
    }

    // 치료
    public void checkHeal() {
        if(hp < startHp*0.3 && !healUsed) {
            int canHeal = random.nextInt(100);
            if(canHeal < 30) {
                hp = hp + (int) (startHp * 0.5);
                healUsed = true;
            }
        }
    }

}
