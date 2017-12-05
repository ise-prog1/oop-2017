package overloading;

import Prog1Tools.IOTools;

public class MyMath {

	public static int hoch(int base, int exponent) {
		return (int) hoch((double)base, exponent);
	}
	
	public static double hoch(double base, int exponent) {
		double result = 1.0;
		if(exponent < 0) {
			return 1 / hoch(base, -1 * exponent);
		}
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		int base = IOTools.readInt("Basis (ganze Zahl) ");
		int exp = IOTools.readInt("Exponent (ganze Zahl) ");
		System.out.println(base + " hoch " + exp + " = " + hoch(base, exp));
		
		double baseAsDouble = IOTools.readDouble("Basis (beliebige Zahl) ");
		exp = IOTools.readInt("Exponent (ganze Zahl) ");
		System.out.println(baseAsDouble + " hoch " + exp + " = " + hoch(baseAsDouble, exp));
	}
}
