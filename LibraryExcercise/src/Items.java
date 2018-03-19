
public abstract class Items {

	private String name;
	private double id;
	private String genre;
	private int year;
	
	
	
	public Items(String name, double id, String genre, int year) {
		this.name = name;
		this.id = id;
		this.genre = genre;
		this.year = year;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getId() {
		return id;
	}



	public void setId(double id) {
		this.id = id;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
