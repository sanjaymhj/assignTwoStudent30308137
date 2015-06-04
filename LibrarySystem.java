package assignTwoStudent30308137;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;


public class LibrarySystem {
	private Library test_Library;
	public LibrarySystem(){}
	
	public void populate(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of Library: ");
		String name="";
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the capacity: ");
		int capacity=0;
		try {
			capacity = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test_Library=new Library(name,capacity);
	
		//code from TestClass
		Book book1=new Book();
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
		
		Book book2=new Book("Micro Computing","12346",2019,true,80,"John Hemming",269,true,false,"Flash Publication");
		
		Video video1=new Video("Life is Beautiful","v9989",2010,true,3,2048,false,false,false);
		//System.out.println(video1.toString());
		
		test_Library.addItem((LibraryItem) book1);
		test_Library.addItem((LibraryItem) book2);
		
		test_Library.addItem((LibraryItem) video1);
		Video video2=new Video("New Life","v0377",2005,false,5,1024,false,false,false);
		test_Library.addItem((LibraryItem) video2);
		
	}
	public void display(){
		System.out.println(test_Library.toString());
	}
	public void sort(){
		test_Library.sortItem();
		display();
	}
	public void importing(){
		test_Library.readFromFile();
	}
	public void exporting(){
		test_Library.exportToFile();
	}
	
	
	public static void main(String[] args) {
		LibrarySystem library_System=new LibrarySystem();
		System.out.println("1. Populating the Library");
		library_System.populate();
		
		System.out.println("2. Displaying LibraryItems");
		library_System.display();
		
		System.out.println("3. Sorting LibraryItems");
		library_System.sort();
		
		System.out.println("4. Importing data");
		library_System.importing();
                
		System.out.println("5. Exporting data");
		library_System.exporting();
                
		System.out.println("6. Exiting");

	}
}
