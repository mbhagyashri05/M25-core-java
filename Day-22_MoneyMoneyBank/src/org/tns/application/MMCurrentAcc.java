package org.tns.application;

import org.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
		{
			
			//variables Inherited for the CurrentAcc Class as we have Extended. 
			
			// Constructor
			public MMCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) 
			{
				super(AccNo, AccNm, AccBal, creditLimit);
			}

			// Methods
			
			
			//- withdraw method is inherited from CurrentAcc Class
			
			//- ToString Method
			@Override
			public String toString() 
			{
				return String.format("MMCurrentAcc [toString()=%s]", super.toString());
			}
		}
