public class Animal extends Pet {

	private boolean awake, hungry;
	
	public Animal(String name) {
		super(name);
		awake = true;
		hungry = false;
	}

	public void move() {
		System.out.println(this.getName() + " is moving.");
	}

	public void speak() {
		System.out.print("Speaking...");
	}

}