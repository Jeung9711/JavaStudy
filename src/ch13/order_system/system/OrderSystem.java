package ch13.order_system.system;

public class OrderSystem {

  public String storeName = "Delivery Restaurant";
  int orderCount = 0;

  public void placeOrder(String menu) {
    System.out.println(menu + " order placed");
    orderCount++;
  }

  protected void resetOrders() {
    orderCount = 0;
  }

  protected int getOrderCount() {
    return orderCount;
  }
}
