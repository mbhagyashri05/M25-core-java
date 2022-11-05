package org.tns.entities;

public class Student 
{
	private int ROLL_NO;
	private String NAME;
	private float percentage;
	
	//getters and setters
	
	public int getROLL_NO() {
		return ROLL_NO;
	}
	public void setROLL_NO(int rOLL_NO) {
		ROLL_NO = rOLL_NO;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [ROLL_NO=" + ROLL_NO + ", NAME=" + NAME + ", percentage=" + percentage + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
