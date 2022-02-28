/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */


public class MultiplicationTable {
	
	public static void mulTable(int n) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+ " "+ "*" +" " +i+ "=" + (n*i) );
			
		}
		
	}
	public static void main(String[] args) {
		
		mulTable(5);
		
	}

}