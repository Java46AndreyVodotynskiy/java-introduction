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

	public static void sort(int[] ar) {
		int index = 0;
		for(int i = 0; i < ar.length; i++) {
			if(moveMaxToEnd(ar, index) == 0) {
				break;
			} else {
				 moveMaxToEnd(ar, index);
				 index++;
			}
		}
		
	}

	private static int moveMaxToEnd(int[] ar, int index) {
		int count = 0;
		for(int i = 1; i < ar.length - index; i++) {
			if(ar[i - 1] > ar[i]) {
				swap(ar, i);
				count++;
			}
		}
		return count;
	}

	private static void swap(int[] ar, int i) {
		int tmp = ar[i - 1];
		ar[i - 1] = ar[i];
		ar[i] = tmp;
		
	}

	public static int binaryIndexOf(int[] ar, int number) {
		int left = 0;
		int rigth = ar.length - 1;
		int middle = ar.length / 2;
		while(left <= rigth && ar[middle] != number) {
			if(ar[middle] < number) {
				left = middle + 1;
			} else {
				rigth = middle - 1;
			}
			middle = (left + rigth) / 2;
		}
		if(ar[middle] == number) {
			for(int i = 0; i < middle - 1; i++) {
				if(ar[i] == number) {
					return i;
				}
			}
		}
		return left > rigth ? -(left + 1): middle;
	}
}
