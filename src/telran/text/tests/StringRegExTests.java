package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.text.Strings.*;

import org.junit.jupiter.api.Test;

class StringRegExTests {

	@Test
	void javaVariableTrue() {

		assertTrue(isJavaVariable("__"));
		assertTrue(isJavaVariable("$"));
		assertTrue(isJavaVariable("$_"));
		assertTrue(isJavaVariable("abc"));
		assertTrue(isJavaVariable("abc100"));
		assertTrue(isJavaVariable("$2"));
		assertTrue(isJavaVariable("_2"));
		assertTrue(isJavaVariable("*2"));

	}
	@Test
	void javaVariableFalse() {
		assertFalse(isJavaVariable("2_"));
		assertFalse(isJavaVariable("_"));
		assertFalse(isJavaVariable("a 2"));

	}
	@Test
	void ipV4True() {
		assertTrue(isIPv4("0.0.0.0"));
		assertTrue(isIPv4("250.0.199.200"));
		assertTrue(isIPv4("250.0.199.249"));
		assertTrue(isIPv4("001.0.2.0"));
		assertTrue(isIPv4("255.255.255.255"));
	}
	@Test
	void ipV4False() {
		assertFalse(isIPv4("0.0.0.0.0"));
		assertFalse(isIPv4("0.*.10.0"));
		assertFalse(isIPv4("-10.0.0.0"));
		assertFalse(isIPv4("100..10.1.1"));
		assertFalse(isIPv4("100.10.1.256"));
		assertFalse(isIPv4("a.10.1.1"));

	}
	
	@Test
	void arifmeticExpressionTrue() {
		assertTrue(isArithmeticExpression("10 + ((a) * 2)"));
		assertTrue(isArithmeticExpression("(10) + ((a))"));
		assertTrue(isArithmeticExpression("a + ((10) * 2)"));
		assertTrue(isArithmeticExpression("__a + ((10.15) / 2)"));
		assertTrue(isArithmeticExpression("__a - ((10.15) / 2)"));
		assertTrue(isArithmeticExpression("__a - ((10.15) / 2) + 5"));
		assertTrue(isArithmeticExpression("__a - ((10.15) / 2) + 5 - 5"));
		assertTrue(isArithmeticExpression("__a - ((1000000.15) / 2) + 5 - 5"));
		assertTrue(isArithmeticExpression("$ - ((1000000.15) / 2) + 5 - 5"));
	}
	
	@Test
	void arifmeticExpressionFalse() {
		assertFalse(isArithmeticExpression("a + ((10)(* 2)"));
		assertFalse(isArithmeticExpression("*a + (10)+( 2)"));
		assertFalse(isArithmeticExpression("a + (10)+(* 2)"));
	}
}
