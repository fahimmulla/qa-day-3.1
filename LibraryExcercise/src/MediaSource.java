
public class MediaSource extends Items {

	public MediaSource(String name, double id, String genre, int year) {
		super(name, id, genre, year);
		// TODO Auto-generated constructor stub
	}
	private boolean hasaudioandvideofiles;

	public boolean hasaudioandvideofiles() {
		return hasaudioandvideofiles;
	}

	public void sethasaudioandvideofiles(boolean hasaudioandvideofiles) {
		this.hasaudioandvideofiles = hasaudioandvideofiles;
	}
}
