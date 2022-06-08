
public class Solution {

	static int solution(int X, int Y, int[] A) {
        int N = A.length;
        System.out.println("length: " + N);
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {

            if (A[i] == X) 
                nX += 1;
            System.out.println("nX: " + nX);
//            else if (A[i] == Y)
            if (A[i] == Y)
                nY += 1;
            System.out.println("nY: " + nY);

            if (nX == nY)
                result = i;
        }
        return result;
	
}

	public static void main(String[] args) {
		
		System.out.println(solution(1,2,new int[] {3}));
		
//		System.out.println(solution(1,1,new int[] {1}));
//		System.out.println(solution(1,1,new int[] {1,1,2}));
		
		System.out.println(solution(1,2,new int[] {1}));
//		
		System.out.println(solution(6,13,new int[] {13,13,1,6}));
		System.out.println(solution(6,13,new int[] {13,13,1,6,6,1}));
	}
	
}
