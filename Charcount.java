/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */



public class Charcount {
	
	public static int countchar(String str,char ch) {
		int count=0;
		
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==ch) {
				count ++;
				
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		int a;
		a=countchar("hello",'l');
		System.out.println(a);
	}

}