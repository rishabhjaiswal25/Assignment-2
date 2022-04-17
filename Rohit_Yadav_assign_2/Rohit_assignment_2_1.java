package assignment_2;
import java.util.Scanner;

public class Rohit_assignment_2_1 {

	public static void main(String[] args) {
		System.out.println("Enter a number to print a Pattern of A");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<=a;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print("A");
	
			}
			System.out.println();
		}
		

	}

}
