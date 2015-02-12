package com.clouway.task1.factorypattern.newabstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class GermanCarFactory implements CarFactory {

  @Override
  public Car getCar(String type) {
    if ("BMW".equalsIgnoreCase(type)){
      return new BMW();
    }else {
      return new VW();
    }
  }
}
