package telran.numbers;

public class IntegerPrimitives {
	public static byte getMaxByte() {
		byte res = 1;
		while(res>0) {
			res = (byte) ((int)res * 2);
		}
		return (byte) (res-1);
	}

	public static byte getMinByte() {
		return (byte)(getMaxByte() + 1);
	}

	public static byte getLengthByte() {
		return (byte) getLength(Byte.SIZE);
	}

	public static char getMaxChar() {
		char res = 1;
		while(res>0) {
			res = (char) ((int)res * 2);
		}
		return (char) (res-1);
	}

	public static char getMinChar() {
		return (char)(getMaxChar() + 1);
	}

	public static int getLengthChar() {
		System.out.println(Character.SIZE);
		return getLength(Character.SIZE);
	}

	public static short getMaxShort() {
		short res = 1;
		while(res>0) {
			res= (short) ((int)res * 2);
		}
		return (short) (res-1);
	}
	
	public static short getMinShort() {
		return (short)(getMaxShort() + 1);
	}

	public static short getLengthShort() {
		return (short) getLength(Short.SIZE);
	}
	
	public static int getMaxInt() {
		int res = 1;
		while(res > 0) {
			res *= 2;
		}
		return res-1;
	}

	public static int getMinInt() {
		return (getMaxInt() + 1);
	}

	public static int getLengthInt() {
		return getLength(Integer.SIZE);
	}

	public static long getMaxLong() {
		long res = 1;
		while(res>0) {
			res*=2;
		}
		return res-1;
	}

	public static long getMinLong() {
		return (long)(getMaxLong() + 1);
	}

	public static long getLengthLong() {
		return getLength(Long.SIZE);
	}

	private static int getLength(long x) {
		int res = 8;
		while(x != res) {
			res = res * 2;
		}
		return res / 8;
	}
}
