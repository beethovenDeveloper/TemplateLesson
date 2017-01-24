package com.beethoven.pattern;

public class Decorator {
     public static String createDecorator()
     {
    	 Painter p=new P1Painter(new P2Painter(new SuperPainter()));
    	 
    	 String s="----------------------Decorator-----------------------\n";
    	        s+=p.paint();
    			s+="----------------------Decorator-----------------------";
    			return s;
     }
}

interface Painter
{
	String paint();
}

class SuperPainter implements Painter
{
     @Override
     	public String paint() {
     		// TODO Auto-generated method stub
     		return "beethoven";
     	}	
}

class P1Painter implements Painter
{
	Painter p;
	public P1Painter(Painter p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}
	@Override
	public String paint() {
		// TODO Auto-generated method stub
		String s=""+p.paint();
		s+="\n---------------------------------------\n";
		return s;
	}
}
class P2Painter implements Painter
{
	Painter p;
	public P2Painter(Painter p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}
	@Override
	public String paint() {
		// TODO Auto-generated method stub
		String s="---------------------------------------\n";
        s+=""+p.paint();
		return s;
	}
}