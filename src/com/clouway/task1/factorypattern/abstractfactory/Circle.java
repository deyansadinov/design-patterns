package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Circle is drawn");
  }
}
