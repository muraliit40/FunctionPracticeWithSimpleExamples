package practiceExamples;

public class EqualSumChecker {

	public static void main(String args []) {
		boolean X = hashEqualsSum(1,1,1);
		System.out.println(X);
	    X = hashEqualsSum(1,1,2);
		System.out.println(X);
		 X = hashEqualsSum(1,-1,0);
			System.out.println(X);
	}
	public static boolean hashEqualsSum(int a, int b, int c) {
		int d = a+b;
		if(c==d)
			return true;
		return false;
	}
}
