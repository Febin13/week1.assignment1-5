package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		int n;
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length;i++)
		{
			n=i+1;	
			if(arr[i]!= n)
			{
				System.out.println("Missing Number is: "+ n);
				break;
			}
		}
		
		
	}
		

}
