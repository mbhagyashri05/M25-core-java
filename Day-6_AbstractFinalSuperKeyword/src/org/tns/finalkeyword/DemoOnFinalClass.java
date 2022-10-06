package org.tns.finalkeyword;
class FinalClass
{
	protected String name="Jell";
}
class ChildFinal extends FinalClass
{
	public void print() 
	{
		System.out.println(name);
	}
}
public class DemoOnFinalClass {

	public static void main(String[] args) {
		ChildFinal c=new ChildFinal();
		c.print();

	}

}
