package com.beethoven.pattern;

public  class AbstractFactory {
     public static String createAbstractFactory()
     {
    	 User u=new User(new UserComplect1());
    	 String getS="--------------abstract factory -------------- \n";
    	 getS+=u.userComplect();
    	 getS+="\n--------------abstract factory --------------\n";
    	 return getS;
     }
}

interface Product1
{
	String size();
	String color();
}
interface Product2
{
	String speed();
	String form(); 
}

class PhoneSamsung implements Product1
{
	public String color() {
		
		return "samsung color \n";
	};
	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "samsung size \n";
	}
}

class PhoneSony implements Product1
{
	public String color() {
		
		return "sony color \n";
	};
	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "sony size \n";
	}
}

class Basicle1 implements Product2
{
	@Override
	public String form() {
		// TODO Auto-generated method stub
		return "basicle1 form sport \n";
	}
	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return "basicle1 speed 100 \n";
	}
}

class Basicle2 implements Product2
{
	@Override
	public String form() {
		// TODO Auto-generated method stub
		return "basicle2 form mounth \n";
	}
	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return "basicle2 speed 200 \n";
	}
}

interface UserComplect
{
	Product1 createPhone();
	Product2 createBasicle();
}

class UserComplect1 implements UserComplect
{
	@Override
	public Product2 createBasicle() {
		// TODO Auto-generated method stub
		return new Basicle1();
	}
	@Override
	public Product1 createPhone() {
		// TODO Auto-generated method stub
		return new PhoneSamsung();
	}
}

class UserComplect2 implements UserComplect
{
	@Override
	public Product2 createBasicle() {
		// TODO Auto-generated method stub
		return new Basicle2();
	}
	@Override
	public Product1 createPhone() {
		// TODO Auto-generated method stub
		return new PhoneSony();
	}
}


class User
{
	Product1 phone;
	Product2 baciscle;
	public User(UserComplect c) {
		// TODO Auto-generated constructor stub
		
		phone=c.createPhone();
		baciscle=c.createBasicle();
	}
	
	String userComplect()
	{
		String userC="";
		userC+=phone.color();
		userC+=phone.size();
		userC+=baciscle.form();
		userC+=baciscle.speed();
		return userC;
	}
	
}