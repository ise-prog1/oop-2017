package fernseher;

public class FarbFernseher extends Fernseher {

	private int color;
	
	public FarbFernseher(String ra, int vo, int pr, int color) {
		super(ra, vo, pr);
		this.color = Math.max(0, Math.min(50, color));
	}

	@Override
	public void change(String string, int i) {
		if (string.equals("color")) {
			this.color += i; // increment
			this.color = Math.max(0, Math.min(50, this.color)); // clamp
		} else {
			super.change(string, i);
		}
	}
	
	public boolean istAngenehmerAls(FarbFernseher other) {
		if (this.getVolume() < other.getVolume()) {
			if (this.color < 40 && this.color > other.color) {
				return true;
			}	
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + " color: " + color;
	}
}
