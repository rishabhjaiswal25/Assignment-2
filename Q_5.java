package assignment_2;
import java.util.Scanner;
public class Q_5 {
	
	public static void main(String[] args) {
		int n, max;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the limit:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the numbers:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt(); // code to enter the number 

        }

        max = a[0];

        for(int i = 0; i < n; i++)

        {

            if(max < a[i])

            {

                max = a[i];

            }

        }

        System.out.println("Maximum value:"+max); 


	}
	
}