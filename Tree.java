public class Tree {
    private int branches;

    public static void main(String[] args) {
        
    }

    public Tree() {
        branches = 0;
    }

    public Tree(int branches) {
        this.branches = branches;
    }
    
    public Tree(Tree tree) {
        this.branches = tree.getBranches();
    }

    public void setBranches(int branches) {
		this.branches = branches;
	}

    public int getBranches() {
        return this.branches;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Tree branches = " + branches;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tree other = (Tree) obj;
        return branches == other.branches;
    }
}

