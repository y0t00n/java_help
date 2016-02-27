// 33. Nachal'nyj vklad v banke raven 1000 rub. CHerez kazhdyj mesyac razmer 
// vklada uvelichivaetsya na P procentov ot imeyushchejsya summy (P — veshchestvennoe 
// chislo, 0 < P < 25). Po dannomu P opredelit', cherez skol'ko mesyacev razmer 
// vklada prevysit 1100 rub., i vyvesti najdennoe kolichestvo mesyacev K 
// (celoe chislo) i itogovyj razmer vklada S (veshchestvennoe chislo).


import java.util.Scanner;

class hw33bank01{

	public static int countMonths(float start, float limit, float P){
		int res = 0;
		while(start < limit) {
			start+=start*P/100;
			res++;
		}
		return(res);
	}

	public static float countRes(float start, float P, int months){
		float res = start;
		for(int i=0; i<months; i++){
			res += res*P/100;
		}
		return(res);
	}

	public static void main (String[]arg){
		float start = 1000;
		float result;
		float P;
		float limit = 1100;
		int months = 0;


		if (arg.length == 1) {
			P = Float.parseFloat(arg[0]);
			if (P > 0 && P < 25) {
				months = countMonths(start,limit,P);
				result = countRes(start,P,months);
				System.out.println("Start value = " + start);
				System.out.println("Increment per month P = " + P);
				System.out.println("Limit = " + limit);
				System.out.println("Limit will be reached in " + months + " months.");
				System.out.println("Final value will be " + result);
				// System.out.println("Recursive Fib:\n" + getFactRec(N));
			} else {
				System.out.println("ERROR: 0 < P < 25");
			}
		} else {
			System.out.println("java hw33bank01 <float P> - !!! 0 < P < 25 !!!");
		}
	}
}

