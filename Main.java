// Coding the Story Starter    A+CR
class Main {
  public static void main(String[] args) {

    //instantiate one object of each of the Pets
    Person Ada = new Person("Ada");
    Pet Viola = new RubberDuck("Viola");
    Pet Firefox = new Dog("Firefox");
    Pet Chrome = new Cat("Chrome");
    Pet Opera = new Fish("Opera");
	



    //add all the Pets to Ada's petName list
    Ada.addPet(Viola);
    Ada.addPet(Firefox);
    Ada.addPet(Chrome);
    Ada.addPet(Opera);




    //call greetPets() for Ada
    Ada.greetPets();



    //call feedPets() for Ada
    Ada.feedPets();


  }
}