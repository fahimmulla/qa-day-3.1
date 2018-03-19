
public class Books extends Items {

	public Books(String name, double id, String genre, int year) {
		super(name, id, genre, year);
	}

	private boolean hasHardCovers;

	public boolean hasHardCovers() {
		return hasHardCovers;
	}

	public void sethasHardCovers(boolean hasHardCovers) {
		this.hasHardCovers = hasHardCovers;
	}
}
