import java.util.Calendar;


public class Greeting {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour <12) {
			System.out.println("good day!");
		} else if (hour <19) {
			System.out.println("good afternoon!");
		} else {
			System.out.println("good evening!");			
		}
	}

}
