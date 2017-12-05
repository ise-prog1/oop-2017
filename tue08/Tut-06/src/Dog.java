/**
 * This class represents a more specialized Dog
 *
 */
public class Dog extends Animal {
	
	private int beine = 4;

	public Dog(String name) {
		super(name);
	}
	
	
	public String toString() {
		return this.name;
	}
	
	
	public void bellen() {
		System.out.println(this.name + " bellt auf "+ beine +" Beinen!");
	}
	
	@Override
	public void fuettern() {
		super.fuettern();
		System.out.println(this.name + " wird mit Hundefutter gefüttert und hat "+ beine + " Beine!");
	}
	
}
