package com.beethoven.pattern;

public class Strateges {
    public static String createStrateges()
    {
    	String s="----------------------Stratege --------------------- \n";
    			StratReal sr=new StratReal();
    	        sr.setStrat(new Strat1());
    	        s+=sr.getStrat();
    	        sr.setStrat(new Strat2());
    	        s+=sr.getStrat();
    	        sr.setStrat(new Strat3());
    	        s+=sr.getStrat();
    	        s+="----------------------Stratege ---------------------";
    	return s;
    }
}


interface Strat
{
	String stratRun();
}

class Strat1 implements Strat
{
	@Override
	public String stratRun() {
		// TODO Auto-generated method stub
		return "run strat 1 \n";
	}
}

class Strat2 implements Strat
{
	@Override
	public String stratRun() {
		// TODO Auto-generated method stub
		return "run strat 2 \n";
	}
}

class Strat3 implements Strat
{
	@Override
	public String stratRun() {
		// TODO Auto-generated method stub
		return "run strat 3 \n";
	}
}

class StratReal
{
	Strat s;
	void setStrat(Strat s)
	{
		this.s=s;
	}
	
	String getStrat()
	{
		return s.stratRun();
	}
}