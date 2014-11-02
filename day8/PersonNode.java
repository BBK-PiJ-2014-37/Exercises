public class PersonNode{
    private Person person;
    private PersonNode next;

    public PersonNode(Person person){
        this.person = person;
        this.next = null;
    }

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode nextNode) {
        this.next = nextNode;
    }

    public Person getPerson() {
        return this.person;
    }

    public String toString() {
        return  person.toString();
    }
}