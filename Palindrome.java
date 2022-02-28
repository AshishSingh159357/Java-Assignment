/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */



public class Palindrome {
	
	public static boolean reverse1(String str) {
		boolean flag=false;
		
		String reverse="";
		
		int l=str.length();
		
		for(int i=l-1;i>=0;i--) 
		{
			reverse= reverse+str.charAt(i);
			
		}
		
		if(str.equals(reverse))
		{
			flag=true;
		}
		
		return flag;
		
	}
	
	
	public static void main(String[] args) {
		boolean ans=reverse1("121");
		if(ans==false) {
		System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		
	}

}