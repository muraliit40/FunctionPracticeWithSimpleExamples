package practiceExamples;
//Comparing 3 decimal values
public class DecimalCompare {
	
	public static void main(String args[]) {
		boolean x =areEqualByThreeDecimalPoints(3.175, 3.176);
		System.out.println(x);
		x =areEqualByThreeDecimalPoints(3.155, 3.176);
		System.out.println(x);
		x =areEqualByThreeDecimalPoints(3.175, 3.176);
		System.out.println(x);
	}
	
	public static boolean areEqualByThreeDecimalPoints(double first, double second) {	
		int X = (int) (first*100);
		int Y = (int) (second*100);
		if(X==Y)
			return true;
		return false;
	}
	
	

	
}
