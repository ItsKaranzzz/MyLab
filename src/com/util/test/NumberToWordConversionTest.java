package com.util.test;

import junit.framework.Assert;

import org.junit.Test;

import com.util.app.NumberToWordConversionApp;

public class NumberToWordConversionTest {

	private static final Class<? extends Throwable> ArrayIndexOutOfBoundsException = null;
	private NumberToWordConversionApp oNumberConversionApp;
	
	@Test
	public void numberOneTest(){
		Assert.assertEquals("One",oNumberConversionApp.convertNumberLessThanOrHundred(1));
	}
	@Test
	public void numberHundredTest(){
		Assert.assertEquals("Hundred",oNumberConversionApp.convertNumberLessThanOrHundred(100));
	}
	@Test
	public void numberHundredThreeTest(){
		Assert.assertEquals("One Hundred Three",oNumberConversionApp.convertNumberGreaterthanHundred(103));
	}
	@Test
	public void numberNineNineNineTest(){
		Assert.assertEquals("Nine Hundred Ninty Nine",oNumberConversionApp.convertNumberGreaterthanHundred(999));
	}
	@Test
	public void numberFivehundredTest(){
		Assert.assertEquals("Five Hundred",oNumberConversionApp.convertNumberGreaterthanHundred(500));
	}
	@Test
	public void numberFiveTest(){
		Assert.assertEquals("Five",oNumberConversionApp.convertNumberLessThanOrHundred(5));
	}
	@Test
	public void numberNinteenTest(){
		Assert.assertEquals("Nineteen",oNumberConversionApp.convertNumberLessThanOrHundred(19));
	}
	@Test
	public void numberSevenThirteenTest(){
		Assert.assertEquals("Seven Hundred Thirteen",oNumberConversionApp.convertNumberGreaterthanHundred(713));
	}
	@Test
	public void numberTwentyTest(){
		Assert.assertEquals("Twenty",oNumberConversionApp.convertNumberLessThanOrHundred(20));
	}
	@Test
	public void numberTwentyNineTest(){
		Assert.assertEquals("Twenty Nine",oNumberConversionApp.convertNumberLessThanOrHundred(29));
	}
	@Test
	public void numberSeventyNineTest(){
		Assert.assertEquals("Seventy Nine",oNumberConversionApp.convertNumberLessThanOrHundred(79));
	}
	@Test
	public void numberThirtyFourTest(){
		Assert.assertEquals("Thirty Four",oNumberConversionApp.convertNumberLessThanOrHundred(34));
	}
	
	@Test
	public void numberSevenHundredFiftyTest(){
		Assert.assertEquals("Seven Hundred Fifty",oNumberConversionApp.convertNumberGreaterthanHundred(750));
	}
	@Test
	public void numberThreeHundredTwelveTest(){
		Assert.assertEquals("Three Hundred Twelve",oNumberConversionApp.convertNumberGreaterthanHundred(312));
	}
	
}
