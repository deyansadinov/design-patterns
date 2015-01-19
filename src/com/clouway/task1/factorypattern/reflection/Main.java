package com.clouway.task1.factorypattern.reflection;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {
    HousePartsFactory factory = new HousePartsFactory();

    HouseParts window = factory.getHouseParts("window");
    HouseParts floor = factory.getHouseParts("floor");
    HouseParts door = factory.getHouseParts("door");

    window.getPart(window.getClass().getName());
    floor.getPart(floor.getClass().toString());
    door.getPart(door.getClass().toString());

  }
}
