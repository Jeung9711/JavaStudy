package ch12.smart_system;

public class Main {
  public static void main(String[] args) {
    SmartDevice[] devices = {
            // WashingMachine 객체 생성
            new WashingMachine(),   // 변수명은 SmartDevice[0]
            // AirConditioner 객체 생성
            new AirConditioner()
    };

    for (SmartDevice d : devices) {
      // 전원 ON
      d.turnOn();
      // 기기 동작
d.operate();
      // 기기 업데이트
      // smartDevice는 updateSoftware가 없으므로 형변환
      if(d instanceof WashingMachine) {
        ((WashingMachine) d).updateSoftware();
      } else if (d instanceof AirConditioner) {
        ((AirConditioner) d).updateSoftware();
      }

      // 그냥 updatable로 형변환하여 둘다 사용
      ((Updatable) d).updateSoftware();

      // 전원 OFF
      d.turnOff();
    }
  }
}
