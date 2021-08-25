package conditions;
import java.util.Scanner;
public class FeeCOllection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
System.out.println("Enter the student type");
	      String t = s.next();
	      System.out.println(" Enter tuition fee:");
	      int f = s.nextInt();
	      System.out.println("Enter Bus fee:");
	      int b = s.nextInt();
	      System.out.println("Enter Hostel fee:");
	      int h = s.nextInt();

	      double a = f+b;

	      double c = f+h;

	      double d = (((f/100)*150)+b);

	      double e = (((f/100)*150)+h);

	      switch(t){

	        case "MSDS":

	          System.out.printf("%.0f",a);

	          break;

	        case "MSH":

	          System.out.printf("%.0f",c);

	          break;

	        case "MGSDS":

	          System.out.printf("%.0f",d);

	          break;

	        case "MGSH":

	          System.out.printf("%.0f",e);

	          break;

	        default:

	          System.out.printf("Invalid");

	      }
	}

}
