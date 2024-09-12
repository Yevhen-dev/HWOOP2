package hwOopTwo;

public class Main {

	public static void main(String[] args) {
		
		
		Cat murka = new Cat("dry food", "black", 2, "Murka");
		Dog reks = new Dog("meat", "white", 5, "Reks");

		Veterinarian jhon = new Veterinarian("Jhon");
		
		jhon.treatment(murka);
		jhon.treatment(reks);
	}

}
