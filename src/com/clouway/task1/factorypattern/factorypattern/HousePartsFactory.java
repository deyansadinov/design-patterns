package com.clouway.task1.factorypattern.factorypattern;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class HousePartsFactory extends AbstractFactory {
  @Override
  House part(String partName) {
    if (partName == null){
      return null;
    }else if (partName.equals("window")){
      return new Window();
    }else if (partName.equals("floor")){
      return new Floor();
    }else if (partName.equals("door")){
      return new Door();
    }else if (partName.equals("garage")){
      return new Garage();
    }
    return null;
  }
}
