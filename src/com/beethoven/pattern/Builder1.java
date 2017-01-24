package com.beethoven.pattern;

public class Builder1 {
     public static void createBuilder1()
     {
    	 System.out.println("------------------------builder 1------------------------------");
    	      Car car=new BuilderCar().makerColorCar("green").makerNameCar("Bugatty").builderCar();
    	 System.out.println(""+car.toString());
    	 System.out.println("------------------------builder 1------------------------------");
     }
}

class Car
{
  private String nameCar;
  private String colorCar;
  private String speedCar;
public String getNameCar() {
	return nameCar;
}
public void setNameCar(String nameCar) {
	this.nameCar = nameCar;
}
public String getColorCar() {
	return colorCar;
}
public void setColorCar(String colorCar) {
	this.colorCar = colorCar;
}
public String getSpeedCar() {
	return speedCar;
}
public void setSpeedCar(String speedCar) {
	this.speedCar = speedCar;
}
@Override
public String toString() {
	return "Car [nameCar=" + nameCar + ", colorCar=" + colorCar + ", speedCar=" + speedCar + "]";
}
  
  
} 

class BuilderCar
{
	  private String nameCar="default";
	  private String colorCar="black";
	  private String speedCar="100";
	  
	  public BuilderCar makerNameCar(String name)
	  {
		  nameCar=name;
		  return this;
	  }
	  public BuilderCar makerColorCar(String color)
	  {
		  colorCar=color;
		  return this;
	  }
	  
	  public BuilderCar makerSpeedCar(String speed)
	  {
		  speedCar=speed;
		  return this;
	  }
	  
	  Car builderCar()
	  {
		  Car car=new Car();
		  car.setNameCar(nameCar);
		  car.setSpeedCar(speedCar);
		  car.setColorCar(colorCar);
		  return car;
	  }
	  
}
  
