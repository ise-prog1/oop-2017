
public class Rechnen {
	
	// disallow instanciation by changing constructor visibility from the default public to private
	private Rechnen() {
		
	}
	
	public static void main(String[] args) {
		int erg = Rechnen.ggT(60, 30);
		System.out.println(erg);
		Bruchzahl zahl = new Bruchzahl(6,4);
		System.out.println(zahl.wert());
		System.out.println(zahl.neg());
		System.out.println("Hi, I am " + zahl.toString());
	
	}
	
	public static double wert(Bruchzahl zahl) {
		return (double) zahl.getZaehler() / zahl.getNenner();
	}
	// Instanz erstellen:
	// String hallo = ""
	// KlassenName instanzName = new KlassenName();
	
	// Klassenmethoden über KlassenName.Methode()
	// Instanzmethoden über instanzName.Methode()
	// 

	public static int ggT(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		int x = Math.abs(a);
		int y = Math.abs(b);
		while (x != y) {
			if (x > y) {
				x = x - y; // x -= y;
			} else {
				y = y - x; // y -= x;
			}
		}
		return x;
	}
	
}
