package task2.test.singleton;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Demo {
  public static void main(String[] args) {
    SingleObject object = SingleObject.getInstance();
    object.showMessage();
  }
}
