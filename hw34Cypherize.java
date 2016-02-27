// 34. Dano celoe chislo N (> 0). Ispol'zuya operacii deleniya nacelo i vzyatiya 
// ostatka ot deleniya, vyvesti vse ego cifry, nachinaya s samoj pravoj 
// (razryada edinic).


import java.util.Scanner;

class hw34Cypherize{

	public static String deCypher(int N){
		String res="";
		int curnum = N;
		while(curnum > 0) {
			res+=Integer.toString(curnum%10) + " ";
			curnum=curnum/10;
		}
		return(res);
	}

	public static void main (String[]arg){
		if (arg.length == 1) {
			int N = Integer.parseInt(arg[0]);
			if (N > 0) {
				System.out.println("The Number is = " + N);
				System.out.println("Decypherizing: ");
				System.out.println(deCypher(N));
			} else {
				System.out.println("ERROR: N <= 0");
			}
		} else {
			System.out.println("java hw34Cypherize <int N> - !!! N > 0 !!!");
		}
	}
}

