package TextRPG;

public class Player {
    // 플레이어 기본 정보 설정
    int hp;

    public Player() {

    }
    public Player(int hp) {
        this.hp = hp;
    }

    public void attack(Monster m, String type) {
        String attacktype = type;
        int power = 0;

        if(attacktype.equals("베기")) {
            power = (int) (Math.random()*5 +1);
        }else if(attacktype.equals("찌르기")) {
            power = (int) (Math.random()*3 +1);
        }

        m.takeDamage(type,power);
    }

    public int takeDamage(int damage) {
        this.hp -= damage;
        System.out.printf("플레이어가 몬스터의 공격에 %s만큼의 데미지를 입었다!\n플레이어의 남은 체력: %s\n",
                damage, this.hp);
        return this.hp;
    }
}
