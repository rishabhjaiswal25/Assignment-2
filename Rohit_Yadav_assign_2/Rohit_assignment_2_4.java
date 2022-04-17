package assignment_2;
import java.util.Scanner;

public class Rohit_assignment_2_4 {

	public static void main(String[] args) {
		System.out.println("Enter the number of people to take their information");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Kindly fill your details");
		for(int i = 1; i<=num;i++) {
			System.out.println("Applicant no."+i);
			sc.nextLine();
			System.out.println("1.Enter your Name");
			String name =sc.nextLine();
			System.out.println("2. Enter your age");
			int age =sc.nextInt();
			System.out.println("3. Enter your college name");
			String col =sc.nextLine();
			sc.nextLine();
			System.out.println("4. Enter your college city name");
			String cit = sc.nextLine();
			System.out.println("5. Enter your Branch or Course name");
			String cou = sc.nextLine();
			System.out.println("---------------------------------------------------");
			
			
		}

	}

}
