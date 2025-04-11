package TextRPG;

import java.util.Random;

public class Monster {
    private int hp;
    Random random = new Random();

    public Monster() {}
    public int getHp() {
        return hp;
    }
    public void setHp(int hp){
        if(hp>=0) {
            this.hp = hp;
        }
    }

    public void attack(Player p) {
        int playerHp = p.getHp();
        // max 함수 이용 난이도 조절
        // 최솟값 1로 설정
        int power = Math.max(1, (int) ((50 - playerHp) / 20));
        int damage = random.nextInt(power) +1;

        p.takeDamage(damage);
    }
    
    public void takeDamage(String type, int damage) {
        this.hp -= damage;
        System.out.printf("몬스터가 플레이어의 %s 공격에 %s만큼의 공격을 입었다!\n몬스터 남은 체력: %s",
                type, damage, this.hp);
    }
}
