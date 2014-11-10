public interface Library {
	String getName();
	int getID(String userName);
	public void setMaxBooksPerUser(int limit);
	public int getMaxBooksPerUser();
}