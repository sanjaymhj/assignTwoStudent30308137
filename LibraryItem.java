
package assignTwoStudent30308137;

public class LibraryItem {
	private String title;
	private String ID_code;
	private int yearOfPublication;
	private boolean onLoan;
	private double replacementCost;
	
	//constructor with initialisation values
	public LibraryItem(String title, String idCode, int yearOfPublication,
			boolean onLoan, double replacementCost) {
		this.title = title;
		this.ID_code = idCode;
		this.yearOfPublication = yearOfPublication;
		this.onLoan = onLoan;
		this.replacementCost = replacementCost;
	}
	//empty constructor
	public LibraryItem(){
		this.title="";
		this.ID_code="";
		this.yearOfPublication=0;
		this.onLoan=false;
		this.replacementCost=0;
	}
	
	
	public String getTitle() {
		return title;
	}
	public boolean setTitle(String _title) {
		if(_title.equals(""))
			return false;
		this.title = _title;
		return true;
	}
	public String getID_code() {
		return ID_code;
	}
	public boolean setID_code(String _ID_code) {
		ID_code = _ID_code;
		return true;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public boolean setYearOfPublication(int _yearOfPublication) {
		if(_yearOfPublication<2015 && _yearOfPublication>999)
		{
			this.yearOfPublication = _yearOfPublication;
			return true;
		}
		return false;
		
	}
	public boolean getOnLoan() {
		return onLoan;
	}
	public boolean setOnLoan(boolean _onLoan) {
		this.onLoan = _onLoan;
		return true;
	}
	public double getReplacementCost() {
		return replacementCost;
	}
	public boolean setReplacementCost(double _replacementCost) {
		if(_replacementCost>0)
			{
				this.replacementCost = _replacementCost;
				return true;
			}
		return false; 
	}
	public String toString()
	{
		return "Title: "+this.title+","+"ID code: "+this.ID_code+", Year of publication :"+this.yearOfPublication+", On Loan: "+this.onLoan+", ReplacementCost: "+this.replacementCost;
	}
}
