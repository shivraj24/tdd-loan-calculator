package HomeLoan;

import java.util.*;
import java.lang.Math;

public class HomeLoanCalculator{
	long principle_amount;
	float interest =  (float)7/12/100;
	long tenure;
	public
	HomeLoanCalculator(long p,long t){
		principle_amount = p;
		tenure = t;
	}
	public long EMIamount()
	{
		long result = 0;
		
		result =  (long) ((principle_amount *interest) * ( Math.pow(1+interest,tenure) / ((Math.pow(1+interest, tenure)) - 1)));
		
		return result;
		
		
	}
	
	public long total_payable_amount()
	{
		
		
		long emi = EMIamount();
		
		long months = tenure;
		
		
		
		return (emi*months);
	}
	
}