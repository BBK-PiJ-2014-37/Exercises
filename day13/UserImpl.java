public class UserImpl implements User {

	private String name;
	private int userID;
	
	public UserImpl(String name) {
		this.name = name;
		this.userID = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.userID;
	}
	
	public void setID(int idNumber) {
		this.userID = idNumber;
	}
}