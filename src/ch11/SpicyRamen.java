package ch11;

public class SpicyRamen extends Ramen {
    public SpicyRamen(String name) {
        super.name = name;
    }

    @Override
    public String getTaste() {
        return "매운 라면맛";
    }
}
