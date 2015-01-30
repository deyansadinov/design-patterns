package task4.proxypattern.proxy;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class ProxyInteger implements Integer {

  private final int number;

  public ProxyInteger(int number) {
    this.number = number;
  }

  @Override
  public void printNumber() {
    RealInteger realInteger = new RealInteger(number);
    realInteger.printNumber();
  }
}
