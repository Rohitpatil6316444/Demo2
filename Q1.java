package lab2;

import java.util.Scanner;

public class Q1 
{
	static int x=0;
	static int num;
	
	
	int count(int a)
	{
		 while (num != 0) 
		 {
		      num /= 10;
		      ++x;
		 }
		 return x;

	}
	
	void getSum(int n)
	{
		int sum;
		for(sum=0 ;n!=0 ;n/=10)
		{
		sum+=n%10;
		}
		System.out.println("Sum of digits of a number is "+sum); 

	}
	    
	    
	public static void main(String[] args) 
	{
		Q1 q = new Q1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		num = s. nextInt();
		int p=q.count(num);
		System.out.println("Count = "+p);
		q.getSum(num);

		
		

	}

}
