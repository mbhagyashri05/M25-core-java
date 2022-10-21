package org.tns.lambdaexpdemo;

public class MaxFinderExecutor {

	public static void main(String[] args) {
		/*MaxFinderChildDemo d=new MaxFinderChildDemo();
		d.max(45,17);*/
		MaxFinderDemo obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			System.out.println("The maximum number is:" +result);
		};
		obj.max(13,98);
	}

}
