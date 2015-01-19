package com.clouway.task1.factorypattern.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method");
  }
}
