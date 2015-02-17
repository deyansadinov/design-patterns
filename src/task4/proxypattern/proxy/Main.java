package task4.proxypattern.proxy;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {

    final Integer integer1 = new ProxyInteger(5);
    final Integer integer2 = new ProxyInteger(6);

    //number will be loaded from disk
    integer1.printNumber();
    System.out.println("");
    integer2.printNumber();
    System.out.println("");

    //number will not be load from disk
    integer1.printNumber();
    integer2.printNumber();
  }
}
