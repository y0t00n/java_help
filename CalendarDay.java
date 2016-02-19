import java.util.Scanner;

class CalendarDay{
	public static void main (String[]arg){
	
		String[] nW = {"WED","THU","FRI","SAT","SUN","MON","TUE"}; //converter Array

		int k = Integer.parseInt(arg[0]);
		int day = 0;

		if (k%7==0)	{
			day = 6;
		} else {
			day = k-7*(k/7)-1;
		}
		System.out.println("Day " + k + " is " + nW[day]);
		
	}
}