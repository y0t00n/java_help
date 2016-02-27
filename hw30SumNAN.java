// 30. Dano veshchestvennoe chislo A i celoe chislo N (> 0). 
// Ispol'zuya odin cikl, najti znachenie vyrazheniya 1 – A + A2 – A3 + … + (–1)^N·A^N.
// Uslovnyj operator ne ispol'zovat'.


import java.util.Scanner;

class hw30SumNAN{

	static double getSumNANLoop(double a, int n) {
		double sumnan = 0;
		double inc;
		for (int i=0; i<=n; i++){
			inc = Math.pow(-1.0,i)*Math.pow(a,i);
			// System.out.print(inc + " + ");
			sumnan += inc;
		}
		// System.out.println();
		return(sumnan);
	}

	static double getSumNANRec(double a, int n) {
		if (n==0) {
			return(1);
		} else {
			return(Math.pow(-1.0,n)*Math.pow(a,n) + getSumNANRec(a,n-1));
		}
	}

	public static void main (String[]arg){
		if (arg.length == 2) {
			double A = Double.parseDouble(arg[0]);
			int N = Integer.parseInt(arg[1]);
			if (N > 0) {
				System.out.println("For Real A = " + A + " and N = " + N + ", Sum of numbers ((-1)^n)*(A^n), n = 0,1..N equals:");
				System.out.println("Loop      SumNAN: " + getSumNANLoop(A,N));
				System.out.println("Recursive SumNAN: " + getSumNANRec(A,N));
			} else {
				System.out.println("ERROR: N <= 0");
			}
		} else {
			System.out.println("java hw30SumNAN <Real A> <int N> - !!! N > 0 !!!");
		}
	}
}

