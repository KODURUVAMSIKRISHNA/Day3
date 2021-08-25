import java.util.Scanner;
public class Fruitseller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
System.out.println("Enter the price of a dozen mangoes:");
	        float a=s.nextFloat();
	        System.out.println("Enter the price of a one mangoe:");
	        float b=s.nextFloat();

	        if(a>(b*12))

	        System.out.printf("Loss : Rs.%.2f",(a-b*12));

	        else if(a<(b*12))

	        System.out.printf("Profit : Rs.%.2f",(a-b*12));

	        else

	        System.out.println("No profit nor loss");
	}

}
