package LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		int x = 0;
		HashMap<Character, Integer> map = new HashMap();

		for (int y = 0; y < s.length(); y++) {
			if (!map.containsKey(s.charAt(y))) {
				map.put(s.charAt(y), 1);
			} else {
				map.put(s.charAt(y), map.get(s.charAt(y)) + 1);
			}

			if (map.get(s.charAt(y)) != 1) {
				while (map.get(s.charAt(y)) != 1) {
					map.put(s.charAt(x), map.get(s.charAt(x)) - 1);
					x++;
				}
			}
			result = Math.max(result, y - x + 1);
		}

		return result;
	}
}
