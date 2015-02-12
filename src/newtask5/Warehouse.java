package newtask5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Warehouse {

  private List<ProductObserver> productObserverList = new ArrayList<ProductObserver>();

  public void saleProduct(Product product){
    notifySale(product);
  }


  public void registerProduct(Product product){
    notifyRegistration(product);
  }


  public void addListener(ProductObserver productObserver){
    productObserverList.add(productObserver);
  }

  private void notifySale(Product product) {
    for (ProductObserver listener : productObserverList){
      listener.onProductSold(product);
    }
  }

  private void notifyRegistration(Product product) {
    for (ProductObserver listener : productObserverList){
      listener.onProductRegistered(product);
    }
  }
}
