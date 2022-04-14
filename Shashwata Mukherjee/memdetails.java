package Assignment1;
import java.util.*;
public class memdetails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		long phn[]=new long[5];
		int age[]=new int[5];
		System.out.println("Enter the details ");
		for(int i=0;i<5;i++) 
		{
			System.out.println("Name");
			name[i]=sc.next();
			System.out.println("phone number");
			phn[i]=sc.nextLong();
			System.out.println("age");
			age[i]=sc.nextInt();
		}
		System.out.println("Displaying the details");
		for(int i=0;i<5;i++) {
			System.out.println("Details of the member"+(i+1)+" are\n ");
			System.out.print("Name: " +name[i]+" Phone Number: "+phn[i]+" Age: "+age[i]+"\n");
		}	
	}

}
