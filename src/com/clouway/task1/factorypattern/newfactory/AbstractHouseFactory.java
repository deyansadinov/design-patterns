package com.clouway.task1.factorypattern.newfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public interface AbstractHouseFactory {

  DoorFactory doorFactory();
  WindowFactory windowFactory();
}
