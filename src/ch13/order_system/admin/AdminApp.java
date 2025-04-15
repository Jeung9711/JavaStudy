package ch13.order_system.admin;

import ch13.order_system.system.OrderSystem;

public class AdminApp extends OrderSystem {
  public static void main(String[] args) {
    // 같은 패키지나 상속 관계 클래스 내부여야 접근 가능
    // -> OrderSystem을 Admin이라 상속도 아님
    AdminApp os = new AdminApp();

    // 매장명 확인
    System.out.println(os.storeName);
    // 피자 주문
    os.placeOrder("Pizza");
    // 햄버거 주문
    os.placeOrder("hamburger");
    // 주문량 확인
    int count = os.getOrderCount();
    System.out.println(count);
    // 주문량 초기화
  }
}
