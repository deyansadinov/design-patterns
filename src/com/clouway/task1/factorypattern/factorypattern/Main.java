package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {

    AbstractFactory factory = Factory.getFactory("houseParts");

    House part1 = factory.part("window");
    House part2 = factory.part("door");
    House part3 = factory.part("garage");
    House part4 = factory.part("floor");

    part1.getPart();
    part2.getPart();
    part3.getPart();
    part4.getPart();
  }
}
