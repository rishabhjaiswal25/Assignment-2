package new_pakage;
import java.util.*;
public class alphabate_tiangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row:");
		int a=sc.nextInt();
		int letter=65;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+letter-1));
			}
			System.out.println();
		}
	}

}
