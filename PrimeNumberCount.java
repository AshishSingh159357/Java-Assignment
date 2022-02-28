/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */



public class PrimeNumberCount {
	
	public static void primeCount(int count) {
		int c=0;
		int[] arr=new int[count];
		int j=3;
		while(true) {
			int flag=0;
			
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				arr[c]=j;
				c++;
			}
			j++;
			if(c==count) {
			break;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
		}
		
	}
	
	public static void main(String[] args) {
		primeCount(6);
	}

}
