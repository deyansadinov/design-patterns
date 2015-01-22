package task5.observerpattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class GrabStocksDemo {
  public static void main(String[] args) {

    StockGrabber stockGrabber = new StockGrabber();

    StockObserver observer1 = new StockObserver(stockGrabber);

    stockGrabber.setAaplPrice(234.00);
    stockGrabber.setGoogPrice(123.00);
    stockGrabber.setIbmPrice(456.00);

    StockObserver observer2 = new StockObserver(stockGrabber);

    stockGrabber.setAaplPrice(234.00);
    stockGrabber.setGoogPrice(123.00);
    stockGrabber.setIbmPrice(456.00);

    //observer 1 is deleted and no longer receive update
    stockGrabber.unregister(observer1);

    stockGrabber.setAaplPrice(234.00);
    stockGrabber.setGoogPrice(123.00);
    stockGrabber.setIbmPrice(456.00);
  }
}
