/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */



public class Customer {

	private int customerid;
	private String name;
	private int age;
	private String city;
	private int pinCode;
	
	
	public Customer() {
		
		this.customerid=12;
		this.name="Akash";
		this.age=22;
		this.city="bhavnagar";
		this.pinCode=36665;
	}
	

	public Customer(int customerid,String name,int age, String city,int pincode) {
		
		this.customerid=customerid;
		this.name=name;
		this.age=age;
		this.city=city;
		this.pinCode=pincode;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	public String getName() {
		return name;
	}
	
	public void printDetails() {
		System.out.println("customerid :" + customerid +" " +"name :" + name +" " + "age :" + age + " " + "city :" + city +" "+ "pincode :" + pinCode);
	}

}
