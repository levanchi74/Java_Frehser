package com.dxc.test.refactor2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FeeCalculationTest2 {

	FeeCalculation feeCalculation;
	
	@Before
	public void init() {
		feeCalculation = new FeeCalculation();
	}
	
	@Test
	public void testNoAccount() {
		Account[] accounts = Account[0];
		
		float totalFee = feeCalculation.calculateFee(accounts);
		
		assertEquals((float) 0, totalFee, 0.0001);
	}

}
