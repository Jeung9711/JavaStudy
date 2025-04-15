package TextRPG;

public class Display {
    // 메세지 출력
    public void print(String message) {
        System.out.println(message);
    }

    // 플레이어 상태 출력
    public void printPlayerStatus(int hp) {
        System.out.println("Player HP : "+hp);
    }
    // 몬스터 상태 출력
    public void printMonsterStatus(int hp) {
        System.out.println("Monster HP : "+hp);
    }

    // 데미지 출력
    public void printDamage(int damage) {
        System.out.println(damage + "만큼의 데미지를 입었다!");
    }

    // 방어력 출력
    public void printDefend(int depend) {
        System.out.println("방어태세를 갖추었습니다!");
        System.out.println("방어력이 "+depend+" 증가했습니다.");
    }

    // 치료 출력
    public void printPlayerHeal(int heal) {
        System.out.println("회복했습니다.");
        System.out.println("HP가 "+heal+" 증가했습니다.");
    }

    // 배틀 결과 출력
    public void printBattleResult(boolean win) {
        if(win) {
            System.out.println("몬스터를 무찔렀습니다.");
            System.out.println("전투에서 승리하였습니다!");
        } else {
            System.out.println("전투에서 패배하였습니다.");
            System.out.println("게임이 종료됩니다.");
        }

    }
}
