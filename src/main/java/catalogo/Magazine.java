package catalogo;

public class Magazine extends ReadableItem {
	
	private Periodicity release;

	public Magazine(int code, String tit, int year, int pages, Periodicity r) {
		super(code, tit, year, pages);
		this.release = r;
	}

	public Periodicity getRelease() {
		return release;
	}

	public void setRelease(Periodicity release) {
		this.release = release;
	}

	public String toString() {
		String res= "\nMagazine:";
		res += "\n Title: " + this.getTitle();
		res += "\n Release: " + this.getRelease();
		res += "\n Year: " + this.getYearOfRelease();
		res += "\n";
		return res;
	}
}
