package assignTwoStudent30308137;

public class TestClass {

	public static void main(String[] args) {
		//testing for Part B
		
		//instantiating first book
		Book book1=new Book();
		//setting the instance variable for book1
		boolean bool_author1=book1.setAuthor("Goncalves");
		boolean bool_numPages1=book1.setNumPages(573);
		boolean bool_hardback1=book1.setHardback(false);
		boolean bool_fiction1=book1.setFiction(false);
		boolean bool_publisher1=book1.setPublisher("Apress");
		boolean bool_title1=book1.setTitle("Java EE 7");
		boolean bool_idcode1=book1.setID_code("12345");
		boolean bool_yoP1=book1.setYearOfPublication(2013);
		boolean bool_onloan1=book1.setOnLoan(true);
		boolean bool_replacementCost1=book1.setReplacementCost(100);
		
		//increasing the yearofPublication by 10
		int yop1 = book1.getYearOfPublication();
		bool_yoP1 = book1.setYearOfPublication(yop1+10);
				
		
		//instantiating 2nd book using constructor with parameters
		Book book2=new Book("Micro Computing","12346",2019,true,80,"John Hemming",269,true,false,"Flash Publication");
		
		//getting info of book1 and book2 toString() method
		String info_book1=book1.toString();
		String info_book2=book2.toString();
		System.out.println(info_book1);
		System.out.println(info_book2);
		
		//getting information of book using individual accessor (get) method
		info_book1=book1.getTitle()+","+book1.getID_code()+","+book1.getYearOfPublication()+","+book1.getOnLoan()+","+book1.getReplacementCost()+","+book1.getAuthor()+","+book1.getNumPages()+","+book1.getYearOfPublication()+","+book1.getFiction()+","+book1.getPublisher();
		System.out.println(info_book1);
		
		info_book2=book2.getTitle()+","+book2.getID_code()+","+book2.getYearOfPublication()+","+book2.getOnLoan()+","+book2.getReplacementCost()+","+book2.getAuthor()+","+book2.getNumPages()+","+book2.getYearOfPublication()+","+book2.getFiction()+","+book2.getPublisher();
		System.out.println(info_book2);
		
		//Testing Video.java
		Video video1=new Video("Life is Beautiful","v9989",2010,true,3,2048,false,false,false);
		System.out.println(video1.toString());
		
		//changing one attribute
		boolean bool_readable=video1.setErasable(true);
		System.out.println(video1.toString());
		
		//Part D
		//instance of library class
		Library library=new Library("Library1",2000);
		
		//adding 2 books
		library.addItem((LibraryItem) book1);
		library.addItem((LibraryItem) book2);
		
		//adding 2 other items
		library .addItem((LibraryItem) video1);
		Video video2=new Video("New Life","v0377",2005,false,5,1024,false,false,false);
		library.addItem((LibraryItem) video2);
		
		String res=library.toString();
		System.out.println(res);
		///refer to the shapes.tostring 
		

	}

}
