package ch13.order_system.user;

import ch13.order_system.system.OrderSystem;

public class UserApp {
  public static void main(String[] args) {
    OrderSystem os = new OrderSystem();
    // 매장명 확인
    System.out.println(os.storeName);
    // 치킨 주문
    os.placeOrder("chiken");
  }
}
