package smallestIntInArray;

import java.util.Arrays;

public class smallestIntInArray {

	public static void main(String[] args) {
		int[] A = {1,2,6,4,3};
		//Find the smallest positive integer that does not occur in a given sequence
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        Arrays.sort(A);
        int smallestDigit = 1;
        

         for(int i =0; i < A.length; i++){
             if(smallestDigit == A[i]){
                 smallestDigit++;
             }
         }

        return smallestDigit;
    }

}
