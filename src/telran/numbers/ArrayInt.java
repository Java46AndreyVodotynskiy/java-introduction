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
 		boolean flSorted = true;
 		int length = ar.length;
 		do {
 			flSorted = moveMaxToEnd(ar, length);
 			length--;
 		}while(!flSorted);


 	}
 
 	private static boolean moveMaxToEnd(int[] ar, int length) {
 		boolean flSorted = true;
 		for(int i = 1; i < length; i++) {
 			if (ar[i - 1] > ar[i]) {
 				flSorted = false;
 				swap(ar, i);
 			}
 		}
 		//TODO
 		//Improve algorithm of moveMaxToEnd:
 		// (1) no compare of elements that already exist on the proper places
 		// (think of additional parameter of the method with code update)
 		// (2) terminate algorithm once an array is already sorted (think of returning some
 		// value with code update)
 		return flSorted;

 	}
 	
	private static void swap(int[] ar, int index) {
		int tmp = ar[index -1];
		ar[index -1] = ar[index];
		ar[index] = tmp;
		
	}


	public static int binaryIndexOf(int[] ar, int number) {
		int left = 0;
		int right = ar.length - 1;
		int middle = ar.length / 2;
		while (left <= right && ar[middle] != number) {
			if (ar[middle] < number) {
				left = middle + 1; //looking for the number will be in right part of the array
			} else {
				right = middle - 1; //looking for the number will be in the left part of the array
 			}
 			middle = (left + right) / 2;
 		}

 		return left > right ? -(left + 1) : getFirstIndex(ar, middle, number);
 		//TODO
 		// fix the code for performing the method in accordance with the above definition (see the tests)
 	}
	
 	private static int getFirstIndex(int[] ar, int middle, int number) {
 		while(middle >= 0 && ar[middle]==number) {
 			middle--;
 		}
 		return middle + 1;
 	}
 }