package newtask5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class AvailableProducts implements ProductListener {

  private List<Product> listAvailableProducts = new ArrayList<Product>();

  public List<Product> getListAvailableProducts() {
    return listAvailableProducts;
  }

  @Override
  public void onProductRegistered(Product product) {
    listAvailableProducts.add(product);
  }

  @Override
  public void onProductSold(Product product) {
    if (listAvailableProducts.contains(product)){
      listAvailableProducts.remove(product);
    }
  }
}
