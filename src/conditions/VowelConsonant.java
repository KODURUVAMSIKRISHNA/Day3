package conditions;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
System.out.println("Enter The Char:");
	      char ch = s.next().charAt(0);

	      if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))

	      {

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

	        {

	          System.out.printf("Vowel");

	        }

	        else

	        {

	          System.out.printf("Consonant");

	        }

	      }

	      else

	      {

	        System.out.printf("Not an alphabet");

	      }
	}

}
