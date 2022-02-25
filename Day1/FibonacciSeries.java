package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0, secondNum = 1, sum, range = 8;
		System.out.println(""+firstNum);
		System.out.println(""+secondNum);
		
		for(int i=1;i<range;i++)
		{
			sum = firstNum+secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(""+sum);
		}

	}

}
