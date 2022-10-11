package org.tns.statickeyword;

class C
{
	public static String str="TNS India";
	
	static class D{
		public static void print()
		{
			System.out.println(str);
		}
	}
	}

public class DemoOnStaticClass {

	public static void main(String[] args) {
		C.D.print();
		// TODO Auto-generated method stub

	}

}
