package catalogo;

public class ReadableItem {
	
	private int ISBN;
	private String title;
	private int yearOfRelease;
	private int numberOfPage;
	
	public ReadableItem (int code, String tit, int year, int pages) {
		this.ISBN = code;
		this.title = tit;
		this.yearOfRelease = year;
		this.numberOfPage = pages;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
}
