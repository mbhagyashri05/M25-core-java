package org.tns.client;

import org.tns.application.GSNormalAcc;
import org.tns.application.GSPrimeAcc;
import org.tns.application.GSShopFactory;
import org.tns.framework.NormalAcc;
import org.tns.framework.PrimeAcc;
import org.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(12121, "Bhagyashri ", 840, true);
		NormalAcc n=new GSNormalAcc(13171, "Bella", 900,50 );
		
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getCharges());
		
//		System.out.println(p);
//		System.out.println(n);


	}

	}


