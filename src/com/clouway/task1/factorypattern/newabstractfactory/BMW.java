package com.clouway.task1.factorypattern.newabstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class BMW implements Car {
  @Override
  public String topSpeed() {
    return "300";
  }
}