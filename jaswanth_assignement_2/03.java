import java.util.Scanner;
public class Main {
		static int no1,no2,no3,no4,n05;
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number 1 :");
			int n1 = sc.nextInt();
			System.out.println("Enter number 2 :");
			int n2 = sc.nextInt();
			System.out.println("Enter number 3 :");
			int n3 = sc.nextInt();
			System.out.println("Enter number 4 :");
			int n4 = sc.nextInt();
			System.out.println("Enter number 5 :");
			int n5 = sc.nextInt();
			if(n1>n2&&n1>n3&&n1>n4&&n1>n5)
			{
				System.out.println(" number 1 is greater among all five "+n1);
			}
			else if(n2>n1&&n2>n3&&n2>n4&&n2>n5)
			{
				System.out.println(" number 2 is greater among all five "+n2);
			}
			else if(n3>n1&&n3>n2&&n3>n4&&n3>n5)
			{
				System.out.println(" number 3 is greater among all five "+n3);
			}
			else if(n4>n1&&n4>n2&&n4>n3&&n4>n5)
			{
				System.out.println(" number 4 is greater among all five "+n4);
			}
			else if(n5>n1&&n5>n2&&n5>n4&&n3<n5)
			{
				System.out.println(" number 5 is greater among all five "+n5);
			}

		}

	}  
