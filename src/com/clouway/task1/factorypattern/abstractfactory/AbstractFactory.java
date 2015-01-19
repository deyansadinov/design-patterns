package com.clouway.task1.factorypattern.abstractfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public abstract class AbstractFactory {
  abstract Shape getShape(String shape);
  abstract Color getColor(String color);
}
