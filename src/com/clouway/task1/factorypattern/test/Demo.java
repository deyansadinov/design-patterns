package com.clouway.task1.factorypattern.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Demo {
  public static void main(String[] args) {

    ShapeFactory shapeFactory  = new ShapeFactory();

    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();

    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.draw();

    Shape shape3 = shapeFactory.getShape("SQUARE");
    shape3.draw();

  }
}
