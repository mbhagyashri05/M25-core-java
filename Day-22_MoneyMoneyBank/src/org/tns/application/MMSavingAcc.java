package org.tns.application;

import org.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc 
{
	//inherited from savingacc as we use extended 
	
	// Constructor
	
	public MMSavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		super(AccNo, AccNm, AccBal, isSalaried);
	}
	
	// Method
	// withdraw method is inherited from SavingAcc Class
	
	// ToString 
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
		
}
	

