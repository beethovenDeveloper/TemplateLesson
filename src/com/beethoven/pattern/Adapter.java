package com.beethoven.pattern;

public class Adapter {
      public static String createAdapter()
      {
    	  String s="";
    	  Clef f=new SuperClef();
    	  s+="------------------------Adapter----------------------- \n";
    	  s+=f.size();
    	  s+=f.type();
    	  s+="------------------------Adapter-----------------------";
    	  return s;
      }
}

interface Clef
{
	String size();
	String type();
}

class ClefBosh
{
	String boshClefSize()
	{
		 return "size bosh clef \n";
	}
	
	String boshClefType()
	{
		return "type bosh clef \n";
	}
}

class SuperClef implements Clef
{
	ClefBosh b=new ClefBosh();
	@Override
	public String size() {
		// TODO Auto-generated method stub
		return b.boshClefSize();
	}
	@Override
	public String type() {
		// TODO Auto-generated method stub
		return b.boshClefType();
	}
}