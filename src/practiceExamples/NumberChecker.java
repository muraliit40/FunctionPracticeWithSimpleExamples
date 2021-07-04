package practiceExamples;

public class NumberChecker {
	
	public static void main(String args[]) {
		System.out.println("The Given values:"+(hasTeen(13,1,2)));
	}

public static boolean hasTeen(int a, int b, int c) {
	if((a>=13&&a<=19)||(b>=13&&a<=19)||(c>=13&&c<=19))
	return true;
	return false;
}


}