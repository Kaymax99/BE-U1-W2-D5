package catalogo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library();
		
		Book b1 = new Book(123, "The Fellowship of the Ring", 1954, 423, "J. R. R. Tolkien", "Fantasy");
		Book b2 = new Book(234, "Two Towers", 1954, 423, "J. R. R. Tolkien", "Fantasy");
		Magazine m1 = new Magazine(456, "True Tolkien Fans", 1954, 40, Periodicity.MENSILE);
		
		library.addToLibrary(b1);
		library.addToLibrary(b2);
		library.addToLibrary(m1);
//		library.removeFromLibrary(234); // esempio rimozione
//		library.removeFromLibrary(236); // esempio rimozione fallita per codice non trovato
//		library.findByYear(1954); // esempio ricerca per anno con successo
//		library.findByYear(2000); // esempio ricerca per anno fallita
//		library.findByAuthor("J. R. R. Tolkien"); // esempio ricerca per autore con successo
//		library.findByAuthor("Doge"); // esempio ricerca per autore fallita
		// Non sono soddisfatto di questa ricerca, bisogna scrivere il nome esatto ovviamente, se mi rimane
		// tempo la aggiusto
	}
	
	private Map<Integer, ReadableItem> itemList;
	
	public Library() {
		itemList = new HashMap<Integer, ReadableItem>();
	}
	
	public void addToLibrary(ReadableItem item) {
		itemList.put(item.getISBN(), item);
		System.out.println("Added element: " + item.toString());
	}
	
	public void removeFromLibrary (int code) {
		ReadableItem removedItem = itemList.remove(code);

		if (removedItem != null) {
			System.out.println("Removed Element: " + removedItem.toString());
		} else {
			System.out.println("Could not delete item as no item in Library matches given ISBN");
		}
	}
	
	public ReadableItem findByCode (int code) {
		ReadableItem foundItem = itemList.get(code);
		if (foundItem != null) {
			System.out.println("Found element with given code: " + foundItem);
		} else {
			System.out.println("No item found with given ISBN in Library.");
		}
// Note to self: metto il return nel caso dovesse servire usare l'oggetto trovato, in caso lo tolgo.
		return itemList.get(code);
	}

	public List<ReadableItem> findByYear(int year) {
		List<ReadableItem> list = itemList.values().stream().filter(element -> year == element.getYearOfRelease()).collect(Collectors.toList());
		 if (list.size() > 0) {
			System.out.println("Items released in given year:");
		 	list.forEach(elem -> System.out.println(elem.toString()));
		 } else {
			 System.out.println("No item found in Library with release year given.");
		 }
		// Stessa cosa qui che ho fatto su findByCode
		return list;
	}
	
	public List<Book> findByAuthor(String author) {
		List<Book> list = itemList.values().stream().filter(element -> element instanceof Book)
				.map(elem -> (Book) elem).filter(element -> author == element.getAuthor()).collect(Collectors.toList());
		
		if (list.size() > 0) {
			System.out.println("Items released by given Author:");
		 	list.forEach(elem -> System.out.println(elem.toString()));
		} else {
			System.out.println("No item found in Library by given Author");
		}
		return list;

	}
}
