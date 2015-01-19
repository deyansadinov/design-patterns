package com.clouway.task1.factorypattern.reflection;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class HousePartsFactory {

  public HouseParts getHouseParts(String type) {
    if (type.equals("window")) {
      try {
        return Window.class.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    if (type.equals("door")) {
      try {
        return Door.class.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    if (type.equals("floor")){
      try {
        return Floor.class.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    return null;
  }
}


