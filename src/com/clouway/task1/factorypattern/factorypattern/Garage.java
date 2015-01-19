package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Garage implements House {
  @Override
  public void getPart() {
    System.out.println("The garage is build and ready for use");
  }
}
