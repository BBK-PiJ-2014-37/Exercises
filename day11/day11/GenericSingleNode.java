package day11;
public class GenericSingleNode<T> {
    private T value;
    private GenericSingleNode next;
    
    public GenericSingleNode (T value) {
      this.value = value;
      this.next = null;
    }

    public T getValue() {
      return value;
    }

    public GenericSingleNode<T> getNext() {
      return next;
    }

    public void setNext(GenericSingleNode<T> nextNode) {
      this.next = nextNode;
    }

}
