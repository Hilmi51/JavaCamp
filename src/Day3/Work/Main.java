package Day3.Work;

public class Main {

	public static void main(String[] args) {
		
		UserRecord userRecord = new UserRecord();
		userRecord.id=51;
		userRecord.firstName="Hilmi";
		userRecord.lastName="Şafak";
		userRecord.email="hilmisafak1@gmail.com";
		userRecord.password="12345678910";
		userRecord.phoneNumber=05555555555;
		
		
		InstructorRecord instructorRecord = new InstructorRecord("java","123456789");
		instructorRecord.id=06;
		instructorRecord.firstName="Engin";
		instructorRecord.lastName="Demiroğ";
		instructorRecord.email="@gmail.com";
		instructorRecord.password="12345678910";
		instructorRecord.phoneNumber=05555555555;
		
		
		StudentRecord studentRecord = new StudentRecord(157, "Java");
		studentRecord.id=34;
		studentRecord.firstName="-";
		studentRecord.lastName="-";
		studentRecord.email="@gmail.com";
		studentRecord.password="12345678910";
		studentRecord.phoneNumber=05555555555;
		
		RecordMananger recordMananger = new RecordMananger();
		
		UserRecord[] userRecords = {userRecord,instructorRecord,studentRecord};
		
		recordMananger.addMultiple(userRecords);
		
	}

}
