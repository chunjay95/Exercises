package StringToInteger;

public class StringToInteger {

	public static void main(String[] args) {
//		System.out.println(myAtoi("0032"));
		System.out.println(myAtoi("-91283472332"));
	}

	public static int myAtoi(String s) {
		int result = 0;
		if (s.length() == 0) {
			return 0;
		}

		int indexOfDigit = 0;

		for (int i = 0; i < s.length() && s.charAt(i) == ' '; i++) {
			indexOfDigit++;
		}

		boolean isNegativeFlag = false;

		if (indexOfDigit < s.length()) {
			if (s.charAt(indexOfDigit) == '-') {
				isNegativeFlag = true;
				indexOfDigit++;
			} else if (s.charAt(indexOfDigit) == '+') {
				indexOfDigit++;
			}
		}

		while (indexOfDigit < s.length() && Character.isDigit(s.charAt(indexOfDigit))) {
			int c = Character.getNumericValue(s.charAt(indexOfDigit));

			if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && c > 7)) {
				return isNegativeFlag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}

			result = (result * 10) + c;
			indexOfDigit++;
		}

		if (isNegativeFlag) {
			return -result;
		} else {
			return result;
		}
	}

}
