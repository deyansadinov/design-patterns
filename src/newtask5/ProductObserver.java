package newtask5;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public interface ProductObserver {

  void onProductRegistered(Product product);

  void onProductSold(Product product);
}
