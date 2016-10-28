package com.calculatorgui.artifact;
import java.util.logging.*;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class CalculatorTest {
	Calculator calculator=new Calculator();
	public static final Logger Log= Logger.getLogger(Calculator.class.getName());
	Random random=new Random();

	@Test
	public void testAdd() {
		double firstno=0.0;
		double secondno=0.0;
		double result=0.0;
		for (int i=0;i<10;i++){
			firstno=random.nextDouble()*100;
			secondno=random.nextDouble()*100;
			result=firstno+secondno;
			Log.info("Testing the add method with the value  :"+firstno+ " And "+secondno);
			assertEquals("The result should be : "+ result,result,calculator.add(firstno, secondno),0.111 );
			assertTrue(result==(firstno+secondno));
		}		
	}

	@Test
	public void testSubtract() {
		double firstno=0.0;
		double secondno=0.0;
		double result=0.0;
		for (int i=0;i<10;i++){
			firstno=random.nextDouble()*100;
			secondno=random.nextDouble()*100;
			result=firstno-secondno;
			Log.info("Testing the add method with the value  :"+firstno+ " And "+secondno);
			assertEquals("The result should be : "+ result,result,calculator.subtract(firstno, secondno),0.111 );
			assertTrue(result==(firstno-secondno));
		}
	}

	@Test
	public void testMultiply() {
		double firstno=0.0;
		double secondno=0.0;
		double result=0.0;
		for (int i=0;i<10;i++){
			firstno=random.nextDouble()*100;
			secondno=random.nextDouble()*100;
			result=firstno*secondno;
			Log.info("Testing the add method with the value  :"+firstno+ " And "+secondno);
			assertEquals("The result should be : "+ result,result,calculator.multiply(firstno, secondno),0.111 );
			assertTrue(result==(firstno*secondno));
		}
	}

	@Test
	public void testDivide() {
		double firstno=0.0;
		double secondno=0.0;
		double result=0.0;
		for (int i=0;i<10;i++){
			firstno=random.nextDouble()*100;
			secondno=random.nextDouble()*100;
			result=firstno/secondno;
			Log.info("Testing the add method with the value  :"+firstno+ " And "+secondno);
			assertEquals("The result should be : "+ result,result,calculator.divide(firstno, secondno),0.111 );
			assertTrue(result==(firstno/secondno));
		}
	}

}
