package TextRPG;

import java.util.Random;
import java.util.Scanner;

public class Player {
    // 플레이어 기본 정보 설정
    private int hp;
    private int dependence;
    private boolean isDepende = false;
    private static final int RUN_PROBABILITY = 8;

    private Random random;
    private Scanner sc;
    Monster m =new Monster();
    Display dp = new Display();

    public Player() {}
    public Player(Random random, Scanner sc) {
        this.random = random;
        this.sc = sc;
        hp = Math.max(30, random.nextInt(51));
    }

   // private 변수 설정
   public int getHp() {
        return hp;
   }

   public void chooseAction(String action) {
        switch (action) {
            case "공격":
                dp.print("공격을 선택하세요. 베기/찌르기");
                String type = sc.next();
                attack(m,type);
                break;
            case "방어":
                defend();
                break;
            case "아이템 사용":
                break;
            case "도망":
                isRun();
                break;
        }
   }

   // 공격
    public void attack(Monster m, String type) {
        int power = 0;

        switch (type) {
            case "베기":
                power = (int) (Math.random() + 5) + 1;
                break;
            case "찌르기":
                power = (int) (Math.random() * 3) + 1;
                break;
            default:
                dp.print("알 수 없는 공격입니다. 공격이 무효처리 됩니다.");
                break;
        }
        m.takeDamage(type, power);
    }

    // 공격 받기
    public void takeDamage(int damage) {
        if(isDepende) {
            if(damage > dependence) {
                damage = damage - dependence;
            }
            else if(damage <= dependence) {
                damage = 0;
            }
        }
        hp -= damage;
        dp.printDamage(damage);
        dp.printPlayerStatus(hp);
    }

    // 방어
    public void defend() {
        isDepende = true;
        dependence = Math.min(3,(int) (hp/10));
        dp.printDefend(dependence);
    }

    // 힐
    public void heal() {

    }

    // 도망 확률 계산
    public boolean isRun() {
        int tryRun = random.nextInt(10);
        return tryRun <= RUN_PROBABILITY;
    }

}
