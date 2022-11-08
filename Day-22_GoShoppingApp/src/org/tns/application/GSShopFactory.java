package org.tns.application;

import org.tns.framework.NormalAcc;
import org.tns.framework.PrimeAcc;
import org.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime)
	{
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}

}