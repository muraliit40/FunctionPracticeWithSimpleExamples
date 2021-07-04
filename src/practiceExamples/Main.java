package practiceExamples;

public class Main {
	public static void main(String args[]) {
		SpeedConverter.printConversion(1.5);
		SpeedConverter.printConversion(10.25);
		SpeedConverter.printConversion(-5.6);
		SpeedConverter.printConversion(25.42);
		SpeedConverter.printConversion(75.114);
		MegaBytesConversion.printMegaBytesAndKiloBytes(2500);
		MegaBytesConversion.printMegaBytesAndKiloBytes(-1024);
		MegaBytesConversion.printMegaBytesAndKiloBytes(5000);
		boolean x = BarkingDog.shouldWakeUp(true,1);
		System.out.println(x);
		x = BarkingDog.shouldWakeUp(false,2);
		System.out.println(x);
		x = BarkingDog.shouldWakeUp(true,8);
		System.out.println(x);
	}
	}


