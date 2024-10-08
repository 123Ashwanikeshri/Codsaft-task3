package Task3;
import java.util.Scanner;
public class Currency_Converter {
	
	public static double usdToRupee(double USD) {
		return USD*84.04;
	}
	public static double RupeeToUsd(double Rupee) {
		return Rupee * 0.012;
	}
	public static double  euroToRupee(double EURO) {
		return EURO * 92.22;
	}
	
	public static double RupeeToEuro(double Rupee) {
		return Rupee * 0.0113;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Currency Converter");
		System.out.println("1. USD to Rupees");
		System.out.println("2. Rupees to USD");
		System.out.println("3. Euro to Rupees");
		System.out.println("4. Rupees to Euro");
		System.out.print("Enter the your choice (1 or 2 or 3 or 4)");
		int choice = sc.nextInt();
		
		
		if(choice == 1) {
			System.out.println("Enter the amount in USD : ");
			double USD = sc.nextDouble();
			double Rupee = usdToRupee(USD);
			System.out.println("Converted amount in Rupee : "+ Rupee);	
		}
		else if(choice == 2) {
			System.out.println("Enter the amount in Rupee : ");
			double Rupee = sc.nextDouble();
			double USD = RupeeToUsd(Rupee);
			System.out.println("Converted amount in USD : "+USD);
		}
		
		else if(choice == 3) {
			System.out.println("Enter the amount in Euro : ");
			double EURO = sc.nextDouble();
			double Rupee = euroToRupee(EURO);
			System.out.println("Converted amount in USD : "+Rupee);
		}
		
		else if(choice == 4) {
			System.out.println("Enter the amount in Rupee : ");
			double Rupee = sc.nextDouble();
			double EURO = RupeeToEuro(Rupee);
			System.out.println("Converted amount in USD : "+EURO);
		}
		
		else {
			System.out.println("Invalod choice .Please Select 1 or 2 or 3 or 4");
		}

	}

}
