package task3.poolpattern;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class MyPoolObject<T>  {


  private final int maxValue;

  private T object;
  private List<T> list;

  protected MyPoolObject(T object, int maxValue) {
    this.object = object;
    this.maxValue = maxValue;

    list = new ArrayList<>();

    initialize();
  }

  public void acquire() {
    if (list.size() != 0) {
      list.remove(object);
    } else {
      try {
        throw new IllegalStateException("Pool run out of free resources");
      }catch (IllegalStateException e){
        e.printStackTrace();
      }
    }
  }

  public void release() {
    if (list.size() > maxValue) {
      try {
        throw new OutOfResourcesException();
      } catch (OutOfResourcesException e) {
        e.printStackTrace();
      }
    } else {
      list.add(object);
    }
  }

  private void initialize() {

    for (int i = 0; i < maxValue; i++) {
      list.add(object);
    }
  }
}


