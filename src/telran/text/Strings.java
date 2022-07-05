package telran.text;

public class Strings {
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
	//TODO
		//Hints for two different implementations
		//   first: additional helper array such that array['a'] 
		//          is an index of the symbol 'a' in str1 or -1
		//          example, str1 - "ctab" then array['a'] = 2;
		// ************************************************
		//   second: implementation based on the method indexOf
		int res[] = new int[2];
		/*******************************************/
		//first implementation O[N]
		//helperImpl(str1, str2, res);
		/********************************************/
		//second implementation based on indexOf O[N^2]
		indexOfImpl(str1, str2, res);
		
	return res;
}
private static void indexOfImpl(String str1, String str2, int[] res) {
	char str2Ar[] = str2.toCharArray();
	for(int i = 0; i < str2Ar.length; i++) {
		int index = str1.indexOf(str2Ar[i]);
		if (index >= 0) {
			res[index == i ? 0 : 1]++;
		}
	}
}
private static void helperImpl(String str1, String str2, int[] res) {
	int helper[] = new int [127];

	fillInitHelper(helper);
	fillHelperString1(str1, helper);
fillResult(helper, res, str2);
}
private static void fillInitHelper(int[] helper) {
	for(int i = 0; i < helper.length; i++) {
		helper[i] = -1;
	}
	
}
private static void fillResult(int[] helper, int[] res, String str2) {
	char str2Ar[] = str2.toCharArray();
	for (int i = 0; i < str2Ar.length; i++) {
		int index = helper[str2Ar[i]];
		if (index >= 0) {
			res[index == i ? 0 : 1]++;
			
		
		}
	}
}
private static void fillHelperString1(String str1, int[] helper) {
	char str1Ar[] = str1.toCharArray();//abcde  helper['d']==3
	for (int i = 0; i < str1Ar.length; i++) {
		helper[str1Ar[i]] = i;
	}
}
	/**
	 * 
	 * @param str1 English letters (may have repeats)
	 * @param str2 English letters (may have repeats)
	 * @return true if :
	 *     (1) str2 has the same as str1 length
	 *     (2) str2 comprises of all letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {
		
		// additional helper array such that array['a'] is the number of 'a' occurrences in str1
		//str1 = "hello", array['l'] = 2; array['w'] = 0;
		
		if (str1.length() != str2.length()) {
			return false;
		}
		int [] helper = new int[127];
		fillHelperOccurrences(str1, helper);
		return isAnagram(str2, helper);
		
	}
	private static boolean isAnagram(String str, int[] helper) {
		char[] strAr = str.toCharArray();
		for(int i = 0; i < strAr.length; i++) {
			int count = helper[strAr[i]]--; //d = ++c vs. d = c++
			if (count == 0) {
				return false;
			}
		}
		return true;
	}
	private static void fillHelperOccurrences(String str, int[] helper) {
		char[] strAr = str.toCharArray();
		
		for(int i = 0; i < strAr.length; i++) {
			helper[strAr[i]]++;
		}
		
	}
	
	static public String join(String[] array, String delimiter) {
		//STring "+" operator based solution
		return stringPluseSolution(array, delimiter);
		//StringBuilder attend based solution
		//return stringBuilderSolution(array, delimiter);
	}
	static private String stringBuilderSolution(String[] array, String delimiter) {
		StringBuilder strBuilder = new StringBuilder(array[0]);
		for(int i = 1; i < array.length; i++) {
			strBuilder.append(delimiter).append(array[i]);
		}
		return strBuilder.toString();
	}
	static private String stringPluseSolution(String[] array, String delimiter) {
		String res = array[0]; //assumption: there is at least one string
		for(int i = 1; i < array.length; i++) {
			res += delimiter + array[i] ;
		}
		return res;
	}
	/**
	 * 
	 * @param name1 -  first name 
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO)
	 */
	static public String matches(String name1, String name2) {
		//TODO
//      String matches(String name1, String name2)
//      Names match under the following conditions, after breaking each one into "name parts" on whitespace :
//      - Two name parts match if they are the same (case insensitive) or one is a single letter initial and the other is longer but starts with the same letter.
//      - A name part in  the name1 may be missing from the name2
//      - Name parts in one name must not contradict name parts in the other
//      - Name parts that match must be in the same order in both names
		return "no match";
	}
	/**
	 * sorts array of strings
	 * @param strNumbers array of strings containing the positive integer numbers
	 * length of each string can not be more than three symbols
	 * String containing "123" should be greater than string containing "23" as the number 123 greater than
	 * number 23
	 */
	static public void sortStringsAsNumbers(String[] strNumbers) {
		//TODO
		//Algorithm complexity should be O[N]
		//Implementation hint: additional helper array such that ar[10] - count of occurrences
		//of number 10 in the given array
		//find out how to get number from a string and how to convert number to string
	}
}