package task4.proxypattern.proxy;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class ProxyInteger implements Integer {

  private RealInteger numb = null;
  private final int number;

  public ProxyInteger(final int number) {
    this.number = number;
  }

  @Override
  public void printNumber() {
    if (numb == null){
      numb = new RealInteger(number);
    }
    numb.printNumber();
  }
}
