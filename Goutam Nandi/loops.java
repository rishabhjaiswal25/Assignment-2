package new_pakage;
 import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
	Scanner sys=new Scanner(System.in);
	System.out.println("enter five numbers:");
	int a=sys.nextInt();
	int b=sys.nextInt();
	int c=sys.nextInt();
	int d=sys.nextInt();
	int e=sys.nextInt();
	if(a>b && a>c && a>d && a>e)
	{
		System.out.println(a+ "Is the greatest number");
	}
	else if(b>a && b>c && b>d && b>e)
	{
		System.out.println(b+ "Is the greatest number");
	}
	else if(c>a && c>b && c>d && c>e)
	{
		System.out.println(c+ "Is the greatest number");
	}
	else if(d>a && d>b && d>c && d>e)
	{
		System.out.println(d+ "Is the greatest number");
	}
	else 
	{
		System.out.println(e+ "Is the greatest number");
	}
}
}
