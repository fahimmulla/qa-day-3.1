
public class MainMthd {

	public static void main(String[] args) {

		Books HarryPotterCollection = new Books("Harry Potter Collection", 190.2, "Fiction", 2006);
		Books NeuroscienceEngineering = new Books("NeuroscienceEngineering", 180.1, "Educational", 2016);
		Books OfMiceandMen = new Books(" OfMiceandMen", 190.3, "Fiction", 1993);
		Newspaper theGuardian = new Newspaper("The Guardian", 92.1, "PublicKnowledge", 2018);
		Newspaper dailyMirror = new Newspaper("dailyMirror", 92.2, "PublicKnowledge", 2018);
		Newspaper independent = new Newspaper("independent", 92.3, "PublicKnowledge", 2018);
		MediaSource learnJavaDVD = new MediaSource("learnJavaDVD", 15, "Educational", 2017);
		MediaSource Warfiles = new MediaSource("Warfiles", 15, "Educational", 1983);
		MediaSource AncientAliens = new MediaSource("AncientAliens", 15, "Educational", 2004);

		Library mylibrary = new Library();

		mylibrary.addToArrays(HarryPotterCollection);
		mylibrary.addToArrays(NeuroscienceEngineering);
		mylibrary.addToArrays(OfMiceandMen);
		mylibrary.addToArrays(theGuardian);
		mylibrary.addToArrays(dailyMirror);
		mylibrary.addToArrays(independent);
		mylibrary.addToArrays(learnJavaDVD);
		mylibrary.addToArrays(Warfiles);
		mylibrary.addToArrays(AncientAliens);
	}

	{
		Library myPerson = new Library();

		Person Fahim = new Person("Fahim", 145678, 2018);
		Person Tom = new Person("Tom", 1284658, 2000);
		Person Elvis = new Person("Elvis", 22395, 1980);
		Person Matt = new Person("Matt", 1222395, 1993);

		/*myperson.addToArray(Fahim);
		myperson.addToArray(Tom);
		myperson.addToArray(Elvis);
		myperson.addToArray(Matt);*/
	}

}
