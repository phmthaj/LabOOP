package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.*;

public class Book extends Media {
	private int contentLength;
	private List<String> authors = new ArrayList<String>();
	
	public void addAuthor(String authorName) {
		this.authors.add(authorName);
		System.out.println(authorName + " has been added to the " + this.getTitle() + " list of authors.");
	}

	public void removeAuthor(String authorName){
		for (String name: this.authors) {
			if (name.toLowerCase().equals(authorName.toLowerCase())) {
				this.authors.remove(name);
				System.out.println(name + " has been removed from the " + this.getTitle() + " list of authors.");
				return;
			}
		}
	}
	
	public String getType() {
		return "Book";
	}
	
	public String getDetails() {
		StringBuilder authorsList = new StringBuilder();
		if (!this.authors.isEmpty()) {
			authorsList.append(this.authors.getFirst());
			for (int i = 1; i < this.authors.size(); i++) {
				authorsList.append(", ").append(this.authors.get(i));
			}
		}
		return ("Product ID: " + String.valueOf(this.getId())
		+ "\n" + "\t" + "Title: " + this.getTitle()
		+ "\n" + "\t" + "Category: " + this.getCategory()
		+ "\n" + "\t" + "Authors: " + authorsList
		+ "\n" + "\t" + "Content Length: " + String.valueOf(this.getContentLength()) + " pages"
		+ "\n" + "\t" + "Price: $" + String.valueOf(this.getCost()));
	}

	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Book(String title, String category, int contentLength, float cost) {
		super(title, category, cost);
		this.contentLength = contentLength;
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title) {
		super(id, title);
	}

	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public int getContentLength() {
		return contentLength;
	}

}