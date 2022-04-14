package Assignment1;

import java.util.Scanner;

public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n1,n2,n3,n4,n5;
		System.out.println("Enter the 5 numbers ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		if (n1>n2 && n1>n3 && n1>n4 && n1>n5) {
			System.out.println("Max number: "+ n1);
		}
		else if (n2>n1 && n2>n3 && n2>n4 && n2>n5) {
			System.out.println("Max number: "+ n2);
		}
		else if (n3>n1 && n3>n2 && n3>n4 && n3>n5) {
			System.out.println("Max number: "+ n3);
		}
		else if (n4>n1 && n4>n2 && n4>n3 && n4>n5) {
			System.out.println("Max number: "+ n4);
		}
		else {
			System.out.println("Max number: "+ n5);
		}
		}

	}

