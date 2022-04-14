package Assignment2;
import java.util.*;
public class maxinarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you to enter ");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the "+n+" number of elements ");
		for (int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		for (int i=1;i<n;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Maximum number is: "+max);
	}

}
