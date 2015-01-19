package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Door implements House {
  @Override
  public void getPart() {
    System.out.println("The door is installed and ready for use");
  }
}
