package TextRPG;

public class Player {
    // 플레이어 기본 정보 설정
    private int hp;

    public Player() {
    }

   // hp를 private 취급하여 getter, setter사용
   public int getHp() {
        return hp;
   }
   public void setHp(int hp) {
        if(hp>=0)
            this.hp = hp;
   }

    public void attack(Monster m, String type) {
        String attacktype = type;
        int power = 0;

        switch (type) {
            case "베기":
                power = (int) (Math.random() + 5 + 1);
                break;
            case "찌르기":
                power = (int) (Math.random() * 3 + 1);
                break;
            default:
                System.out.println("알 수 없는 공격입니다. 공격이 무효처리 됩니다.");
                break;
        }
        m.takeDamage(type, power);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.printf("플레이어가 몬스터의 공격에 %s만큼의 데미지를 입었다!\n플레이어의 남은 체력: %s\n",
                damage, this.hp);
    }
}
