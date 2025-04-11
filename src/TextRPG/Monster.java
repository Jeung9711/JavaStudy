package TextRPG;

import java.util.Random;

public class Monster {
    int hp;
    Random random = new Random();

    public Monster() {}
    public Monster(int hp) {
        this.hp = hp;
    }

    public void attack(Player p) {
        int maxpower = (int) (p.hp /3);
        if(maxpower < 1) maxpower=1;

        int damage = random.nextInt(maxpower) +1;

        p.takeDamage(damage);
    }
    
    public int takeDamage(String type, int damage) {
        this.hp -= damage;
        System.out.printf("몬스터가 플레이어의 %s 공격에 %s만큼의 공격을 입었다!\n몬스터 남은 체력: %s",
                type,this.hp);
        return this.hp;
    }
}
