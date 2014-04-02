package MainPackage;

public class bookList {
	
	BookComponent bookList;
	
	public bookList (BookComponent newBookList )
	{
		bookList = newBookList;
	}
	
	public void getBookList ()
	{
		bookList.showBookInformation();
	}
	

}
