package assignment_2;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("no of students: ");
		int n = sc.nextInt();
		String name[]=new String[n];
		long mob[]=new long[n];
		String email[]=new String[n];
		System.out.print("Enter details\n");
		for(int i=0;i<n;i++)
		{
			System.out.print("Name:");
			name[i]=sc.next();
			System.out.print("mobile no:");
			mob[i]=sc.nextLong();
			System.out.print("Email:");
			email[i]=sc.next();
			
		}
		System.out.print("student details are:\n");
		for(int i=0;i<n;i++) {
			
			System.out.println("Name:" +name[i]);
			System.out.println("Mobile no: "+mob[i]);
			System.out.println("Email: "+email[i]);
			System.out.println();
			
		}
		
	}
}

