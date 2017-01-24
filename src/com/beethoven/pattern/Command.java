package com.beethoven.pattern;

public class Command {
      public static void createCommand()
      {
    	  System.out.println("---------------create command-------------------------");
    	  
    	  Computer c=new Computer();
    	  User u=new User(new StopComand(c),new StartComand(c),new ResetComand(c));
    	  u.comReset();
    	  u.comStart();
    	  u.comStop();
    	  
    	  System.out.println("---------------create command-------------------------");
      }
}


interface Commands
{
	void execute();
}

class Computer
{
	void start()
	{
		System.out.println("start computer");
	}
	
	void stop()
	{
		System.out.println("stop computer");
	}
	void reset()
	{
		System.out.println("reset compter");
	}
}

class StopComand implements Commands
{
	Computer comp;
	public StopComand(Computer c) {
        comp=c;
	}
	@Override
	public void execute() {
		comp.stop();
	}
	
}

class StartComand implements Commands
{
	Computer comp;
	public StartComand(Computer c) {
        comp=c;
	}
	@Override
	public void execute() {
		comp.start();
		
	}
	
}

class ResetComand implements Commands
{
	Computer comp;
	public ResetComand(Computer c) {
        comp=c;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		comp.reset();
	}
	
}

class User
{
	Commands stop;
	Commands start;
	Commands reset;
	public User(Commands stop, Commands start, Commands reset) {
		this.stop = stop;
		this.start = start;
		this.reset = reset;
	}
	
	void comStart()
	{
		start.execute();
	}
	
	void comStop()
	{
		stop.execute();
	}
	
	void comReset()
	{
		reset.execute();
	}
	
}