package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public abstract class AbstractFactory {
  abstract House part(String partName);
}
