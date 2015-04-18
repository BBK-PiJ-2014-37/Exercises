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
    	int leftDepth = 0;
    	int rightDepth = 0;
    	if (this.right != null) {
        	rightDepth = right.depth();
    	}
    	if (this.left != null) {
        	leftDepth = left.depth();
    	}
    	if (leftDepth > rightDepth) {
    		return 1 + leftDepth;
    	} else {
    		return 1 + rightDepth;
    	}
    }

    public static void main(String[] args) {
    	IntegerTreeNode test1 = new IntegerTreeNode(6);
    	test1.add(8);
    	test1.add(3);
    	test1.add(11);
    	test1.add(9);
    	test1.add(12);
    	test1.add(5);
    	System.out.println(test1.toString());
    	System.out.println(test1.toSimpleString());
    	System.out.println("The depth of this tree is " + test1.depth());

    }

}
