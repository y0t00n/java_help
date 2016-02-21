import java.util.Scanner;

class hw24NumberToWords{

	static String unitsToWord(int unit) {
		String res;
		switch (unit){
			case 1:
				res = "one";
				break;
			case 2:
				res = "two";
				break;
			case 3:
				res = "three";
				break;
			case 4:
				res = "four";
				break;
			case 5:
				res = "five";
				break;
			case 6:
				res = "six";
				break;
			case 7:
				res = "seven";
				break;
			case 8:
				res = "eight";
				break;
			case 9:
				res = "nine";
				break;
			default: 
				res = "ERROR: UNITS ARE OUT OF RANGE [1..9]";
				break;
		}
		return(res);
	}

	static String hundredsToWord(int number) {
		String res = "";
		int h = number/100;
		int dec = number%100;
		if (h > 0 && h <= 9) {
			res = unitsToWord(h) + " hundred ";
		}
		if (dec!=0) {
			return(res +"and ");
		} else{
			return(res);
		}
	}

	static String decimalsToWord(int number) {
		String res = "";
		int dec = number%100;
		int d = dec/10;
		int u = dec%10;
		if (dec>0) {
			if (d==1){
				switch (u) {
					case 0:
						res = "ten";
						break;
					case 1:
						res = "eleven";
						break;
					case 2:
						res = "twelve";
						break;
					case 3:
						res = "thirteen";
						break;
					case 4:
						res = "fourteen";
						break;
					case 5:
						res = "fifteen";
						break;
					case 6:
						res = "sixteen";
						break;
					case 7:
						res = "seventeen";
						break;
					case 8:
						res = "eighteen";
						break;
					case 9:
						res = "nineteen";
						break;
					default: 
						res = "e";
						break;
				}
			} else {
				switch (d) {
					case 0:
						break;
					case 2:
						res = "twenty";
						break;
					case 3:
						res = "thirty";
						break;
					case 4:
						res = "fourty";
						break;
					case 5:
						res = "fifty";
						break;
					case 6:
						res = "sixty";
						break;
					case 7:
						res = "seventy";
						break;
					case 8:
						res = "eighty";
						break;
					case 9:
						res = "ninety";
						break;
					default: 
						res = "e";
						break;
				}
				if(u!=0) {
					if(d > 0){
						res+="-"+unitsToWord(u);
					} else {
						res+=unitsToWord(u);
					}
				}
			}
		} else {
			res = "";
		}
		return(res);
	}

	public static void main (String[]arg){
		if (arg.length == 1) {
			int i = Integer.parseInt(arg[0]);
			if (i > 99 && i < 1000) {
				System.out.println("Number " + i + " is " + hundredsToWord(i) + decimalsToWord(i));
			}
		} else {
			System.out.println("java hw24NumberToWords <int number [100..999]>");
		}
	}
}
