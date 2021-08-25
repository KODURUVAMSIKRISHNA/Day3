package conditions;
import java.util.Scanner;
public class Y2K {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
System.out.println("Enter year of Birth:");
	      int a = s.nextInt();
	      System.out.println("Enter current year:");
	      int b = s.nextInt();

	      int c = (100-a)+b;

	      int d = b-a;

	      if(a>b)

	      {

	        System.out.printf("Your age is:%d",c);

	      }

	      else

	      {

	        System.out.printf("Your age is:%d",d);

	      }
	}

}
