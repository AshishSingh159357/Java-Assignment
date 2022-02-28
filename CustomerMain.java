/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */


public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		
		
		System.out.println( c1.getName() );
		c1.setName("ashish");
		System.out.println( c1.getName() );
		
		
		Customer c2=new Customer(2,"singh",21,"jamnagar",361006);
		c2.printDetails();
				
	}

}
