package telran.numbers;

public class SportLotoAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}
}
