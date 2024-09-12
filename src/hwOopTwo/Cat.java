package hwOopTwo;

public class Cat extends Animal{
	private  String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
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
		return " "+ super.toString() +" Cat: [ name = "+ name +" ]";
	}
	
	@Override 
	public String getVoice() {
		return "Meow meow";
	}
	
	@Override 
	public void eat(){
		System.out.println("Cat " + this.name + " start eat");
	}
	
	@Override 
	public void sleep(){
		System.out.println("Cat " + this.name + " sleeping");
	}
	
}
