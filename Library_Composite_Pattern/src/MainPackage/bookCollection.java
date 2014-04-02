package MainPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class bookCollection extends BookComponent {
	
	ArrayList bookComponents = new ArrayList();
	
	String bookCollectionName;
	String collectionDescription;
	
	public bookCollection (String newCollectionName, String newCollectionDescription){
		
		this.bookCollectionName = newCollectionName;
		this.collectionDescription = newCollectionDescription;
	}
	
	public String getCollectionName (){return bookCollectionName;}
	public String getCollectionDescription(){return collectionDescription; }
	
	public void remove (BookComponent newBookComponent){
		bookComponents.remove (newBookComponent);
	}
	
	public void add (BookComponent newBookComponent){
		bookComponents.add(newBookComponent);
	}
	
	public BookComponent getComponent (int componentIndex){
		
		return (BookComponent) bookComponents.get(componentIndex);
	}
	
	
	public void showBookInformation (){
		
		System.out.println(getCollectionName() + " " + getCollectionDescription() );
		System.out.println("");
		
		Iterator bookIterator = bookComponents.iterator();
		
		while (bookIterator.hasNext()){
			BookComponent bookInformation = (BookComponent) bookIterator.next();
			bookInformation.showBookInformation();
		}
			
	}
	

}
