package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class ColorFactory extends AbstractFactory {
  @Override
  Shape getShape(String shape) {
    return null;
  }

  @Override
  Color getColor(String color) {
    if (color == null){
      return null;
    }
    if (color.equalsIgnoreCase("RED")){
      return new Red();
    }else if (color.equalsIgnoreCase("GREEN")){
      return new Green();
    }else if (color.equalsIgnoreCase("BLUE")){
      return new Blue();
    }
    return null;
  }
}
