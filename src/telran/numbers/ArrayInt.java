package telran.numbers;

public class ArrayInt {
	public static int[] addNumber(int ar[], int number) {
		int res[] = new int[ar.length + 1];
		for(int i = 0; i < ar.length; i++) {
			res[i] = ar[i];
		}
		res[res.length - 1] = number;
		return res;
	}
	
	public static int[] insertNumber(int ar[], int index, int number) {
		
		return null;	
	}
	
	public static int[] removeNumber(int ar[], int index) {
		
		return null;
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

