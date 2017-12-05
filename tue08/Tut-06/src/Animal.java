
public class Animal {

	protected String name;
	
	protected Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public void fuettern() {
		System.out.println(this.name + " wird gefüttert!");
	}
}
