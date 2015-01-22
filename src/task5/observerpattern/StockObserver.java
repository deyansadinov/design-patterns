package task5.observerpattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class StockObserver implements Observer {

  private double ibmPrice;
  private double aaplPrice;
  private double googPrice;

  private static int observerIDTracker = 0;

  private int observerID;

  private final Subject stockGrabber;

  public StockObserver(Subject stockGrabber) {
    this.stockGrabber = stockGrabber;
    this.observerID = ++observerIDTracker;
    System.out.println("New Observer " + this.observerID);
    //register the new Observer to StockGrabber array list
    stockGrabber.register(this);
  }


  @Override
  public void update(double ibmPrice, double aaplPrice, double googPrice) {
    this.ibmPrice = ibmPrice;
    this.aaplPrice = aaplPrice;
    this.googPrice = googPrice;

    printThePrises();
  }

  private void printThePrises() {

    System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPLE: " + aaplPrice + "\nGOOG: " + googPrice  + "\n");
  }
}
