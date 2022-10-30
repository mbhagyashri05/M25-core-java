package org.tns.annotations;

import java.lang.annotation.Annotation;

public @interface RetentionAnnotationDemo {
	@interface CustomAnnotation
	{
		String print();
		String decription();
		Class<? extends Annotation> annotationType1();
	}

	class RetentionChild implements CustomAnnotation
	{

		@Override
		public Class<? extends Annotation> annotationType() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String print() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String decription() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Class<? extends Annotation> annotationType1()
		{
			return null;
		}
				}
	


}
