package org.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	
	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	//to string

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	//method
	@Override
	public void withdraw(float AccBal)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccNm());
		System.out.println("Balance is: "+(AccBal + creditLimit));	
	}

	
	
	
}
