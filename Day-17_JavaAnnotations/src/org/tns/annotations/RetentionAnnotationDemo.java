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
			
			return null;
		}

		@Override
		public String print() {
			
			return null;
		}

		@Override
		public String decription() {
			
			return null;
		}
		@Override
		public Class<? extends Annotation> annotationType1()
		{
			return null;
		}
				}
	


}
