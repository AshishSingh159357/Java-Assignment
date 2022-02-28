/*
 * @author ashish.singh@stl.tech
 * @date 20-01-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved
 * @description  Demonstration of Armstrong Number
 */


public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine ob1=new MathEngine();
		
		ob1.multiply(4,2,3);
		System.out.println(ob1.multiply(4,2.5f));
		System.out.println(ob1.multiply(2.5f,4));

	}

}