package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsStandartTests {

	private static final int N_RUBS = 10000;
	private static final int N_STRINGS = 10000;

	@Test
	void stringArraysTest() throws UnsupportedEncodingException {
		String strEnglish = "hello";
		String strHebrew = "שלום";
		char arCh[] = {'h', 'e', 'l', 'l', 'o'};
		byte arBytes[] = {'h', 'e', 'l', 'l', 'o'};
		assertArrayEquals(arCh, strEnglish.toCharArray());
		assertArrayEquals(arBytes, strEnglish.getBytes());
		assertEquals(5, strEnglish.getBytes().length);
		assertEquals(4, strHebrew.toCharArray().length);
		assertEquals(8, strHebrew.getBytes("utf-8").length);
	}
	
	@Test
	void equalsStrings() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		assertTrue(str1==str2);
		assertFalse(str1==str3);
		assertTrue(str1.equals(str3));
		assertEquals(str1, str3);
	}
	
	@Test
	void comparingStrings() {
		String str1 = "123456789";
		String str2 = "ab";
		String str3 = "Ab";
		String str4 = "aB";
		assertTrue(str1.compareTo(str2)<0);
		assertTrue(str2.compareTo(str3)>0);
		assertEquals(0, str2.compareToIgnoreCase(str4));
		assertEquals(0, str2.compareTo(str4.toLowerCase()));
	}
	
	@Test
	void indexOfTests() {
		String str = "Hello";
		assertEquals(2, str.indexOf('l'));
		assertEquals(3, str.lastIndexOf('l'));
		assertEquals(-1, str.indexOf('a'));
	}
	
	@Test
	void formatTest() {
		String strExpected = "A=5";
		int b = 10;
		assertEquals(strExpected, String.format("a=%d", b / 2));
	}
	
	@Test
	void replaceTest() {
		String str = "Hello";
//		str = str.concat(" Vasya");
//		str.replace("ello", "allo");
//		assertEquals("Hallo", str);
		StringBuilder strBuilder = new StringBuilder("Hello");
		strBuilder.replace(1, 5, "allo");
		assertEquals("Hallo", strBuilder.toString());
	}
	
	@Test
	void joinTest() {
		String array[] = {"Hello", "Vasya"};
		String expected = "Hello Vasya";
		assertEquals(expected, Strings.join(array, " "));
	}
	
	@Test
	void joinPerfomanceTest() {
		String array[] = getBigArray();
		for(int i = 0; i < N_RUBS; i++) {
			Strings.join(array, " ");
		}
	}

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for(int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}
	
	

}
