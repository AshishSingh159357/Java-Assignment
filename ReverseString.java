/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */


public class ReverseString {
	
	
	public static String reverse(String str) {
		
		char ch[]=str.toCharArray();
		String st="";
		
		for(int i=ch.length-1;i>=0;i--) {
			 st+=ch[i];
			
		}
		
		
		System.out.println(st);
		
		return ch.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		reverse("hello");
	}

}