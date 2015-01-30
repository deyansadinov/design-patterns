package newtask5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Warehouse {

  private List<ProductListener> productListenerList = new ArrayList<ProductListener>();

  public void saleProduct(Product product){
    notifySale(product);
  }


  public void registerProduct(Product product){
    notifyRegistration(product);
  }


  public void addListener(ProductListener productListener){
    productListenerList.add(productListener);
  }

  private void notifySale(Product product) {
    for (ProductListener listener : productListenerList){
      listener.onProductSold(product);
    }
  }

  private void notifyRegistration(Product product) {
    for (ProductListener listener : productListenerList){
      listener.onProductRegistered(product);
    }
  }
}
