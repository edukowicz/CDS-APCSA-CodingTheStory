public class Fish extends Animal {

	public Fish(String name) {
		super(name);
	}

	public void speak() {
		super.speak();
		System.out.println("blurb blurb");
	}
}