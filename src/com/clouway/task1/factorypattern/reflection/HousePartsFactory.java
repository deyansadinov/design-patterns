package com.clouway.task1.factorypattern.reflection;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class HousePartsFactory {

  public HouseParts getHouseParts(String type) {

    try {
      return (HouseParts) Class.forName("com.clouway.task1.factorypattern.reflection." + type).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
}


