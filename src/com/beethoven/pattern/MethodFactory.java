package com.beethoven.pattern;

public class MethodFactory {
     public static String createMethodFactory()
     {
    	 String st="-------------------Method Factory ------------------- \n";
    	 Fruit f=new CreateApple().createFruit();
    	 st+=f.color();
    	 st+=f.size();
    	 st+="-------------------Method Factory ------------------- \n";
    	 return st;
     }
}

interface Fruit
{
	String color();
	String size();
}

class Apple implements Fruit
{
	public String color() {
		
		return "color Apple \n";
	};
	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "size Apple \n";
	}
}

class Pear implements Fruit
{
	public String color() {
		
		return "color Pear \n";
	};
	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "size Pear \n";
	}
}


interface CreateFruit
{
	Fruit createFruit();
}
class CreateApple implements CreateFruit
{
	public Fruit createFruit() {
		return new Apple();
	};
}

class CreatePear implements CreateFruit
{
	public Fruit createFruit() {
		return new Pear();
	};
}