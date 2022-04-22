package Day3.lesson.inheritance2;

public class LogManager{
	public void log(int logTypes) {
		if (logTypes==1) {
			System.out.println("Veritabanına loglandı");
		}else if (logTypes==2) {
			System.out.println("Dosya loglandı");
		}else {
			System.out.println("Email gönderildi");
		}
	}
	
}

//1 - Database
//2 - File
//3 - Email