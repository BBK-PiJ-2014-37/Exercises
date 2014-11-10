public interface User{
	String getName();
	int getID();
	void setID(int idNumber);
	void register(Library library);
	Library getLibrary();
}