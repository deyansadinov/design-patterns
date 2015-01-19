package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Window implements House {
  @Override
  public void getPart() {
    System.out.println("The window is installed");
  }
}
