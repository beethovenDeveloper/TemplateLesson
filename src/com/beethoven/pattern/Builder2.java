package com.beethoven.pattern;

public class Builder2 {
     public static void createBuilder2()
     {
    	 System.out.println("----------------------------builder 2----------------------------------");
    	 Builders d=new Builders();
    	 d.setBuilder(new BuildTaurea());
    	 Car2 c=d.buildCar();
    	 System.out.println(""+c.toString());
    	 System.out.println("----------------------------builder 2----------------------------------");
     }
}

class Car2
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

abstract class BuilderCars
{
	Car2 car;
	void createCar()
	{
		car=new Car2();
	}
	
	Car2 getCar(){return car;}
	
	abstract void makerColor();
	abstract void makerSpeed();
	abstract void makerName();
}

class BuildMarsedes extends BuilderCars
{

	@Override
	void makerColor() {
		// TODO Auto-generated method stub
	    car.setColorCar("black");	
	}

	@Override
	void makerSpeed() {
		// TODO Auto-generated method stub
		car.setSpeedCar("300");
	}

	@Override
	void makerName() {
		// TODO Auto-generated method stub
		car.setNameCar("marsedes");
	}
	
}

class BuildTaurea extends BuilderCars
{

	@Override
	void makerColor() {
		// TODO Auto-generated method stub
	    car.setColorCar("green");	
	}

	@Override
	void makerSpeed() {
		// TODO Auto-generated method stub
		car.setSpeedCar("50");
	}

	@Override
	void makerName() {
		// TODO Auto-generated method stub
		car.setNameCar("Taurea");
	}
	
}

class Builders
{
	BuilderCars c;
	void setBuilder(BuilderCars c)
	{
		this.c=c;
	}
	Car2 buildCar()
	{
		c.createCar();
		c.makerName();
		c.makerColor();
		c.makerSpeed();
		return c.getCar();
	}
}