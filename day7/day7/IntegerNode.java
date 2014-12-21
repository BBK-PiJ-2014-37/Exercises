package day7;
public class IntegerNode {
    private int n; 
    private IntegerNode next;
    private IntegerNode prev;
    

    public IntegerNode(int n) {
      this.n = n;
      this.next = null;
      this.prev = null;
      
    }

    public int getNumber() {
      return n;
    }

    public IntegerNode getNext() {
      return next;
    }

    public IntegerNode getPrev() {
      return prev;
    }

    public void setNext(IntegerNode n) {
      this.next = n;
    }

    public void setPrev(IntegerNode n) {
      this.prev = n;
    }

}
