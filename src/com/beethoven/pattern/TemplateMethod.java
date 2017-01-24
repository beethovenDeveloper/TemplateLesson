package com.beethoven.pattern;

public class TemplateMethod {
      public static String createTemplateMethod()
      {
    	  String s="-----------------Template Method----------------------\n";
    	  Printer p=new LaserPrinter();
    	  s+=p.workPriner();
    	  s+="-----------------Template Method----------------------\n";
    	  return s;
      }
}
abstract class Printer
{
	String workPriner()
	{
		String s="run printer \n";
		s+=work1();
		s+="print printer \n";
		s+=work2();
		s+="off printer \n";
		return s;
	}
	
	abstract String work1();
	abstract String work2();
	
}


class LaserPrinter extends Printer
{
	@Override
	String work1() {
		// TODO Auto-generated method stub
		return "heat up printer \n";
	}
	@Override
	String work2() {
		// TODO Auto-generated method stub
		return null;
	}
}

class StreamPrinter extends Printer
{
	@Override
	String work1() {
		// TODO Auto-generated method stub
		return "clear sopla printer \n";
	}
	@Override
	String work2() {
		// TODO Auto-generated method stub
		return "clear sopla for off printer \n;";
	}
}