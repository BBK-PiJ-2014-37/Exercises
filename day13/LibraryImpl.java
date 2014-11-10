class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private int nextID;


	public LibraryImpl(String libraryName) {
		this.name = libraryName;
		this.maxBooksPerUser = 0;
		this.nextID = 1;
	}
	
	public String getName() {
		return this.name;
	}

	public int getID(String userName) {
		return 13;
	}
	
	public void setMaxBooksPerUser(int limit) {
		this.maxBooksPerUser = limit;
	}

	public int getMaxBooksPerUser(){
		return this.maxBooksPerUser;
	}
}