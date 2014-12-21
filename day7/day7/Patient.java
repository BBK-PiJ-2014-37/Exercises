package day7;

public class Patient {
    String name;
    int age;
    String illness;
    Patient nextPatient;
	

    public Patient (String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
    }

    public Patient getNext() {
		return nextPatient;
    }

    public void setNext(Patient patient) {
		this.nextPatient = patient;
    }

    public String toString() {
		return this.name + ", " + this.age + ", "+ this.illness;
    }

}
