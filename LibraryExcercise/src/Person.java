
public class Person {

	private String name;
	private int id;
	private int yearJoined;

	public Person(String name, int id, int yearJoined) {
		this.name = name;
		this.id = id;
		this.yearJoined = yearJoined;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

}
