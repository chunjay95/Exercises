package ZigZagConversion;

public class zigzagConversion {

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}

	public static String convert(String s, int numRows) {
		StringBuilder result;
		
		StringBuilder[] sbs = new StringBuilder[numRows];
		for(int i = 0; i < numRows; i++) {
			sbs[i] = new StringBuilder();
		}
		
		char[] characterArray = s.toCharArray();
		int stringLength = characterArray.length;
		int index = 0;
		
		while(index < stringLength) {
			//traversing down
			for(int i = 0; i < numRows && index < stringLength; i++) {
				sbs[i].append(characterArray[index++]);
			}
			
			//traversing back up
			for(int i = numRows - 2; i > 0 && index < stringLength; i--) {
				sbs[i].append(characterArray[index++]);
			}
		}
		
		result = sbs[0];
		for(int i = 1; i < numRows; i++) {
			result.append(sbs[i].toString());
		}
		
		return result.toString();
	}

}
