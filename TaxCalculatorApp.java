package secondAs;

import java.util.Scanner;

public class TaxCalculatorApp {
	
	public static void calculateTax(String name, long income) {
		
		double tax = 0.0;
		
		if(income>=300000) {
			tax=0.2*income;
		}else if(income>=1) {
			tax = 0.1*income;
		}
		
		//result
		System.out.println("Tax for " +name+": "+tax);
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Tax Calculator App\n------Welcome------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total person count");
		int num = sc.nextInt();
		
		// for extra new line 
		sc.nextLine();
		
		String []names = new String [num];
		long []incomes = new long [num];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name "+(i+1)+": ");
			names[i]=sc.nextLine();
		}
		
		for (int i = 0; i < incomes.length; i++) {
			System.out.println("Enter income of "+(i+1)+": ");
			incomes[i]=sc.nextLong();
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("\n*******Calculation******\n");
			System.out.println("entered names : "+names[i]);
			System.out.println("entered incomes : "+incomes[i]);
			System.out.println();
			calculateTax(names[i], incomes[i]);
			System.out.println("*******Calculation******\n");
			

		}
		sc.close();
				
		
//		int i =0;
		
//		for(String name :names) {
//			System.out.println("Enter name "+(i+1)+": ");
//			names[i]=sc.nextLine();
//			i++;
//		}
//		i=0;
//		for(long income:incomes) {
//			System.out.println("Enter income "+(i+1)+": ");
//			incomes[i]=sc.nextLong();
//			i++;
//		}
		
//		System.out.println();
//		for(String name :names) {
//			System.out.println(name);
//		}
		
		
		
		
	}
}
