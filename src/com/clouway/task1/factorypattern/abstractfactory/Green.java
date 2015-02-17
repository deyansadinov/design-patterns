package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Green implements Color {
  @Override
  public void fill() {
    System.out.println("Green");
  }
}