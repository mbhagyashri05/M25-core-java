package org.tns.enumdemo;

public enum EnumCardsDemo implements InterfaceCardsDemo{
	HEART,CLUB,DIAMOND,SPADE;

	@Override
	public void print() 
	{
		System.out.println("Selected Shape in the cards are: "+this);
		
		
	}

}
