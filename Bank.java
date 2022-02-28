/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */



public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calling interest rate using class name as it is static
		System.out.println("Interest Rate " + Account.getInterestRate());
		
		System.out.println();
		
		
		
		Account acc=new Account();
		
		acc.setAccNo(12);
		acc.setBalance(200000);
		acc.setString("Anand");
		acc.setDurationYears(4);
		
		System.out.println(acc.getAccNo());
		System.out.println(acc.getBalance());
		System.out.println(acc.getString());
		System.out.println(acc.getDurationYears());
		
		System.out.println();
		
		
		Account acc1=new Account(15,"akash",2000000,5);
		acc1.printDetails();
		
		
		System.out.println();
		
		System.out.println("Number of Account object created = " + Account.getCount());
		
	}

}
