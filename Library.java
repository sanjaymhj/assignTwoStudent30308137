package assignTwoStudent30308137;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library{
	private String name;
	private LibraryItem[] items;
	private int numItems;
	private int capacity;
	
	public Library(String initName,int capacity){
		this.name=initName;
		this.capacity=capacity;
		this.numItems=0;
		this.items=new LibraryItem[this.capacity];
	}
	public Library(){
		this.name="";
		this.capacity=50;
		this.numItems=0;
		this.items=new LibraryItem[this.capacity];
	}
	public String getName()
	{
		return this.name;
	}
        public int getCapacity()
        {
            return this.capacity;
        }
	public int getNumItems()
	{
		return this.numItems;
	}
	public boolean setName(String newName)
	{
		this.name=newName;
		return true;
	}
	public boolean addItem(LibraryItem newItem)
	{
		if(numItems>=capacity)
		{
			return false;
		}
		//adding the new item in the library
		items[numItems++]=newItem;
		//update number of items in the library
		System.out.println(numItems);
		//numItems++;
		return true;
	}
	public void sortItem()
	{
		//bubble sort the year of publication
		LibraryItem tempLib;			
		for(int i=1;i< (numItems+1);i++)//start from 1 because the items in library is saved in index starting form 1 (***not 0)
		{
			System.out.println(i);
			for(int j=1;j < (numItems+1-i);j++)
			{
				System.out.print(j);
				if((items[j-1].getYearOfPublication())>(items[j].getYearOfPublication())){
					tempLib=items[j-1];
					items[j-1]=items[i];
					items[i]=tempLib;
				}
			}
		}
	}
        
        public void exportToFile()
        {
            System.out.println("about to open export file");
            try {
    		BufferedWriter output;
    		File file = new File("export_Library.txt");
    		System.out.println(file.getAbsolutePath());
    		output = new BufferedWriter(new FileWriter(file));
    		int i=0;
                output.write(this.name);
                //output.newLine();
                output.write(this.numItems);
                //output.newLine();
                output.write(this.capacity);
                //output.newLine();
                do
                {
                    output.write(items[i].getTitle());
                    //output.newLine();
                    output.write(items[i].getID_code());
                   // output.newLine();
                    output.write(items[i].getYearOfPublication());
                    //output.newLine();
                    if(items[i].getOnLoan()){
                        output.write("1");                        
                        //output.newLine();
                    }
                    else{
                        output.write("0");
                        //output.newLine();
                     }
                    output.write(items[i].getReplacementCost()+"");
                    i+=1;
                }while(i<this.numItems);
                output.newLine();

    		System.out.println("just wrote to file");
    		output.close();
            } 
    	catch (IOException e) {
    		System.out.println("IO Error with file export");
    		e.printStackTrace();
            }
        }
        
        public Library readFromFile(){
            int numAdded=0;
            File inputfile;
            Library temp_lib;
            inputfile = new File("export_Library.txt");
		try {
                    Scanner inputScanner = new Scanner(inputfile);
                    System.out.println("processing a library...");
                    String name=inputScanner.nextLine();
                    int capacity=Integer.parseInt(inputScanner.next());
                    temp_lib=new Library(name,capacity);
                   
                    LibraryItem item=new LibraryItem();
                    while(inputScanner.hasNextLine()){
                        item.setTitle(inputScanner.nextLine());
                        item.setID_code(inputScanner.nextLine());
                        item.setYearOfPublication(Integer.parseInt(inputScanner.nextLine()));
                        if(inputScanner.next()=="1")
                        {
                            item.setOnLoan(true);
                        }
                        else
                        {
                            item.setOnLoan(false);
                        }
                        item.setReplacementCost(inputScanner.nextDouble());
                    }   
                    inputScanner.close();
                }
		catch (IOException e) {
				System.out.println("IO Exception reading shapes from file"+e);
				e.printStackTrace() ;
			}
                return temp_lib;
        }
        
	public String toString()
	{
		String string_items="";
		for(int i=0;i<this.numItems;i++)
		{
			//string_items+=i;
			string_items+= "\n\t" +items[i].toString();
		}
		return "Library: "+ this.name+", Number of Items: "+this.numItems+",Capacity: "+this.capacity+string_items;
	}
}
