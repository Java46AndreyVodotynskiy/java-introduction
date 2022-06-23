package telran.numbers;

import java.util.Arrays;

public class ArrayInt {
	public static int[] addNumber(int ar[], int number) {
		int res[] = Arrays.copyOf(ar, ar.length + 1);
		res[res.length - 1] = number;
		return res;
	}
	
	public static int[] insertNumber(int ar[], int index, int number) {
		int[] newAr = new int[ar.length + 1];
		System.arraycopy(ar, 0, newAr, 0, index);
		newAr[index] = number;
		System.arraycopy(ar, index, newAr, index + 1, ar.length - index);
		return newAr;	
	}
	
	public static int[] removeNumber(int ar[], int index) {
		int[] newAr = new int[ar.length - 1];
		System.arraycopy(ar, 0, newAr, 0, index);
		System.arraycopy(ar, index + 1, newAr, index, newAr.length - index);
		return newAr;
	}
	
	public static int indexOf(int ar[], int number) {
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == number) {
				return i;
			}
		}
		return -1;	
	}
	
	

}
