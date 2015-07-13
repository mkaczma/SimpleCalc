package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@DataProvider(name = "dataProviderForTwoArguments")
	public Object[][] dataProviderTwoArguments() {
		return new Object[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 }, { 7, 8 }, { 8, 9 },
				{ 9, 1 }, };
	}

	@DataProvider(name = "dataProviderForOneArgument")
	public Object[][] dataProviderOneArguments() {
		return new Object[][] { { 1 }, { 2 }, { 3 }, { 4 }, { 5 } };
	}

	@Test(dataProvider = "dataProviderForTwoArguments")
	public void addingTest(int x, int y) {

		// Given

		// When
		int z = simpleCalculator.add(x, y);

		// Than
		Assert.assertEquals(z, x + y);

	}

	@Test(dataProvider = "dataProviderForTwoArguments")
	public void minusTest(int x, int y) {

		// Given

		// When
		int z = simpleCalculator.minus(x, y);

		// Than
		Assert.assertEquals(z, x - y);

	}

	@Test(dataProvider = "dataProviderForTwoArguments")
	public void mulltyplingTest(int x, int y) {

		// Given

		// When
		int z = simpleCalculator.multiply(x, y);

		// Than
		Assert.assertEquals(z, x * y);

	}

	@Test(dataProvider = "dataProviderForTwoArguments")
	public void divideTest(int x, int y) {

		// Given

		// When
		float z = simpleCalculator.divide(x, y);

		// Than
		Assert.assertEquals(z, (float) (x / y));

	}

	@Test(dataProvider = "dataProviderForOneArgument")
	public void addingToMemoryTest(int x) {

		// Given

		// When
		simpleCalculator.setMemory(0);
		simpleCalculator.addToMemory(x);

		// Than
		Assert.assertEquals(simpleCalculator.getMemory(), x);

	}

	@Test(dataProvider = "dataProviderForOneArgument")
	public void settingToMemoryTest(int x) {

		// Given

		// When
		simpleCalculator.setMemory(x);

		// Than
		Assert.assertEquals(simpleCalculator.getMemory(), x);

	}
}
