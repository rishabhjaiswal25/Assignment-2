	import java.util.Scanner;
	

	public class my {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			int i,j,k,u,p;
			System.out.println("Enter the 5 numbers ");
			i=sc.nextInt();
			j=sc.nextInt();
			k=sc.nextInt();
			u=sc.nextInt();
			p=sc.nextInt();
			if (i>j && i>k && i>u && i>p) {
				System.out.println("Max number: "+ i);
			}
			else if (j>i && j>k && j>u && j>p) {
				System.out.println("Max number: "+ j);
			}
			else if (k>i && k>j && k>u && k>p) {
				System.out.println("Max number: "+ k);
			}
			else if (u>i && u>j && u>k && u>p) {
				System.out.println("Max number: "+ u);
			}
			else {
				System.out.println("Max number: "+ p);
			}
			}
	

		}
