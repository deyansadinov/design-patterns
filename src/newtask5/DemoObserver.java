package newtask5;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class DemoObserver {
  public static void main(String[] args) {
    AvailableProducts statisticsAvailable = new AvailableProducts();
    NotAvailableProducts statisticsSold = new NotAvailableProducts();

    Warehouse warehouse = new Warehouse();
    warehouse.addListener(statisticsAvailable);
    warehouse.addListener(statisticsSold);

    Apple apple = new Apple();
    Lemon lemon = new Lemon();

    warehouse.registerProduct(apple);
    warehouse.registerProduct(lemon);

    System.out.println("In the warehouse we have ");
    for (Product product : statisticsAvailable.getListAvailableProducts()){
      product.printName();
    }

    warehouse.saleProduct(lemon);
    System.out.println("There is no more of ");
    for (Product product : statisticsSold.getListSoldProducts()){
      product.printName();
    }
  }
}
