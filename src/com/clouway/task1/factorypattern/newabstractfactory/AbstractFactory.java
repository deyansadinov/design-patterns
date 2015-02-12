package com.clouway.task1.factorypattern.newabstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class AbstractFactory {

  public CarFactory getCarFactory(String type) {
    if ("BMW".equalsIgnoreCase(type)){
      return new GermanCarFactory();
    }else {
      return new ItalianCarFactory();
    }
  }
}
