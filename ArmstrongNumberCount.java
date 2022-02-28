/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */


public class ArmstrongNumberCount {
	
	public static void armstrong(int count) {
		int c=0;
		int[] arr=new int[count];
		int num=1;
		
		while(true) {
			
			int temp=num;
			int ans=0;
			
			while(temp>0) {
				int lastdigit=temp%10;
				ans=ans+(lastdigit*lastdigit*lastdigit);
				temp=temp/10;
			}
			
			if(ans==num) {
				arr[c]=ans;
				c++;
			}
			if(c==count) {
				break;
			}
			num++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(5);

	}

}
