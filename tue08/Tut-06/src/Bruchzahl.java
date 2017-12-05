/**
 * This class represents a Fraction (German: Bruch(zahl))
 */
public class Bruchzahl extends Object {

	private int zaehler = 0;
	private int nenner = 1;
	
	public Bruchzahl(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	

	public double wert() {
		return getZaehler() / getNenner();
	}

	/**
	 * Negates the Fraction by multiplying the upper part of the fraction
	 * @return Returns itself for easier chaining
	 */
	public Bruchzahl neg() {
		this.zaehler *= -1;
		return this;
	}

	/**
	 * Swaps the upper and the lower part of a fraction
	 * @return Returns itself for easier chaining
	 */
	public Bruchzahl kehrwert() {
		int temp = this.zaehler;
		this.zaehler = this.nenner;
		this.nenner = temp;

		return this;
	}

	/**
	 * Removes unnecessary clutter from a fraction by dividing both parts through their common denominator.
	 * Also removes double negativity if it exists.
	 * @return Returns itself for easier chaining
	 */
	public Bruchzahl kuerzen() {
		this.zaehler /= Rechnen.ggT(this.zaehler, this.nenner);
		this.nenner /= Rechnen.ggT(this.zaehler, this.nenner);
		if (this.zaehler < 0 && this.nenner < 0) {
			this.zaehler *= -1;
			this.nenner *= -1;
		}
		return this;
	}
	
	// @see Object.toString()
	// Methode ist in Object definiert
	// und kann deswegen für jedes Objekt aufgerufen werden.
	public String toString() {
		return this.zaehler + "/" + this.nenner;
	}

	// Getter

	/**
	 * Gibt den Zaehler als Double zurück
	 * @return zaehler
	 */
	public double getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	// Setter

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	/**
	 * sets the nenner of a fraction
	 * @param nenner - the new value, cannot be 0
	 */
	public void setNenner(int nenner) {
		if (nenner != 0) {
			this.nenner = nenner;
		} else {
			System.out.println("Nenner darf nicht 0 sein!");
		}
			
	}
	
	
}
