import java.util.ArrayList;

public class Person {

	private String name;
	private ArrayList<Pet> petNames;

	public Person(String name) {
		this.name = name;
		petNames = new ArrayList<Pet>();
	}


	// Complete the method below. You need to:
	// 1. Insert the correct parameter.
	// 2. Correctly add this object to petNames.
	public void addPet(Pet p) {
		petNames.add(p);
	}


	// Complete the method below. You need to:
	// loop over petNames and print each Pet's name + ' has been fed.' Only Animals should be fed.
	public void feedPets() {
		for(int i = 0; i < petNames.size(); i++){
			if(petNames.get(i) instanceof Dog || petNames.get(i) instanceof Fish || petNames.get(i) instanceof Cat) {
				System.out.print(petNames.get(i).getName() + " has been fed. ");
			}
		}
		System.out.println();
	}


	// Complete the method below. You need to:
	// loop over petNames and print 'Hello ' + each Pet's name.
	// Each Pet that can speak should then speak to Ada.
	public void greetPets() {
		for(int i = 0; i < petNames.size(); i++){
			if(petNames.get(i) instanceof Dog) {
				System.out.println("Hello " + petNames.get(i).getName() + ". ");
				((Dog)petNames.get(i)).speak();
			}
			if(petNames.get(i) instanceof Cat) {
				System.out.println("Hello " + petNames.get(i).getName() + ". ");
				((Cat)petNames.get(i)).speak();
			}
			if(petNames.get(i) instanceof Fish) {
				System.out.println("Hello " + petNames.get(i).getName() + ". ");
				((Fish)petNames.get(i)).speak();
			}
		}
	}

}