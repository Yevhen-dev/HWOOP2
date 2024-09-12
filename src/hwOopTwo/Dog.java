package hwOopTwo;

public class Dog extends Animal{

	private  String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return " "+ super.toString() +" Dog: [ name = "+ name +" ]";
	}
	
	@Override 
	public String getVoice() {
		return "Woof woof";
	}
	
	@Override 
	public void eat(){
		System.out.println("Dog " + this.name + " start eat");
	}
	
	@Override 
	public void sleep(){
		System.out.println("Dog " + this.name + " sleeping");
	}
	
}
