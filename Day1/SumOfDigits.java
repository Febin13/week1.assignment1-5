package week1.day1.assignments;


public class SumOfDigits {

	public static void main(String[] args) {
		int number=123;
		int remainder = 0;
		int sum=0;
		
		while(number>0)
		{
			
			remainder=number%10;
			System.out.println("Remainder: "+ remainder);
			
			sum=sum+remainder;
			System.out.println("Sum: "+sum);
			
			number=number/10;
			System.out.println("Number: "+number);
			
			
		}
		
		System.out.println("");
		System.out.println("Total Sum: "+ sum);
	}

}
