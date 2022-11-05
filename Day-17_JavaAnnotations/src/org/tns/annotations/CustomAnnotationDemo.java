package org.tns.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public @interface CustomAnnotationDemo {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface Custom
	{
		//abstract method
		String print();
		int speed();
		float salary();
	}
	class CustomAnnotationClass
	{
		@Custom(print="Hello!",speed=85,salary=95000.30f)
		public void display()
		{
			System.out.println("Hurrah! Its Sunday and have a great day!!!!");
		}
	}
	public class  CustomAnnotation{

		public static void main(String[] args) throws NoSuchMethodException, Exception {
			CustomAnnotationClass c=new CustomAnnotationClass();
			c.display();
			Method m=c.getClass().getMethod("display");
			Custom obj=m.getAnnotation(Custom.class);
			System.out.println(obj.print());
			System.out.println(obj.speed());

			System.out.println(obj.salary());
		}
	}}


