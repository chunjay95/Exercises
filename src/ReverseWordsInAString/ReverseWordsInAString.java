package ReverseWordsInAString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("Dog is Great"));
	}

	public static String reverseWords(String s) {
		String result = "";
		String arr[] = s.split(" ", s.length());

		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			result += sb.reverse().toString();
			
			if( i < arr.length - 1) {
				result += " ";
			}
		}

		return result;
	}

}
