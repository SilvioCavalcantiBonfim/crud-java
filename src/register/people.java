package register;

public class people {
	private int ID;
	private String NAME;
	private String EMAIL;
	
	public people() {
		super();
	}

	public people(String nAME, String eMAIL) {
		super();
		NAME = nAME;
		EMAIL = eMAIL;
	}

	@Override
	public String toString() {
		return "people [ID=" + ID + ", NAME=" + NAME + ", EMAIL=" + EMAIL + "]";
	}

	public people(int iD, String nAME, String eMAIL) {
		super();
		ID = iD;
		NAME = nAME;
		EMAIL = eMAIL;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
}
