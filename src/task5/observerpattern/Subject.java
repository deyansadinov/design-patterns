package task5.observerpattern;


/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public interface Subject {

  void register(Observer o);

  void unregister(Observer o);

  void notifyObserver();
}
