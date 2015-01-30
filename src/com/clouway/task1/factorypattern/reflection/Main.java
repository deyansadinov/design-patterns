package com.clouway.task1.factorypattern.reflection;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {
    HousePartsFactory factory = new HousePartsFactory();

    HouseParts door = factory.getHouseParts("Door");
    HouseParts floor = factory.getHouseParts("Floor");
    HouseParts window = factory.getHouseParts("Window");

    door.getPart(door.getClass().getName());
    floor.getPart(floor.getClass().getName());
    window.getPart(window.getClass().getName());
  }
}
