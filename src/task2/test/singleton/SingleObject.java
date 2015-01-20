package task2.test.singleton;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class SingleObject {

  private static SingleObject instance = new SingleObject();

  private SingleObject(){}

  public static SingleObject getInstance(){
    return instance;
  }

  public void showMessage(){
    System.out.println("Hello World");
  }
}
