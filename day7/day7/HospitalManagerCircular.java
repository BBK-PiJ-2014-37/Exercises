class Patient {
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

class PatientList {
    Patient head;

    public void addPatient(Patient newPatient) {
		if (head == null){
			newPatient.setNext(newPatient);
		} else {
			newPatient.setNext(head);
			setLast(newPatient);
		}
		head = newPatient;
	}

	public void setLast(Patient aPatient) {
		if(head == null) {
			return;
		}
		Patient p;
		for(p = head.getNext(); p.getNext() != head; p = p.getNext()) {
		}
		p.setNext(aPatient);
	}


    public boolean delPatient(Patient patient) {
    	if (head == null) {
    		return false;
    	}
		if (head == patient) {
	    	if (head.getNext() == head){
	    		head = null;
	    	} else {
	    		setLast(patient.getNext());
	    		head = patient.getNext();
	    	}
	    	patient.setNext(null);
	    	return true;
	    }
		Patient prev = head;
		Patient p = head.getNext();
		while (p != head) {
	    	if (p == patient) {
				prev.setNext(p.getNext());
				p.setNext(null);
				return true;
	  	 	}
	    	prev = p;
	    	p = p.getNext();
		}
		return false;
    }

    public int countPatients() {
		int i = 0;
		Patient p = head;
		if(head == null) {
			return 0;
		}
		do {
			i++;
	    	p = p.getNext();
		} while (p != head);
		return i;
    }

    public void prettyPrint() {
		Patient p = head;
		System.out.print("Patients:\n");
		if(head == null) {
			return;
		}
		do  {
	    	System.out.print("  " + p + "\n");
	    	p = p.getNext();
		} while (p != head);
    }

}

public class HospitalManagerCircular {
    static PatientList patients = new PatientList();
	
    public static void main (String[] args){
		Patient first = new Patient("Maryann", 76, "Meningitis");
		patients.addPatient(first);
		patients.prettyPrint();
		patients.addPatient(new Patient("Mary", 66, "Meningitis"));
		patients.prettyPrint();
		patients.addPatient(new Patient("Lily", 65, "Tuberculosis"));
		patients.prettyPrint();
		Patient mid = new Patient("Louis", 26, "Meningitis");
		patients.addPatient(mid);
		patients.prettyPrint();
		patients.addPatient(new Patient("Carlos", 15, "Meningitis"));
		patients.prettyPrint();
		patients.addPatient(new Patient("Peter", 36, "Tuberculosis"));
		patients.prettyPrint();
		patients.addPatient(new Patient("Ann", 36, "Meningitis"));
		patients.prettyPrint();
		Patient last = new Patient("Kelly", 33, "Tuberculosis");
		patients.addPatient(last);
		patients.prettyPrint();
		patients.delPatient(mid);
		patients.prettyPrint();
		patients.delPatient(first);
		patients.prettyPrint();
		patients.delPatient(last);
		patients.prettyPrint();
    }

}

