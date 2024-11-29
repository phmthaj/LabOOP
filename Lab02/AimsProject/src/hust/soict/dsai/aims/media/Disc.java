package hust.soict.dsai.aims.media;


public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(String title, String category, float cost) {
        super(title);  // Gọi constructor của Media, truyền title vào
        this.setCategory(category);  // Gán giá trị cho category
        this.setCost(cost);  // Gán giá trị cho cost
    }

	public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

