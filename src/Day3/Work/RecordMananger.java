package Day3.Work;

public class RecordMananger {
	public void add(UserRecord userRecord) {
		System.out.println(userRecord.firstName +" "+ userRecord.lastName + " was recorded.");
	}
	public void addMultiple(UserRecord[] userRecords) {
		for(UserRecord userRecord : userRecords) {
			add(userRecord);
		}
	}
	
}
