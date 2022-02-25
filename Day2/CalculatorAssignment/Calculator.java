package week1.day2.assignments;

public class Calculator {
	
	public void add() 
	{
		int num1 = 10, num2 = 5, num3 = 5;
		int sum; 
		sum = (num1+num2+num3);
		System.out.println("The addition of numbers is " + sum);
	}
	
	public void sub()
	{
		int num1 = 10, num2 = 5;
		int diff;
		diff = (num1-num2);
		System.out.println("The Difference of numbers is " + diff);
	}
	
	public void mul()
	{
		double num1 = 10, num2 = 5;
		double sum;
		sum = (num1*num2);
		System.out.println("The multiple of numbers is " + sum);
	}
	
	public void divide()
	{
		float num1 = 10, num2 = 5;
		float quotient;
		quotient = (num1/num2);
		System.out.println("The Quotient of numbers is " + quotient);
	}
}
