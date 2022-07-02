package telran.text;

import java.util.Arrays;

public class Strings {
	public static int[] deepNoRepeatedCompare(String str1,String str2) {
		
//		int res[] = new int[2];
//		char arStr1[] = str1.toCharArray();
//		char arStr2[] = str2.toCharArray();
//		int letterIndex[] = new int['z'];
//		
//		for(int i = 0; i < str1.length(); i++) {
//			char tmp = arStr1[i];
//			letterIndex[tmp] = 1;
//		}
//		
//		for(int i = 0; i < arStr1.length; i++) {
//			if(i > arStr2.length - 1) {
//				break;
//			}
//			if(arStr1[i] == arStr2[i]) {
//				res[0] = res[0] + 1;
//			}
//			char tmp = arStr2[i];
//			if(arStr1[i] != arStr2[i] && letterIndex[tmp] == 1) {
//				res[1] = res[1] + 1;
//			}
//		}
//		return res;
		
		int res[] = new int[2];
		char arStr1[] = str1.toCharArray();
		char arStr2[] = str2.toCharArray();
	
		for(int i = 0; i < arStr1.length; i++) {
			if(i > arStr2.length - 1) {
				break;
			}
			if(arStr1[i] == arStr2[i]) {
				res[0] = res[0] + 1;
			}
			
			if(arStr1[i] != arStr2[i] && str1.indexOf(arStr2[i]) != -1) {
				res[1] = res[1] + 1;
			}
		}
		return res;
	}

	public static boolean isAnagram(String str1, String str2) {
		boolean isAnagram = false;
		int count = 0;
		char arStr1[] = str1.toCharArray();
		char arStr2[] = str2.toCharArray();
		
		if(str1.length() != str2.length()) {
			return isAnagram;
		}
		
		Arrays.sort(arStr1);
		Arrays.sort(arStr2);
		
		for(int i = 0; i < str1.length(); i++) {
			if(arStr1[i] == arStr2[i]) {
				count++;
			}
		}

		if(count == arStr1.length) {
			isAnagram = true;
		}
		
		return isAnagram;
	}

}
