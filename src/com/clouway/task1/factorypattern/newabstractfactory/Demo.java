package com.clouway.task1.factorypattern.newabstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Demo {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = new AbstractFactory();

    CarFactory carFactory1 = abstractFactory.getCarFactory("german");
    Car car1 = carFactory1.getCar("BMW");
    System.out.println("BMW top speed is " + car1.topSpeed());
    Car car2 = carFactory1.getCar("VW");
    System.out.println("VW top speed id " + car2.topSpeed());

    CarFactory carFactory2 = abstractFactory.getCarFactory("italian");
    Car car3 = carFactory2.getCar("RENAULT");
    System.out.println("Renault top speed is " + car3.topSpeed());
    Car car4 = carFactory2.getCar("FIAT");
    System.out.println("Fiat top speed is " + car4.topSpeed());
  }
}
