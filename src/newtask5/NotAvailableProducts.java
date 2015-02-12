package newtask5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class NotAvailableProducts implements ProductObserver {

  private List<Product> listSoldProducts = new ArrayList<Product>();

  public List<Product> getListSoldProducts() {
    return listSoldProducts;
  }

  @Override
  public void onProductRegistered(Product product) {
    if (listSoldProducts.contains(product)){
      listSoldProducts.remove(product);
    }
  }

  @Override
  public void onProductSold(Product product) {
    listSoldProducts.add(product);
  }
}
