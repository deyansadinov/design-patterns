package task4.proxypattern.proxy;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class RealInteger implements Integer {

  private final int number;

  public RealInteger(int number) {
    this.number = number;
    loadFromDisk(number);
  }

  private void loadFromDisk(int number) {
    System.out.println("Loading " + number);
  }

  @Override
  public void printNumber() {
    System.out.println("Displaying " + number);
  }
}
