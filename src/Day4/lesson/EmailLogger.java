package Day4.lesson;

public class EmailLogger implements Logger{
	
	 @Override
	 public void log(String message) {
		 System.out.println("Email gönderildi : "+message);
	 }
	
	
	
}
