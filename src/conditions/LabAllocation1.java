package conditions;
import java.util.Scanner;
public class LabAllocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
System.out.println("Enter the x:");
	      int x = s.nextInt();
	      System.out.println("Enter the y:");
	      int y = s.nextInt();
	      System.out.println("Enter the z:");
	      int z = s.nextInt();

	      if((x<y) && (x<z))

	      {

	        System.out.println("L1 has the minimal seating capacity");

	      }

	      else if((y<x) && (y<z))

	      {

	        System.out.println("L2 has the minimal seating capacity");

	      }

	      else

	      {

	        System.out.println("L3 has the minimal seating capacity");

	      }

	}

}
