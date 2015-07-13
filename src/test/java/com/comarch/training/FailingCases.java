package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FailingCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test(groups = "addToMemory", dependsOnGroups = "minus")
	public void addingToMemoryTestFailing() {

		// Given
		int x = 5;
		int y = 10;

		// When
		simpleCalculator.setMemory(0);
		simpleCalculator.addToMemory(x);
		simpleCalculator.addToMemory(y);

		// Than
		Assert.assertEquals(simpleCalculator.getMemory(), 15);

	}

	@Test(groups = "setToMemory", dependsOnGroups = "minus")
	public void settingToMemoryTestFailing() {

		// Given
		int x = 5;

		// When
		simpleCalculator.setMemory(x);

		// Than
		Assert.assertEquals(simpleCalculator.getMemory(), 5);

	}

	@Test(groups = "minus")
	public void minusTestFailing() {

		// Given
		int x = 5;
		int y = 10;

		// When
		int z = simpleCalculator.minus(x, y);

		// Than
		Assert.assertEquals(z, 5);

	}

}
