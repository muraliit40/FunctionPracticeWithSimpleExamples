package practiceExamples;

public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean Barking, int hourOfDay) {
		if((hourOfDay<8&&Barking==true) ||(hourOfDay>22&&Barking==true))
		return true;
		return false;
	}
}
