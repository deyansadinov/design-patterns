package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Producer {
  public static AbstractFactory getFactory(String choice){
    if (choice.equalsIgnoreCase("SHAPE")){
        return new ShapeFactory();
    }
    if (choice.equalsIgnoreCase("COLOR")){
      return new ColorFactory();
    }
    return null;
  }
}
