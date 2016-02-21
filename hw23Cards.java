import java.util.Scanner;

class hw23Cards{

	static String getCardColor(int cardColors) {
		String res;
		switch (cardColors){
			case 1:
				res = "Spades";//"♠";
				break;
			case 2:
				res = "Clubs";//"♦";
				break;
			case 3:
				res = "Diamonds";//"♣";
				break;
			case 4:
				res = "Hearts";//"♥";
				break;
			default: 
				res = "ERROR: OUT OF RANGE [1..4]";
				break;
		}
		return(res);
	}

	static String getCardValue(int cardValue) {
		String res;
		switch (cardValue){
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				res = Integer.toString(cardValue);
				break;
			case 11:
				res = "Jack";
				break;
			case 12:
				res = "Queen";
				break;
			case 13:
				res = "King";
				break;
			case 14:
				res = "Ace";
				break;
			default: 
				res = "ERROR: OUT OF RANGE [1..4]";
				break;
		}
		return(res);
	}

	public static void main (String[]arg){
		if (arg.length == 2) {
			int v = Integer.parseInt(arg[0]);
			int c = Integer.parseInt(arg[1]);
			System.out.println("Value " + v + ", color " + c + " means " + getCardValue(v) + " of " + getCardColor(c));
		} else {
			System.out.println("java hw23Cards <int VALUE [6..14]> <int COLOR [1..4]>");
		}
	}
}
