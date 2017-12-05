/**
 * This class represents an animal with a name
 */
public class Animal {

	// protected -> Accessible in child classes and in the same package
	protected String name;
	
	protected Animal(String name) {
		this.name = name;
	}

	// Overrides toString in Object class
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public void fuettern() {
		System.out.println(this.name + " wird gefüttert!");
	}
}
