package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {

    //get shape factory
    AbstractFactory shapeFactory = Producer.getFactory("SHAPE");
    AbstractFactory colorFactory = Producer.getFactory("COLOR");


    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();

    Color color1 = colorFactory.getColor("RED");
    color1.fill();

    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.draw();

    Color color2 = colorFactory.getColor("BLUE");
    color2.fill();



  }
}
