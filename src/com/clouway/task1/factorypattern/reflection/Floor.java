package com.clouway.task1.factorypattern.reflection;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Floor implements HouseParts {
  @Override
  public void getPart(String type) {
    System.out.println("The floor is ready for use");
  }
}
