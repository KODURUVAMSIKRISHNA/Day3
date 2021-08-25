package conditions;
import java.util.Scanner;
public class HotelTraffi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	    int m=sc.nextInt();

	    float r=sc.nextFloat();

	    int d=sc.nextInt();

	    float t=r*d;

	    double tr=(1.2)*r*d;

	    switch(m)

	    {

	        case 1:

	                System.out.printf("Hotel Tariff: Rs.%.2f",t);

	                break;

	        case 2:

	                System.out.printf("Hotel Tariff: Rs.%.2f",t);

	                break;

	        case 3:

	                System.out.printf("Hotel Tariff: Rs.%.2f",t);

	                break;

	        case 4:

	                System.out.printf("Hotel Tariff: Rs.%.2f",tr);

	                break;

	        case 5:

	                System.out.printf("Hotel Tariff: Rs.%.2f",tr);

	                break;

	        case 6:

	                System.out.printf("Hotel Tariff: Rs.%.2f",tr);

	                break;

	        case 7:

	               System.out.printf("Hotel Tariff: Rs.%.2f",t);

	               break;

	        case 8:

	                System.out.printf("Hotel Tariff: Rs.%.2f",t);

	                break;

	        case 9:

	                System.out.printf("Hotel Tariff: Rs.%.2f",t);

	                break;

	        case 10:

	                System.out.printf("Hotel Tariff: Rs.%.2f",t);

	                break;

	        case 11:

	                System.out.printf("Hotel Tariff: Rs.%.2f",tr);

	                break;

	        case 12:

	                System.out.printf("Hotel Tariff: Rs.%.2f",tr);

	                break;

	        default:

	            System.out.println("Invalid Input");

	       }

	}

}
