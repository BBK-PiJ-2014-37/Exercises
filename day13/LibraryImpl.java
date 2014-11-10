class LibraryImpl implements Library {

	public LibraryImpl(String libraryName) {

	}
	
	public String getName() {
		return "Library Name";
	}

	public int getID(String userName) {
		return 13;
	}
	
	public void setMaxBooksPerUser(int limit) {
	}

	public int getMaxBooksPerUser(){
		return 2;
	}
}