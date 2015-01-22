package task5.observerpattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public interface Observer {

  public void update(double ibmPrice,double aaplPrice,double googPrice);
}
