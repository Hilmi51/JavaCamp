package Day3.Work;

public class InstructorRecord extends UserRecord{
	
	private String subject;
	private String systemPassword;
	
	
	public InstructorRecord(String subject, String systemPassword) {
		super();
		this.subject = subject;
		this.systemPassword = systemPassword;
	}
	
	
	public String getSubject() {
		return subject;
	}
	
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public String getSystemPassword() {
		return systemPassword;
	}
	
	
	public void setSystemPassword(String systemPassword) {
		this.systemPassword = systemPassword;
	}
	
	
}
