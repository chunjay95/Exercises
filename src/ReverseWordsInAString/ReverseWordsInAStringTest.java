package ReverseWordsInAString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {

	@Test
	void successTest() {
		assertEquals("god", ReverseWordsInAString.reverseWords("dog"));
	}
	
	@Test
	void failTest() {
		assertNotEquals("god", ReverseWordsInAString.reverseWords("dog is fat"));
	}

	
	@Test
	void exceptionTest() {
		Exception exception = assertThrows(NullPointerException.class, () -> {
			ReverseWordsInAString.reverseWords(null);
		});
	}
}
