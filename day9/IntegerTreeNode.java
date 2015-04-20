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
			return (n < this.value && left != null && left.contains(n)) ||
				(n > this.value && right != null && right.contains(n));
		}
	}

	public boolean containsVerbose(int n) {
		System.out.println("Checking " + this.value);
		if(n == this.value) {
			return true;
		} else {
			return (n < this.value && left != null && left.contains(n)) ||
				(n > this.value && right != null && right.contains(n));
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

	public String prettyPrint() {
		String result = "[" + this.value + " L";
		if (this.left == null) {
			result += "[]"
		} else {
			result += left.toString();
		}
		result += " R"
		if (this.right == null) {
			result += "[]"
		} else {
			result += right.toString();
		}
		return "]";
    }

    public String toString() {
    	String result = "";
    	if (this.left != null) {
    		result += this.left.toString() + ",";
    	}
    	result += this.value;
    	if (this.right != null) {
    		result += "," + this.right.toString();
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

    public IntegerTreeNode deleteMin() {
    	if (this.left == null) {
    		return this.right;
    	} else {
    		this.left = deleteMin();
    		return this;
    	}
    }

    public IntegerTreeNode deleteRoot() {
    	if (right == null && left == null) {
    		return null;
    	}
    	if (this.left == null) {
    		return this.right;
    	}
    	if (this.right == null) {
    		return this.left;
    	}
    	this.value = this.right.getMin();
    	this.right = this.right.deleteMin();
    	return this;
    }

    public void remove(int value) {
    	/* Precondition: this.value != value */
    	if (value < this.value) {
    		if (this.left == null) {
    			return;
    		}
    		if (this.left.value == value) {
    			this.left = this.left.deleteRoot();
    			return;
    		}
    		this.left.remove(value);
    		return;
    	}
    	if (value > this.value) {
    		if (this.right == null) {
    			return;
    		}
    		if (this.right.value == value) {
    			this.right = this.right.deleteRoot();
    			return;
    		}
    		this.right.remove(value);
    		return;
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
