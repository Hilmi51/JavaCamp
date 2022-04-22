package Day3.Work;

public class StudentRecord extends UserRecord{
	
	private int studentNumber;
	private String clas;
	
	
	public StudentRecord(int studentNumber, String clas) {
		super();
		this.studentNumber = studentNumber;
		this.clas = clas;
	}


	public int getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getClas() {
		return clas;
	}


	public void setClas(String clas) {
		this.clas = clas;
	}
	

}
