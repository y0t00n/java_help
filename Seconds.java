import java.util.Scanner;

class Seconds{
	public static void main (String[]arg){
	
		int min = 60;
		int hour = 3600;

		int k = Integer.parseInt(arg[0]);
		
		int hours = k / hour;
		int mins = (k - (hours * hour))/min;
		int secs = k - (hours * hour + mins * min);


		System.out.println(k + " seconds is: " + hours + " hours, " + mins + " minutes, " + secs + " seconds");
		
	}
}