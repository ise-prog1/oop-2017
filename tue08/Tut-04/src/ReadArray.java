import Prog1Tools.IOTools;
/**
 * Simple methods
 */
public class ReadArray {
	
	public static double[] readArray(int anzahl) {
		if (anzahl <= 0) {
			return null;
		} else {
			double[] aArray = new double[anzahl];
			for(int i = 0; i < anzahl; i++) {
				aArray[i] = IOTools.readDouble();
			}
			for(double a : aArray) {
				
			}
			return aArray;
		}
	}
	
	public static void printArray(double[] array) {
		
		for(double element : array) {
			System.out.print(element + ",");
		}
		
	}
}
