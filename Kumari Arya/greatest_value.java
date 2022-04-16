package assignment2;

import java.util.Scanner;

public class greatest_value 
{
	public static void main(String[] args)
	{
		int max;
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int num=sys.nextInt();
		System.out.println("Enter the numbers: ");
		int n=sys.nextInt();
		int A[]=new int[num];
		
		for(int i=0;i<num-1;i++)
		{
			A[i]=sys.nextInt();
		}
		max=A[0];
		
		for(int i=0;i<num-1;i++)
		{
			if(max<A[i])
			{
				max=A[i];
			}
		}
		System.out.println("Greatest Number: "+max);
	}

}
