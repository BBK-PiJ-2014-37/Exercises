package day10;
public class Ark {
	public static void main (String[] args) {

	}

}

abstract class Animal {
	public abstract void makeSound();
	public abstract void call();
	public abstract void reproduce();
	public abstract static String speciesName();

	public void layEggs() {
		System.out.println("Eggs laid");
	}

	public void giveBirth() {
		System.out.println("Here, have some birth");
	}
}

class FlyingAnimal extends Animal {
	public void call(){
		System.out.println(this.SpeciesName() + " flying, will come when tired.")
	}
}

class SwimmingAnimal extends Animal {

}

class WalkingAnimal extends Animal {

}

class Eagle extends FlyingAnimal {
	public String speciesName() {
		return "Eagle";
	}
	public void makeSound() {
		System.out.println("<whatever Eagles do>");
	}
	public void reproduce() {
		this.layEggs();
	}
}