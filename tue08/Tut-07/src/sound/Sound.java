package sound;

public class Sound {
	
	private String raum;
	private int lautstaerke;
	private int bass;
	private int hoehe;
	
	public Sound(String raum) {
		this(raum, 50);
	}
	
	public Sound(String raum, int laut) {
		this(raum, laut, 5);
	}
	
	public Sound(String raum, int laut, int bassAndHeight) {
		this(raum, laut, bassAndHeight, bassAndHeight);
	}

	public Sound(String raum, int laut, int bass, int hoch) {
		this.raum = raum;
		this.lautstaerke = laut;
		this.bass = bass;
		this.hoehe = hoch;
	}

	public void verstaerke(String string, int i) {
		switch (string.toLowerCase()) {
		case "baesse":
			this.bass += i;
			break;
		case "hoehen":
			this.hoehe += i;
			break;
		case "lautstaerke":
			this.lautstaerke += i;
			break;
		default:
			break;
		}
		
	}

	public int getLautstaerke() {
		return this.lautstaerke;
	}

	@Override
	public String toString() {
		return "Anlage im Raum " + raum + ": la: " + lautstaerke + " ba: " + bass + " ho: " + hoehe;
	}
	
	
}
