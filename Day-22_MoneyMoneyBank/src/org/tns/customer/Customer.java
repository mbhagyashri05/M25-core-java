package org.tns.customer;

import org.tns.application.MMBankFactory;
import org.tns.application.MMCurrentAcc;
import org.tns.application.MMSavingAcc;
import org.tns.framework.BankFactory;
import org.tns.framework.CurrentAcc;
import org.tns.framework.SavingAcc;

public class Customer {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory(); // LazyBinding 
		SavingAcc s=new MMSavingAcc(122921, "Bhagyashri" , 100000, true);
		CurrentAcc c=new MMCurrentAcc(122321, "Yuvan", 15000, 80);
		
		// For Saving Account Output
		System.out.println("WELCOME TO MONEY MONEY BANK !!");
		System.out.println("\n" + "Saving Account: ");	
		s.withdraw(s.getAccBal());
		System.out.println(s);
		
		System.out.println();
		
		// For Current Account Output
		System.out.println("Current Account: ");
		c.withdraw(c.getAccBal());
		System.out.println(c);
		System.out.println("\n" + "THANKYOU FOR BANKING WITH US!!");
	}


	}
