package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		/*
		 * Animal is Hierarchical Inheritance because more than one derived class
		 * created from this. Example: Mammal extends Animal, Reptile extends Animal,
		 * Birds extends Animal.
		 */

		System.out.println("\n--------------Mammal-------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		// Yes, an object Can call other methods if the class is extended.

		System.out.println("\n--------------Reptile-------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		// Yes, an object Can call other methods if the class is extended

		System.out.println("\n-------------Birds--------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		/*
		 * Yes, an object Can call other methods if the class is extended Here Birds is
		 * a Child class Animal is a Parent Class Here Birds extends from Animal. So,
		 * this is a Single Inheritance
		 */

		System.out.println("\n---------------Dog------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n--------------Snake-------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n--------------Robin-------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n------------ Bull Dog ---------------------\n");

		/*
		 * Below example is Multilevel inheritance because a derived class created from
		 * another derived class. Like Bulldog extends Dog, Dog extends Mammal, and
		 * Mammal extends Animal.
		 */
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n---------------Cobra------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
