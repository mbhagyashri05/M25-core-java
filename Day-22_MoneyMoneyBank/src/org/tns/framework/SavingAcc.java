package org.tns.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	static final private float MINBAL=0.0f;
    
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	//method
	public void withdraw (float accBal) 
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccNm());
		System.out.println("Account Balance is: "+(accBal));
	}
	
	//to string

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	 

	
	
}