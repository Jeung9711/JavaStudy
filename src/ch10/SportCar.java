package ch10;

public class SportCar extends Car {
    char color = 'R';

    SportCar() {
        System.out.println("SportsCar 객체 생성");
    }
    void openSunloof() {
        System.out.println("썬루프 열림");
    }

    public static void main(String[] args) {
        SportCar sc = new SportCar();
        sc.move();
        sc.openSunloof();
        System.out.println(sc.getDoor());
        System.out.println(sc.getTire());
        System.out.println(sc.toString());
    }
}
