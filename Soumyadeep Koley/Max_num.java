import java.util.*;

public class Max_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt(); 
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum NUmber is:"+max); 
	}	
}
