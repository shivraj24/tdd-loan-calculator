package CarLoan;
import java.lang.Math;

public class CarLoanCalculator {
	
	long principle_amount;
	float interest =  (float)12/12/100;
	long tenure;
	public
	CarLoanCalculator(long p,long t){
		principle_amount = p;
	
		tenure = t;
	}
	public long EMI_Amount()
	{
		long result = 0;
		
		result =  (long) ((principle_amount *interest) * ( Math.pow(1+interest,tenure) / (Math.pow(1+interest, tenure) - 1)));
		
		return result;
		
		
	}
	
	public long TotalPayableAmount()
	{
		
		
		long emi = EMI_Amount();
		
		long months = tenure;
		
		
		
		return (emi*months);
	}

}



