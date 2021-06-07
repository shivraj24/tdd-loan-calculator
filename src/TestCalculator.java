import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import CarLoan.*;
import PersonalLoan.*;
import HomeLoan.*;


public class TestCalculator {

	@Test
	void test1() {
		long amount = 500000;
		long tenure = 2*12;
		HomeLoanCalculator homeLoan = new HomeLoanCalculator(amount,tenure);
		
		Assert.assertEquals(homeLoan.EMIamount(), 22386);
	}
	
	
	@Test
	void test2() {
		long amount = 500000;
		long tenure = 2*12;
		CarLoanCalculator carLoan = new CarLoanCalculator(amount,tenure);
		
		Assert.assertEquals(carLoan.EMIamount(), 23536);
	}
	
	
	@Test
	void test3() {
		long amount = 500000;
		long tenure = 2*12;
		PersonalLoanCalculator personalLoan = new PersonalLoanCalculator(amount,tenure);
		
		Assert.assertEquals(personalLoan.EMIamount(), 23072);
	}
	
	@Test
	void test4() {
		long amount = 500000;
		long tenure = 2*12;
		PersonalLoanCalculator personalLoan = new PersonalLoanCalculator(amount,tenure);
		
		Assert.assertEquals(personalLoan.total_payable_amount(), 553728);
	}
	
	
	@Test
	void test5() {
		long amount = 500000;
		long tenure = 2*12;
		CarLoanCalculator carLoan = new CarLoanCalculator(amount,tenure);
		
		Assert.assertEquals(carLoan.total_payable_amount(), 564864);
	}
	
	@Test
	void test6() {
		long amount = 500000;
		long tenure = 2*12;
		HomeLoanCalculator homeLoan = new HomeLoanCalculator(amount,tenure);
		
		Assert.assertEquals(homeLoan.total_payable_amount(), 537264);
	}

}
