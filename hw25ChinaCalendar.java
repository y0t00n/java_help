// 25. V vostochnom kalendare prinjat 60-letnij cikl, sostojashhij iz 12-letnih 
// podciklov, oboznachaemyh nazvanijami cveta: zelenyj, krasnyj, zheltyj, belyj 
// i chernyj. V kazhdom podcikle gody nosjat nazvanija zhivotnyh: krysy, korovy, 
// tigra, zajca, drakona, zmei, loshadi, ovcy, obez'jany, kuricy, sobaki i 
// svin'i. Po nomeru goda opredelit' ego nazvanie, esli 1984 god — nachalo 
//cikla: «god zelenoj krysy».
// 1 - green
// 2 - red
// 3 - yellow
// 4 - white
// 5 - black

// String[] Colors = {"",green", "red", "yellow", "white", "black"};

// 1  - rat
// 2  - cow
// 3  - tiger
// 4  - hare
// 5  - dragon
// 6  - snake
// 7  - horse
// 8  - sheep
// 9  - monkey
// 10 - chicken
// 11 - dof
// 12 - pig
//String[] Totems = {"","rat", "cow", "tiger", "hare", "dragon", "snake", "horse", "sheep", "monkey", "chicken", "dof", "pig"};


import java.util.Scanner;

class hw25ChinaCalendar{

	static int yearFrom(int year) {
		if (year >= 1984) {
			return(Math.abs(year - 1984 + 1)%60);
		} else {
			return(60-Math.abs(year - 1984 + 1)%60);
		}
		
	}

	static String yearColor(int yearInCycle){
		String[] Colors = {"Black","Green" , "Red", "Brown", "White"};
		//                   0,5       1       2       3        4 
		int ind = Math.round(((float)yearInCycle%10)/2)%5;
		//%10 - to get 10y cycle; round(/2) to reduce to 5 pairs; %5 to transform 5 -> 0
		// System.out.println(ind);
		// System.out.println("Colors[ " + ind + " ] = " + Colors[ind]);
		return(Colors[ind]);
	}

	static String yearTotem(int yearInCycle){
		int ind = yearInCycle%12; //12 y cycle, 12 -> 0
		String[] Totems = {"Pig","Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog"};
		//                 0,12    1      2      3         4        5         6        7        8        9         10       11
		// System.out.println("Totems[ "+ind + " ] = " + Totems[ind]);
		return(Totems[ind]);
	}

	public static void main (String[]arg){
		if (arg.length == 1) {
			int y = Integer.parseInt(arg[0]);
			if (y > 0) {
				int inCycle = yearFrom(y);
				System.out.println(y + "'s number in Cycle is " + inCycle);
				System.out.println("It is a Year of The " + yearColor(inCycle) + " " + yearTotem(inCycle));
			}
		} else {
			System.out.println("java hw25ChinaCalendar <int YEAR [0..]>");
		}
	}
}
