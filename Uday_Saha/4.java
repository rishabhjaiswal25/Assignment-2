
import java.util.*;
public class my {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		long phn[]=new long[5];
		int age[]=new int[5];
		System.out.println("Enter the details of 2 candidates ");
		for(int k=0;k<2;k++) 
		{
			System.out.println("Name");
			name[k]=sc.next();
			System.out.println("registeration number");
			phn[k]=sc.nextLong();
			System.out.println("english number");
			age[k]=sc.nextInt();
		}
		System.out.println(" details displaying ");
		for( int k=0;k<2;k++) {
			System.out.println("Details of the candidate "+(k+1)+" are\n ");
			System.out.print("Name: " +name[k]+" Phone Number: "+phn[k]+" Age: "+age[k]+"\n");
		}	
	}

}
