package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13, n;
		boolean flag = false;
		n=input/2;
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(input+" is prime");
		} else
		{
			System.out.println(input+" is not prime");
		}

	}

}
