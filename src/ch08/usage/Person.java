package ch08.usage;

import ch08.aggregation.Car;

public class Person {
  public String name;

  public Person(String name) {
    this.name = name;
  }

  public void driveCar() {
    Car car = new Car();
    car.start();     // Machine에서 상속된 메서드
    car.drive();     // Car의 메서드
    car.stop();      // Machine에서 상속된 메서드
  }
}