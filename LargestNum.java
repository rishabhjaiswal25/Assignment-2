package assignment_2;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		if((a>=b) && (a>=c)&&(a>=d)&&(a>=e)) {
			System.out.print("The largest number is "+a);
			
		}
		else if ((b>=c)&&(b>=d)&&(b>=e)) {
			System.out.print("The largest number is "+b);
			
		}
		else if((c>=d)&&(c>=e)) {
			System.out.print("The largest number is "+c);
		}
		else if((d>=e)) {
			System.out.print("The largest number is "+d);
		}
		else {
			System.out.print("The largest number is "+e);
		}
		

	}

}
