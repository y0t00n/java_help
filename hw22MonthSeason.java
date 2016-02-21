import java.util.Scanner;

class hw22MonthSeason{

	static String getMonthNameByNumber(int month) {
		if (month>0&&month<13){
			String[] monthName = {"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
			return(monthName[month]);
		} else {
			return("ERROR: OUT OF RANGE [1..12]");
		}
	}

	static String getMonthSeasonNameByNumber(int month) {
		if (month>0&&month<13){
			String[] monthName={"","JAN - WINTER","FEB - WINTER","MAR - SPRING","APR - SPRING","MAY - SPRING","JUN - SUMMER","JUL - SUMMER","AUG - SUMMER","SEP - AUTUMN","OCT - AUTUMN","NOV - AUTUMN","DEC - WINTER"};
			return(monthName[month]);
		} else {
			return("ERROR: OUT OF RANGE [1..12]");
		}
	}

	static String getSeasonNameByNumber(int month) {
		if (month>0&&month<13){
			String[] monthName={"","WINTER","WINTER","SPRING","SPRING","SPRING","SUMMER","SUMMER","SUMMER","AUTUMN","AUTUMN","AUTUMN","WINTER"};
			return(monthName[month]);
		} else {
			return("ERROR: OUT OF RANGE [1..12]");
		}
	}

	static String getMonthNameByNumberSwitch(int month) {
		String res;
		switch (month){
			case 1:
				res = "JAN";
				break;
			case 2:
				res = "FEB";
				break;
			case 3:
				res = "MAR";
				break;
			case 4:
				res = "APR";
				break;
			case 5:
				res = "MAY";
				break;
			case 6:
				res = "JUN";
				break;
			case 7:
				res = "JUL";
				break;
			case 8:
				res = "AUG";
				break;
			case 9:
				res = "SEP";
				break;
			case 10:
				res = "OCT";
				break;
			case 11:
				res = "NOV";
				break;
			case 12:
				res = "DEC";
				break;
			default: 
				res = "ERROR: OUT OF RANGE [1..12]";
				break;
		}
		return(res);
	}

	static String getMonthSeasonNameByNumberSwitch(int month) {
		String res;
		switch (month){
			case 1:
				res = "JAN - WINTER";
				break;
			case 2:
				res = "FEB - WINTER";
				break;
			case 3:
				res = "MAR - SPRING";
				break;
			case 4:
				res = "APR - SPRING";
				break;
			case 5:
				res = "MAY - SPRING";
				break;
			case 6:
				res = "JUN - SUMMER";
				break;
			case 7:
				res = "JUL - SUMMER";
				break;
			case 8:
				res = "AUG - SUMMER";
				break;
			case 9:
				res = "SEP - AUTUMN";
				break;
			case 10:
				res = "OCT - AUTUMN";
				break;
			case 11:
				res = "NOV - AUTUMN";
				break;
			case 12:
				res = "DEC - WINTER";
				break;
			default: 
				res = "ERROR: OUT OF RANGE [1..12]";
				break;
		}
		return(res);
	}

	static String getSeasonNameByNumberSwitch(int month) {
		String res;
		switch (month){
			case 11:
			case 12:
			case 1:
				res = "WINTER";
				break;
			case 2:
			case 3:
			case 4:
				res = "SPRING";
				break;
			case 5:
			case 6:
			case 7:
				res = "SUMMER";
				break;
			case 8:
			case 9:
			case 10:
				res = "AUTUMN";
				break;
			default: 
				res = "ERROR: OUT OF RANGE [1..12]";
				break;
		}
		return(res);
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
			int m = Integer.parseInt(arg[0]);
			System.out.println(" getMonthNameByNumber gives             : " + getMonthNameByNumber(m));
			System.out.println(" getMonthSeasonNameByNumber gives       : " + getMonthSeasonNameByNumber(m));
			System.out.println(" getSeasonNameByNumber gives            : " + getSeasonNameByNumber(m));
			System.out.println(" getMonthNameByNumberSwitch gives       : " + getMonthNameByNumberSwitch(m));
			System.out.println(" getMonthSeasonNameByNumberSwitch gives : " + getMonthSeasonNameByNumberSwitch(m));
			System.out.println(" getSeasonNameByNumberSwitch gives      : " + getSeasonNameByNumberSwitch(m));
		} else {
			System.out.println("java hw12MonthSeason <int MONTH_NUMBER [1..12]>");
		}
	}
}