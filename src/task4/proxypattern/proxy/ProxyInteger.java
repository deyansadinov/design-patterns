package task4.proxypattern.proxy;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class ProxyInteger implements Integer {

  private final int number;
  private RealInteger realInteger;

  public ProxyInteger(int number) {
    this.number = number;
  }

  @Override
  public void printNumber() {
    if (realInteger == null){
      realInteger = new RealInteger(number);
    }
    realInteger.printNumber();
  }




}
