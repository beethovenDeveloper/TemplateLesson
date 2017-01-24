package com.beethoven.pattern;

public class Visitor {
      public static void createVisitor()
      {
    	  BodyElement b1=new BodyElement();
    	  EngenyElement e1=new EngenyElement();
    	  Visitors v=new HuliganVisitors();
    	  b1.acept(v);
    	  e1.acept(v);
      }
}


interface Visitors
{
	void visit(BodyElement body);
	void visit(EngenyElement engeny);
}

interface Element
{
	void acept(Visitors v);
}

class BodyElement implements Element
{
	@Override
	public void acept(Visitors v) {
		v.visit(this);
		
	}
}

class EngenyElement implements Element
{
	@Override
	public void acept(Visitors v) {
		v.visit(this);
	}
}

class HuliganVisitors implements Visitors
{

	@Override
	public void visit(BodyElement body) {
		System.out.println("i lomau kuzow");
		
	}

	@Override
	public void visit(EngenyElement engeny) {
		System.out.println("i lomau dviglo");
		
	}
	
}

class MechanekVisitors implements Visitors
{
	public void visit(BodyElement body) {
		System.out.println("i remont kuzow");		
	}

	@Override
	public void visit(EngenyElement engeny) {
		System.out.println("i remont dviglo");
		
	}
	
}