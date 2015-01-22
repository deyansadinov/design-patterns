package task5.observerpattern;



/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public interface Subject {

  public void register(Observer o);
  public void unregister(Observer o);
  public void notifyObserver();
}
