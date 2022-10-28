package org.tns.customexception;

@SuppressWarnings("serial")
class SimpleCustomException extends Exception
{
	public String str;
	//constructor
	public SimpleCustomException(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}	
}