package ch12.smart_system;

public abstract class SmartDevice {
  protected boolean power;

  public void turnOn() {
    power = true;
    System.out.println("전원이 켜졌습니다.");
  }

  public void turnOff() {
    power = false;
    System.out.println("전원이 꺼졌습니다.");
  }

  public abstract void operate();

}
