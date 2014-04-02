package MainPackage;

public class main {

	public static void main(String[] args) {


		BookComponent Fantasy = 
				new bookCollection ("Collection of books of Fantasy",
						"This is a collection of books that are of fantasy");
		
		BookComponent Horror = 
				new bookCollection ("Collection of books of Horror",
						"This is a collection of books that are Horror.");
		
		BookComponent HarryPotterBooks = 
				new bookCollection ("Harry Potter Collections",
						"This collection is based on the adventure of Harry Potter"); 

		BookComponent GameOfThrowns = 
				new bookCollection ("Game of Throwns",
						"An epic story, about nations fighting for one thrown");
		
		BookComponent Encyclopedias =
				new bookCollection ("Encyclopedias",
						"A collection of Encyclopedias");
		
		//This holds everything
		BookComponent allBooks = new bookCollection ("List of books", "All books available");
		
		allBooks.add(Fantasy);
		
		
		Fantasy.add(HarryPotterBooks);
		Fantasy.add(Horror);
		
		HarryPotterBooks.add (new book ("Chamber Of Secrets", "JK Rowling", 1998, 2, "Harry Potter Searches for a secret chamber within the castle"));
		HarryPotterBooks.add (new book ("Prisoner of Azkaban", "JK Rowling", 1999, 3, "Happy Potter faces a prisoner from azkaban"));
		
		Horror.add(GameOfThrowns);
		
		GameOfThrowns.add (new book ("A clash of kings", "George Raymond", 1996, 2, "The kings start their rein"));
		GameOfThrowns.add (new book ("A game of throwns", "George Raymond",1995 , 1, "The story begins"));
		
		bookList bookLists = new bookList (allBooks);
		
		bookLists.getBookList();
		
		
	}

}
