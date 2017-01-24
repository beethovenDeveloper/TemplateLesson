package com.beethoven.pattern;

public class Delegate {
     public static String createDelegate()
     {
    	 String s="";
    	 s+="-----------------------Delegate------------------------------- \n";
    	 PhoneSuer p=new PhoneSuer(new PhonesSota());
    	 s+=p.telephone();
    	 s+="-----------------------Delegate-------------------------------";
    	 return s;
     }
}

interface Phones
{
	String phone();
}

class PhonesMobile implements Phones
{
	@Override
	public String phone() {
		// TODO Auto-generated method stub
		return "phones mobile run \n";
	}
}
class PhonesSota implements Phones
{
	@Override
	public String phone() {
		// TODO Auto-generated method stub
		return "phones sota run \n";
	}
}

class PhonesAnalog implements Phones
{
	@Override
	public String phone() {
		// TODO Auto-generated method stub
		return "phones analog run \n";
	}
}

class PhoneSuer
{
	Phones s;
	public PhoneSuer(Phones s) {
		// TODO Auto-generated constructor stub
		this.s=s;
	}
	
	String telephone()
	{
		return s.phone();
	}
}