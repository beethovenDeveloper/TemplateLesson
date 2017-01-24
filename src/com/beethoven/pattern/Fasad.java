package com.beethoven.pattern;

public class Fasad {
    public static String createFasad()
    {
    	String s="";
    	s+="------------------------Fasad--------------------------------\n";
    	    Computers c=new Computers();
    	s+=c.runComputer();
    	s+="------------------------Fasad---------------------------------";
    	return s;
    }
}

class Computers
{
    HddComputers hdd;
    ProcesComputer processor;
    public Computers() {
    	hdd=new HddComputers();
    	processor=new ProcesComputer();
	}
    
    String runComputer()
    {
    	String s=processor.runproc();
    	s+=hdd.runHdd();
    	s+=hdd.stopHdd();
    	s+=processor.stopProc();
    	return s;
    }
}

class HddComputers
{
	String runHdd()
	{
		return "run Hdd\n";
	}
	
	String stopHdd()
	{
		return "stop hdd\n";
	}
}

class ProcesComputer
{
	String runproc()
	{
		return "run processor \n";
	}
	
	String stopProc()
	{
		return "stop processor \n";
	}
}