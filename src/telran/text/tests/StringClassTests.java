package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringClassTests {
//
//	@Test
//	void deepCompareTests() {
//		String str1 = "123,tT89";
//		String str2 = "123,tT89";
//		String str3 = "19";
//		String str5 = "98Tt,321";
//		String str4 = "kugy";
//		int expected1[] = {8, 0};
//		int expected2[] = {1, 1};
//		int expected3[] = {0, 8};
//		int expected4[] = {0, 0};
//		assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));	
//		assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
//		assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
//		assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
//	}
//	
//	@Test
//	void isAnagramTests() {
//		String str1 = "Hello";
//		String str2 = "Helll";
//		String str3 = "eloHl";
//		String str4 = "Helo";
//		assertTrue(Strings.isAnagram(str1, str3));
//		assertFalse(Strings.isAnagram(str1, str2));
//		assertFalse(Strings.isAnagram(str1, str4));
//		assertTrue(Strings.isAnagram(str1, str1));
//	}
	
	@Test
	void stringMatchesTest() {
		assertEquals("match", Strings.matches("David", "david"));
		assertEquals("match", Strings.matches("John F", "John Fitzgerald"));
		assertEquals("no match", Strings.matches("John K", "John Fitzgerald"));
		assertEquals("match", Strings.matches("Anna Maria Magdalena", "Anna Magdalena"));
		assertEquals("match", Strings.matches("Anna Maria Magdalena", " Maria Magdalena"));
		assertEquals("no match", Strings.matches("Anna Maria Magdalena", "Anna Roberta"));
		assertEquals("no match", Strings.matches("Anna Maria Magdalena", "Anna Maria Roberta"));
		assertEquals("match", Strings.matches("Anna Maria Magdalena", "Anna Maria Magdalena"));
		assertEquals("no match", Strings.matches("Anna Maria Magdalena", "Anna Magdalena Roberta"));
		assertEquals("no match", Strings.matches("Anna Maria Magdalena", "Anna Magdalena Maria"));
	}
	
	@Test
	void sortStringsAsNumbersTest() {
		String array[] = {"23", "123", "123", "223", "13", "653", "23"};
		String expected[] = {"13", "23", "23", "123", "123", "223", "653"};
		Strings.sortStringsAsNumbers(array);
		assertArrayEquals(expected, array);
	}
 	
}
