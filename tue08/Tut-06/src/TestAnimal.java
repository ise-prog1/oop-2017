/**
 * This class demonstrates Dog and Animal
 */
public class TestAnimal {

	public static void main(String[] args) {
		Dog dog = new Dog("Rasputin");
		Animal a = new Animal("Komisches Tier");
		Animal tier = new Dog("Horst");
		
		System.out.println(dog);
		System.out.println(a);
		dog.bellen();
		
		System.out.println(tier);
		fuetterAlle(dog, a, tier);
		bellenLassen(dog);
	}
	
	public static void bellenLassen(Dog... dogs) {
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].bellen();
		}
	}
	public static void fuetterAlle(Animal... animals) {
		for (int i = 0; i < animals.length; i++) {
			animals[i].fuettern();
		}
	}
}
