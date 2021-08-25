package conditions;
import java.util.Scanner;
public class SeatAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of rows:");
			a=sc.nextInt();
			System.out.println("Enter the number of columns:");
			b=sc.nextInt();
			System.out.println("Enter the rollnumber of the student:");
			c=sc.nextInt();
			if(c<=b||c%b==1||c%b==0)
	        {
	          System.out.println("yes");
	         }
	         else
	        {
	         System.out.println("no");
	         }
	}

}
