import java.util.Scanner;
class Main {
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