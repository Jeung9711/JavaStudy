package ch12.smart_system;

public class WashingMachine extends SmartDevice implements Updatable{


    @Override
    public void operate() {
        System.out.println("세탁을 시작합니다.");
    }

    @Override
    public void updateSoftware() {
        System.out.println("세탁기 소프트웨어를 업데이트합니다.");
    }
}
