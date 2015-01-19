package com.clouway.task1.factorypattern.reflection;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Door implements HouseParts {
  @Override
  public void getPart(String type) {
    System.out.println("The door is installed and ready for use");
  }
}
