package org.tns.generics;

public class Executor {

	public static void main(String[] args) {
		
		
		Sender<String> stringSender = new Sender<String>();
		stringSender.setMessage("Hello from Java!");
		stringSender.sendMessage();
		
		//create email object
		Email myEmail = new Email();
		myEmail.setFrom("catch.mbhagyashri05@gmail.com");
		myEmail.setTo("catch.mbhagyashri59@gmail.com");
		myEmail.setSubject("Java Full Stack");
		myEmail.setBody("About Training and PLacements");
		
		//create sender
		Sender<Email> emailSender = new Sender<Email>();
		emailSender.setMessage(myEmail);
		emailSender.sendMessage();

	}

}
