package catalogo;

public class Book extends ReadableItem{
	
	private String author;
	private String genre;

	public Book(int code, String tit, int year, int pages, String a, String g) {
		super(code, tit, year, pages);
		this.author = a;
		this.genre = g;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String toString() {
		String res= "\nBook:";
		res += "\n Title: " + this.getTitle();
		res += "\n Author: " + this.getAuthor();
		res += "\n Year: " + this.getYearOfRelease();
		res += "\n";
		return res;
	}
}
