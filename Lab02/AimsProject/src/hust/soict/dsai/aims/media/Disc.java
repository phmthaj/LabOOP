package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Disc extends Media implements Playable {
	private String director;
	private int length;
	
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}

	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Disc(String title, String category) {
		super(title, category);
	}

	public Disc(String title) {
		super(title);
	}

	@Override
	public String getType() {
		return "";
	}

	@Override
	public String getDetails() {
		return "";
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void play() throws PlayerException {

	}
}