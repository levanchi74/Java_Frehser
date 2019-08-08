package com.dxc.demo.junit.advance;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SecondTestSuite.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println("Failure: " + failure.toString());
		}
		
		System.out.println("Number of Success: " + (result.getRunCount() - result.getFailureCount()));
	}
}
