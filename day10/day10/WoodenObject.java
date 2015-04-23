package day10;
// there is no way to inheritate two classes in java.
// The point of the exercise is to show that is not possible
//One solution is to create an interface and a class: for instance class Musical instrument
// guitar inheritates from MusicalIntrument
// and an interface (and guitar implements the interface)
public interface WoodenObject {

	public void burn() {
		System.out.println("It is burning")
	}
