package day11;
public class GenericNode<T> {
    private T value;
    private GenericNode next;
    private GenericNode prev;
    

    public GenericNode (T value) {
      this.value = value;
      this.next = null;
      this.prev = null;
      
    }

    public T getValue() {
      return value;
    }

    public GenericNode<T> getNext() {
      return next;
    }

    public GenericNode<T> getPrev() {
      return prev;
    }

    public void setNext(GenericNode<T> nextNode) {
      this.next = nextNode;
    }

    public void setPrev(GenericNode<T> prevNode) {
      this.prev = prevNode;
    }

}
