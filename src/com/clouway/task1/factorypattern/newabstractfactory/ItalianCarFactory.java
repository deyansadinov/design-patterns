package com.clouway.task1.factorypattern.newabstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class ItalianCarFactory implements CarFactory {
  @Override
   public Car getCar(String type) {
    if ("RENAULT".equalsIgnoreCase(type)) {
      return new Renault();
    }else {
      return new Fiat();
    }
  }
}
