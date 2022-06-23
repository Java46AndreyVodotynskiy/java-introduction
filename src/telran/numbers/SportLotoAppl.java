package telran.numbers;

public class SportLotoAppl {

	public static void main(String[] args) {
		int [] result = getRes();
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
	
	private static int[] getRes() {
		int[] res = new int[7];
		int i = 0;
		while(i < res.length) {
			int num = getRandomNumber(1,49);
			if(indexOf(res, num) == -1)
				res[i] = num;
				i++;	
			}
		return res;
	}
	
	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}
	
	private static int indexOf(int ar[], int number) {
		int res = -1;
		for(int i = 0; i < ar.length; i++) {
			if (ar[i] == number) {
				res = i;
				break;
			}
		}
		return res;
	}
}
