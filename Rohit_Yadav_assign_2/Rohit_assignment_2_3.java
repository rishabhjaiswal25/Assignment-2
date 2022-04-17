package assignment_2;
import java.util.Scanner;

public class Rohit_assignment_2_3 {

	public static void main(String[] args) {
		System.out.println("Enter five numbers to find the biggest number among them");
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(a>b && a>c && a>d && a>e) {
				System.out.println("the greatest number is "+a);
			}
			else if(b>a && b>c && b>d && b>e) {
				System.out.println("the greatest number is "+b);
			}
			else if(c>a && c>b && c>d && c>e) {
				System.out.println("the greatest number is "+c);
			}
			else if(d>a && d>b && d>c && d>e) {
				System.out.println("the greatest number is "+d);
				
			}
			else if(e>a && e>b && e>c && e>d) {
				System.out.println("the greatest number is "+e);
			}
			else {
				System.out.println("Invalid input");
			}
			
		
		

	}

}
