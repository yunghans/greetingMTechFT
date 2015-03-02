import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Greeting {

	public static void main(String[] args) {
		
		System.out.println("Please enter your name:");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String name="";
		try {name=bf.readLine();} catch (IOException ex) {};


		
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if (hour <12) {
			System.out.println("good day "+ name + "!");
		} else if (hour <19) {
			System.out.println("good afternoon "+ name + "!");
		} else {
			System.out.println("good evening "+ name + "!");			
		}
	}

}
