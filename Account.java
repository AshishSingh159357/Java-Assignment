
/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description Employee class
 */


public class Account {
	
	
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	private static double interestRate;
	private static int count=0;
	
	static {
		interestRate=0.05;
	}
	
	{
		count++;
	}
	
	
	public Account() {
		
		this.accNo=0;
		this.ownerName="Ashish Singh";
		this.balance=250000000;
		this.durationYears=10;
		
	}
	
	
	
	
	
	public Account(int accNo,String ownerName,double balance,float years) {
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYears=years;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	
	public void setString(String ownerName) {
		this.ownerName=ownerName;
	}
	
	public String getString() {
		return ownerName;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setDurationYears(float durationYears) {
		this.durationYears=durationYears;
	}
	
	public float getDurationYears() {
		return durationYears;
	}
	
	
	
	
	
	
	
	
	public static int getCount() {
		return count;
	}
	
	
	
	
	public double calculateInterest() {	
		return balance*interestRate*durationYears ;
	}
	
	
	public void printDetails() {
		System.out.println("Account No = "+ accNo);
		System.out.println("balance = "+ balance);
		System.out.println("ownerName = "+ ownerName);
		System.out.println("durationYears = "+ durationYears);
	}
	
	
	
	public static void setInterestRate(double iR) {
		interestRate=iR;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	
	

}




