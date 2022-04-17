package assignment_2;
import java.util.Scanner;

public class Rohit_assignment_2_2 {

	public static void main(String[] args) {
		System.out.println("Enter the number to print pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=0;i<=n;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(i+"  ");
	
			}
			System.out.println();
		}
		

	}

}
