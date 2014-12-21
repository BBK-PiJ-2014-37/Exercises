package day9;
public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int v) {
		this.value = v;
		this.left = null;
		this.right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if(right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) {
		if(n == this.value) {
			return true;
		} else {
			if(left == null){
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public int getMax() {
		if (this.right != null) {
			return right.getMax();
		} else {
			return this.value;
		}
	}

	public int getMin() {
		if (this.left != null) {
			return left.getMin();
		} else {
			return this.value;
		}
	}

	public String toString() {
		String result = "[";
		while (this.right != null && this.left != null) {
			if (this.left != null) {
				result = result + this.value + " L[" + this.left;
				if (this.right != null) {
					result = result + "]" + " R[" + this.right;
				} else {
					result = result + "]";
				}
			} else {
				result = result + "]";
			}
		}
		return result;

    }

	public String toSimpleString() {
		String result = "[";
		while (this.right != null && this.left != null) {
			if (this.left != null) {
				result = result + this.value + " [" + this.left;
				if (this.right != null) {
					result = result + "]" + " [" + this.right;
				} else {
					result = result + "]";
				}
			} else {
				result = result + "]";
			}
		}
		return result;
    }

    public int depth(){
    	int result
    	if(this.right == null && this.left == null) {
    		result = 0;
    	} else if (this.right != null){
    		result = 1 + right.depth();
    		if(this.left != null){
    			result = 1 + left.depth();
    		}
    	if (right.depth() > left.depth()) {



    	}
    	return result;
    }

	public int depth(){
    	int leftDepth = 0;
    	int rightDepth = 0;
    	if (this.right != null) {
        	rightDepth = right.depth();
    	}
    	if (this.left != null) {
        	leftDepth = left.depth();
    	}
    	if (leftDepth > rightDepth) {
    		return 1 + leftDepth
    	} else {
    		return 1 + rightDepth
    	}
    }








































    public int depth2() {
    	int result = 0;
    	if(this.right == null && this.left == null){
    		result = 0
    	} else if (this.right != null){
    		result = 1 + right.depth2()
 

    	}

    	return result;
    }


   

}
