package org.tns.application;

import org.tns.framework.BankFactory;
import org.tns.framework.CurrentAcc;
import org.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory 
{
	// Methods
	
	// For Saving Account
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		MMSavingAcc s=new MMSavingAcc(AccNo, AccNm, AccBal, isSalaried);
		return s;
	}

	// For Current Account
	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit ) 
	{
		MMCurrentAcc c=new MMCurrentAcc(AccNo, AccNm, AccBal, creditLimit);
		return c;
	}

}

