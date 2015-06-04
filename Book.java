package assignTwoStudent30308137;

public class Book extends LibraryItem{
	private String author;
	private int numPages;
	private boolean hardback;
	private boolean fiction;
	private String publisher;
	public Book(String title, String idCode, int yearOfPublication,
			boolean onLoan, double replacementCost, String author,
			int numPages, boolean hardback, boolean fiction, String publisher) {
		super(title, idCode, yearOfPublication, onLoan, replacementCost);
		this.author = author;
		this.numPages = numPages;
		this.hardback = hardback;
		this.fiction = fiction;
		this.publisher = publisher;
	}
	

	public boolean setAuthor(String _author) {
		if(_author.equals(null) || _author.equals(""))
		{
			this.author="Unknown";
			return false;
		}
		this.author = _author;
		return true;
	}

	public Book(){
		super();
		setAuthor("");
		this.numPages=0;
		this.hardback=false;
		this.fiction=false;
		this.publisher="";
	}
	public String getAuthor() {
		return this.author;
	}
	public int getNumPages() {
		return numPages;
	}
	public boolean setNumPages(int _numPages) {
		if(_numPages<1)
		{
			_numPages=1;
			return false;
		}
		this.numPages = _numPages;
		return true;
	}
	public boolean isHardback() {
		return hardback;
	}
	public boolean setHardback(boolean _hardback) {
		this.hardback = _hardback;
		return true;
	}
	public boolean getFiction() {
		return fiction;
	}
	public boolean setFiction(boolean _fiction) {
		this.fiction = _fiction;
		return true;
	}
	public String getPublisher() {
		return publisher;
	}
	public boolean setPublisher(String _publisher) {
		this.publisher = _publisher;
		return true;
	}
	
	public boolean equalsIgnoreCase(Book anotherBook)
	{
		if(this.getTitle().equalsIgnoreCase(anotherBook.getTitle()) && this.getAuthor().equalsIgnoreCase(anotherBook.getAuthor()))
		{
			return false;
		}
			return true;
	}
	public String toString()
	{
		return super.toString()+", Author: "+this.author+", Number of pages: "+this.numPages+", Hardback: "+this.hardback+", Fiction: "+this.fiction+", Publisher: "+this.publisher;
	}
	

}
