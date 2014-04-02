package MainPackage;

public class book extends BookComponent {
	
	String author;
	String title;
	int year;
	String description;
	int numberOfPages;
	
	public book (String bookName, String author, int year, int number, String bookDescription)
	{
		this.author = author;
		this.title = bookName;
		this.year = year;
		this.description = bookDescription;
		this.numberOfPages = number;				
	}
	
	public String getAuthor (){return author; }
	public String getTitle (){return title; }
	public int getYear (){return year; }
	public String getDescription () {return description; }
	public int getNumberOfPages () {return numberOfPages; }
	
	public void showBookInformation () {
		
		System.out.println(getTitle() + " is the title, " + getAuthor() + " is the author, " 
				+ "the year of the book is " + getYear());
	}
	

}
