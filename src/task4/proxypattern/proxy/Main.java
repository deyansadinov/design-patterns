package task4.proxypattern.proxy;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {

    Integer integer = new ProxyInteger(5);

    //number will be loaded from disk
    integer.printNumber();
    System.out.println("");

    //number will not be load from disk
    integer.printNumber();

  }
}
