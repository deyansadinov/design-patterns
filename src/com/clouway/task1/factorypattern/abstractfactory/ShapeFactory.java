package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class ShapeFactory extends AbstractFactory {
  @Override
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    }
    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    if (shapeType.equalsIgnoreCase("SQUARE")){
      return new Square();
    }
    return null;
  }

  @Override
  Color getColor(String color) {
    return null;
  }
}
