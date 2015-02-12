package com.clouway.task1.factorypattern.newabstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Demo {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = new AbstractFactory();

    CarFactory carFactory1 = abstractFactory.getCarFactory("BMW");
    Car car1 = carFactory1.getCar("BMW");
    System.out.println("BMW top speed is " + car1.topSpeed());
  }
}
