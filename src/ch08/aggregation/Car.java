package ch08.aggregation;

import ch08.inheritance.Machine;

public class Car extends Machine {
  private Engine engine;
  private Tire tire;
  private Handle handle;

  public Car() {
    engine = new Engine();
    tire = new Tire();
    handle = new Handle();
  }

  public void drive() {
    engine.run();
    tire.roll();
    handle.turn();
    System.out.println("자동차가 주행합니다.");
  }
}