package com.clouway.task1.factorypattern.newfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {
    AbstractHouseFactory abstractFactory = new HouseFactory();

    abstractFactory.doorFactory().newDoor();
    abstractFactory.windowFactory().newWindow();
  }
}
