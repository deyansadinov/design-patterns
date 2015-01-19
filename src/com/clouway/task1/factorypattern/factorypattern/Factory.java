package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Factory {
  public static AbstractFactory getFactory(String factory){
    if (factory.equals("houseParts")){
      return new HousePartsFactory();
    }
    return null;
  }
}
