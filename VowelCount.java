/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */


public class VowelCount {
	
	public static int countVowels(String str) {
		
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int b;
		b=countVowels("hello");
		System.out.println("number of vowels are = "+b);
	}

}