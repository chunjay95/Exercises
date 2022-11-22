package BitCount;

public class BitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question
		// Given an integer N, return the smallest non-negative number whose individual
		// digits sum upto N.
		System.out.println(solution(3, 7));
	}

	public static int solution(int A, int B) {
		return Integer.bitCount(A * B);
	}


}
