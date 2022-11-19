package org.tns.framework;

public abstract class BankFactory 
{
	//for saving acc
	abstract public SavingAcc getNewSavingAcc 
	(int AccNo, String AccNm, float AccBal, boolean isSalaried);
	//for current acc
	abstract public CurrentAcc getNewCurrentAcc
	(int accNo, String accNm, float accBal, float creditLimit);
}

