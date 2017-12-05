import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		int[] daten = {1};
		int[] addon = {2,3};
		daten = join(addon, daten);
		System.out.println(Arrays.toString(daten)); // bringt Array in ein lesbares Format, da Arrays
		// ein Referenztyp sind.
		
	}
	
	/**
	 * Verbindet die beiden übergebenen Arrays, 
	 * dabei folgt im Ergebnis zuerst die Daten aus alt und dann die Daten von neu.
	 * @param neu - Array
	 * @param alt - Array
	 * @return Ein Array was die Daten von alt und neu enthält
	 */
	public static int[] join(int[] neu, int[] alt) {
		// Arrays sind ein Referenzdatentyp.
		// Bei Referenzen immer auf null prüfen!
		if (neu == null || alt == null) {
			return null;
		}
		int[] erg = new int[neu.length + alt.length];
		for(int i = 0; i < alt.length; i++) {
			erg[i] = alt[i];
		}
		
		// alle elemente des neuen Arrays kopieren
		for(int i = 0; i < neu.length; i++) {
			// um länge des alten arrays verschoben, da sonst die Elemente von alt überschrieben werden
			erg[i + alt.length] = neu[i];
		}
		/*
		// die zweite hälfte befüllen
		for(int j = alt.length; j < erg.length; j++) {
					// neu beginnt bei 0;
			erg[j] = neu[j - alt.length];
		}
		*/
		return erg;
	}
}
