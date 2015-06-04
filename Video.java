package assignTwoStudent30308137;

public class Video extends LibraryItem{

	//3 unique attribute
	private int sizeofContent;
	private boolean erasable;
	private boolean writable;
	private boolean requirePower;
	
	public Video(String title, String idCode, int yearOfPublication,
			boolean onLoan, double replacementCost, int sizeofContent,
			boolean erasable, boolean writable, boolean requirePower) {
		super(title, idCode, yearOfPublication, onLoan, replacementCost);
		this.sizeofContent = sizeofContent;
		this.erasable = erasable;
		this.writable = writable;
		this.requirePower = requirePower;
	}

	public Video() {	
	}

	public int getSizeofContent() {
		return sizeofContent;
	}

	public boolean setSizeofContent(int _sizeofContent) {
		if(_sizeofContent<0)
			return false;
		this.sizeofContent = _sizeofContent;
		return true;
	}

	public boolean isErasable() {
		return erasable;
	}

	public boolean setErasable(boolean _erasable) {
		this.erasable = _erasable;
		return true;
		
	}

	public boolean isWritable() {
		return writable;
	}

	public boolean setWritable(boolean _writable) {
		this.writable = _writable;
		return true;
	}

	public boolean isRequirePower() {
		return requirePower;
	}

	public boolean setRequirePower(boolean _requirePower) {
		this.requirePower = _requirePower;
		return true;
	}
	public String toString()
	{
		return super.toString()+", Size of Content: "+this.sizeofContent+", Erasable: "+this.erasable+", Writable: "+this.writable+", Requires Power: "+this.requirePower;
	}
	
}
