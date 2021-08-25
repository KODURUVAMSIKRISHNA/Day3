package conditions;
import java.util.Scanner;
public class LabAllocation2 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the x:");
	int x=sc.nextInt();
	System.out.println("Enter the y:");
    int y=sc.nextInt();
    System.out.println("Enter the z:");
    int z=sc.nextInt();
    System.out.println("Enter the lab allocated for ACE training");
    String str=sc.next();

    if(str.equals("L1"))

    {

        if(y<z)

        {

            System.out.println("L2 has the minimal seating capacity");

        }

        else

        {

            System.out.println("L3 has the minimal seating capacity");

        }

    }

    else if(str.equals("L2"))

    {

        if(x<z)

        {

            System.out.println("L1 has the minimal seating capacity");

        }

        else

        {

            System.out.println("L3 has the minimal seating capacity");

        }

    }

    else if(str.equals("L3"))

    {

        if(x<y)

        {

            System.out.println("L1 has the minimal seating capacity");

        }

        else

        {

            System.out.println("L2 has the minimal seating capacity");

        }

    }

    

}

}
