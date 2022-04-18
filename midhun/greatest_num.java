import java.util.Scanner;
class Main {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int n1 = sc.nextInt();
		System.out.println("Enter the number2 :");
		int n2 = sc.nextInt();
		System.out.println("Enter the number3 :");
		int n3 = sc.nextInt();
		System.out.println("Enter the number4 :");
		int n4 = sc.nextInt();
		System.out.println("Enter the number5 :");
		int n5 = sc.nextInt();
		
		if(n1>n2&&n1>n3&&n1>n4&&n1>n5)
		{
			System.out.println(" number1 is greater  "+n1);
		}
		else if(n2>n1&&n2>n3&&n2>n4&&n2>n5)
		{
			System.out.println(" number2 is greater "+n2);
		}
		else if(n3>n1&&n3>n2&&n3>n4&&n3>n5)
		{
			System.out.println(" number3 is greater "+n3);
		}
		else if(n4>n1&&n4>n2&&n4>n3&&n4>n5)
		{
			System.out.println(" number4 is greater "+n4);
		}
		else if(n5>n1&&n5>n2&&n5>n4&&n3<n5)
		{
			System.out.println(" number5 is greater "+n5);
		}

	}
}
