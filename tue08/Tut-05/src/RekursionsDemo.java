
/**
 * Diese Klasse demonstriert Rekursion.
 * @author clemens
 *
 */
public class RekursionsDemo {
	
	public static void main(String[] args) {
		int erg = faculty(3);
		System.out.println(erg);
		boolean even = isEvenRec(100_000);
		System.out.println(even);
	}
	
	/**
	 * Diese Funktion berechnet n!
	 * @param n
	 * @return n!
	 */
	public static int faculty(final int n) {
		if(n == 1)
			return 1;
		return (n * faculty(n - 1));
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	/**
	 * Dumme Lösung! StackOverflow für hohe n!
	 * @param n
	 * @return
	 */
	public static boolean isEvenRec(int n) {
		if (n == 1) {
			return false;
		} else if (n == 2) {
			return true;
		}
		return isEvenRec(n - 2);
			
		
	}

}
