package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Blue implements Color {
  @Override
  public void fill() {
    System.out.println("Blue");
  }
}
