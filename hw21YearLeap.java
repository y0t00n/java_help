import java.util.Scanner;

class YearLeap{

	static boolean isLeap(int year) {
		return((year%4==0)^(year%100==0&&year%400!=0));
	}

	static String printStrLeap(boolean isleap) {
		if (isleap) {
			return("is a leap-year");
		}else{
			return("is a regular year");
		}
	}

	static int getLeapDays(boolean isleap) {
		if (isleap) {
			return(366);
		}else{
			return(365);
		}
	}

	public static void main (String[]arg){
		if (arg.length > 0) {
			int y = Integer.parseInt(arg[0]);
			System.out.println(y + " " + printStrLeap(isLeap(y)) + " and it has " + getLeapDays(isLeap(y)) + " days");
		} else {
			System.out.println("java YearLeap <int YEAR_NUMBER>");
		}
	}
}