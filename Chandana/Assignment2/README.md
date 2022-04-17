# Assignment-2

1. Greatest of 5:

import java.util.Scanner;
class Main {
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int no1 = sc.nextInt();
		System.out.println("Enter the number2 :");
		int no2 = sc.nextInt();
		System.out.println("Enter the number3 :");
		int no3 = sc.nextInt();
		System.out.println("Enter the number4 :");
		int no4 = sc.nextInt();
		System.out.println("Enter the number5 :");
		int no5 = sc.nextInt();

		if(no1>no2&&no1>no3&&no1>no4&&no1>no5)
		{
			System.out.println(" number1 is greater among all five "+no1);
		}
		else if(no2>no1&&no2>no3&&no2>no4&&no2>no5)
		{
			System.out.println(" number2 is greater among all five "+no2);
		}
		else if(no3>no1&&no3>no2&&no3>no4&&no3>no5)
		{
			System.out.println(" number3 is greater among all five "+no3);
		}
		else if(no4>no1&&no4>no2&&no4>no3&&no4>no5)
		{
			System.out.println(" number4 is greater among all five "+no4);
		}
		else if(no5>no1&&no5>no2&&no5>no4&&no3<no5)
		{
			System.out.println(" number5 is greater among all five "+no5);
		}

	}
}
 

2.Maximum number:

package new_package;

import java.util.Scanner;

public class Arrays {

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
 
3.Number pattern:

import java.util.Scanner;
class Main {
public static void main(String[] args) {
        	for (int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}


4. Star Pattern:

import java.util.Scanner;
class Main {
public static void main(String[] args) {

        	for (int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}


5.Student details:

package new_package;

import java.util.Scanner;

public class MemberDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		long number[]=new long[5];
		int age[]=new int[5];
		System.out.println("Enter the details");

		for(int i=0;i<5;i++) {
			System.out.println("Enter the name");
			name[i]=sc.next();
			System.out.println("Enter the number");
			number[i]=sc.nextLong();
			System.out.println("Enter the age ");
			age[i]=sc.nextInt();
		}
		System.out.println("Displaying the details");
		for(int i=0;i<5;i++) {
			System.out.println("Details of the members are\r ");
			System.out.println("name = "+name[i]+"number = "+number[i]+"age = "+age[i]);

		}


	}

}
