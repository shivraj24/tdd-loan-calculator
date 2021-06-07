import CarLoan.*;
import PersonalLoan.*;
import HomeLoan.*;

import java.util.*;

public class EMICalculator {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select the loan type :");
		System.out.println("1. Home Loan \n 2. Personal Laon \n 3.Car Loan");
		
		int choice = s.nextInt();
		
		
		System.out.println("Enter the Loan Amount");
		long amount = s.nextLong();

		System.out.println("Enter the tenure period");
		long tenure = s.nextLong();
		
		tenure = tenure *12;
		
		switch(choice)
		{
			
			case 1:
				
				HomeLoanCalculator homeLoan = new HomeLoanCalculator(amount,tenure);
				
				System.out.println("1. EMI \n 2.Total Payable Amount");
				int c1 = s.nextInt();
				switch(c1)
				{
					case 1:
						long emi = homeLoan.EMI_Amount();
						System.out.println("EMI : " + emi);
						break;
						
					case 2:
						long total_amount = homeLoan.TotalPayableAmount();
						System.out.println("Total Amount to pay : " + total_amount);
						break;
				}
				
				break;
			case 2:
				 
				PersonalLoanCalculator personalLoan = new PersonalLoanCalculator(amount,tenure);

				System.out.println("1. EMI \n 2.Total Payable Amount");
				
				int c2 = s.nextInt();
				switch(c2)
				{
					case 1:
						long emi = personalLoan.EMI_Amount();
						System.out.println("EMI : " + emi);
						break;
						
					case 2:
						long total_amount = personalLoan.TotalPayableAmount();
						System.out.println("Total Amount to pay : " + total_amount);
						break;
				}
				break;
			
			case 3:
				 
				CarLoanCalculator carLoan = new CarLoanCalculator(amount,tenure); 

				System.out.println("1. EMI \n 2.Total Payable Amount");
				
				int c3 = s.nextInt();
				switch(c3)
				{
					case 1:
						long emi = carLoan.EMI_Amount();
						System.out.println("EMI : " + emi);
						break;
						
					case 2:
						long total_amount = carLoan.TotalPayableAmount();
						System.out.println("Total Amount to pay : " + total_amount);
						break;
				}
				
				break;
				
		}
		
		
	}
		
}
