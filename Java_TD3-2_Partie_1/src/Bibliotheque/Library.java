package Bibliotheque;

import java.util.Arrays;

public class Library {
	
	public static final int MAX_BOOKS=10;
	private String name;
	private String address;
	private int max;
	private book[] tabBook = new book[MAX_BOOKS];
	
	public Library(String name, String address, int max) {
		super();
		this.name = name;
		this.address = address;
		this.max = max;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public book[] getBook() {
		return tabBook;
	}

	public void setBook(book[] book) {
		tabBook = book;
	}

	public static int getMaxBooks() {
		return MAX_BOOKS;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", max=" + max + ", Book=" + Arrays.toString(tabBook)
				+ "]";
	}
	public void addBook(book livre) {
		tabBook[max] = livre;
	}
	public void removeBook(book livre) {
		
	}
}
