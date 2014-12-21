public class IntegerSingleNode {
    private int n; 
    private IntegerSingleNode next;
  
    public IntegerSingleNode(int n) {
      this.n = n;
      this.next = null;
    }
   
    public int getNumber() {
      return n;
    }

    public IntegerSingleNode getNext() {
      return next;
    }

    public void setNext(IntegerSingleNode n) {
      this.next = n;
    }

}
