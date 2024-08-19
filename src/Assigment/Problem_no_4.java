package Assigment;

public class Problem_no_4 {

	public static void main(String[] args) {
		// 4. Write a Java Program to swap two numbers without using third variable.
		
		int a = 23;
		int b= 56;
		

		System.out.println("Before swaping number.");

		System.out.println("a = "+a);
		System.out.println("b = "+b);


		a= a+b;  // 23 = 23+56 a = 79
		
		b=a-b;   // b= 56= 79-56  b = 23
		
		a=a-b; // a =  79 -23   a=56
		
		System.out.println("After swaping number.");

		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
