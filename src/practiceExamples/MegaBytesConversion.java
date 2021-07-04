package practiceExamples;

public class MegaBytesConversion {

	public static void printMegaBytesAndKiloBytes(int KiloBytes) {
		if(KiloBytes<0)
			System.out.println("Invalid value");
		else if (KiloBytes>0) {
		int MB= KiloBytes/1024;
		System.out.println(KiloBytes+"KB is:" +MB+"MB:"  +(KiloBytes%1024)+"KB");
	}
	}
}
