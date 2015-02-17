package com.clouway.task1.factorypattern.newfactory;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class HouseFactory implements AbstractHouseFactory {
  @Override
  public DoorFactory doorFactory() {
    return new DoorFactory();
  }

  @Override
  public WindowFactory windowFactory() {
    return new WindowFactory();
  }
}
