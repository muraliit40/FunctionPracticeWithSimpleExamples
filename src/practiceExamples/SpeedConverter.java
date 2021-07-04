package practiceExamples;

public class SpeedConverter {

	public static Long twoMilePerHour(double kiloMeterPerHour) {
		if(kiloMeterPerHour<0)
		return (long) -1;
	    return Math.round(kiloMeterPerHour*0.62137119);
	}
		public static void printConversion( double Kilometers) {
			long Miles = twoMilePerHour(Kilometers);
			System.out.println( Kilometers+"km/h ="  +Miles +"mm/h");
		}
}
