package com.beethoven.pattern;
import java.util.*;

public class Composite {
    public static void createComposite()
    {
    	System.out.println("---------------------------composite-------------------------------");
    	Shape s1=new Shape1();
    	Shape s2=new Shape1();
    	Shape v1=new Shape2();
    	Shape v2=new Shape2();
    	Shape r1=new Shape3();
    	Shape r2=new Shape3();
    	
    	Compos com1=new Compos();
    	Compos com2=new Compos();
    	Compos com=new Compos();
    	com1.addData(s1);
    	com1.addData(v1);
    	com1.addData(r1);
    	
    	com2.addData(s2);
    	com2.addData(v2);
    	com2.addData(r2);
    	com.addData(com1);
    	com.addData(com2);
    	com.drow();
    	System.out.println("---------------------------composite-------------------------------");
    }
}


interface Shape
{
	void drow();
}

class Shape1 implements Shape{
	@Override
	public void drow() {
		// TODO Auto-generated method stub
	    System.out.println("I am shape 1");	
	}
}

class Shape2 implements Shape{
	@Override
	public void drow() {
		// TODO Auto-generated method stub
	    System.out.println("I am shape 2");	
	}
}

class Shape3 implements Shape{
	@Override
	public void drow() {
		// TODO Auto-generated method stub
	    System.out.println("I am shape 3");	
	}
}


class Compos implements Shape
{
	List<Shape> list=new LinkedList<Shape>();
	public void addData(Shape p)
	{
		list.add(p);
	}
	
	public void deleteData(Shape p)
	{
		list.remove(p);
	}
	@Override
	public void drow() {
		// TODO Auto-generated method stub
		for(Shape s:list)
		{
			s.drow();
		}
	}
}