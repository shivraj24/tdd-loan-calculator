import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import CarLoan.*;
import PersonalLoan.*;
import HomeLoan.*;


public class TestCalculator {

	@Test
	void HomeLoanEMI() {
		long amount = 500000;
		long tenure = 2*12;
		HomeLoanCalculator homeLoan = new HomeLoanCalculator(amount,tenure);
		
		Assert.assertEquals(homeLoan.EMI_Amount(), 22386);
	}
	
	
	@Test
	void CarLoanEMI() {
		long amount = 500000;
		long tenure = 2*12;
		CarLoanCalculator carLoan = new CarLoanCalculator(amount,tenure);
		
		Assert.assertEquals(carLoan.EMI_Amount(), 23536);
	}
	
	
	@Test
	void PersonalLoanEMI() {
		long amount = 500000;
		long tenure = 2*12;
		PersonalLoanCalculator personalLoan = new PersonalLoanCalculator(amount,tenure);
		
		Assert.assertEquals(personalLoan.EMI_Amount(), 23072);
	}
	
	@Test
	void PersonalLoan_TotalPayableAmount() {
		long amount = 500000;
		long tenure = 2*12;
		PersonalLoanCalculator personalLoan = new PersonalLoanCalculator(amount,tenure);
		
		Assert.assertEquals(personalLoan.TotalPayableAmount(), 553728);
	}
	
	
	@Test
	void CarLoan_TotalPayableAmount() {
		long amount = 500000;
		long tenure = 2*12;
		CarLoanCalculator carLoan = new CarLoanCalculator(amount,tenure);
		
		Assert.assertEquals(carLoan.TotalPayableAmount(), 564864);
	}
	
	@Test
	void HomeLoan_TotalPayableAmount() {
		long amount = 500000;
		long tenure = 2*12;
		HomeLoanCalculator homeLoan = new HomeLoanCalculator(amount,tenure);
		
		Assert.assertEquals(homeLoan.TotalPayableAmount(), 537264);
	}

}
