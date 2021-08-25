package conditions;
import java.util.Scanner;
public class Comparision2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);

	      int a = s.nextInt();

	      int b = s.nextInt();

	      if(a<b)

	      {

	      System.out.printf("%d less than %d",a,b);

	      }

	      else if(a>b)

	      {

	      System.out.printf("%d greater than %d",a,b);

	      }

	      else

	      {

	      System.out.printf("%d and %d are equal",a,b);

	      }


	}

}
