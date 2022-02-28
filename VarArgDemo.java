/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */



public class VarArgDemo {
	
	public static double average(int ... a) {
		
		int n=a.length;
		int sum=0;
		
		for(int i:a) {
			sum=sum+i;
		}
		
		return (sum/n);
	}
	
	public static void main(String[] args) {
		
		System.out.println(average(10,20,30,40));
		
	}

}