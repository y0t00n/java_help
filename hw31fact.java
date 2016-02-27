// 31. Dano celoe chislo N (> 0). 
// Najti proizvedenie N! = 1·2·…·N (N–faktorial). 
// CHtoby izbezhat' celochislennogo perepolneniya, 
// vychislyat' ehto proizvedenie s pomoshch'yu veshchestvennoj 
// peremennoj i vyvesti ego kak veshchestvennoe chislo.


import java.util.Scanner;

class hw31fact{

	static double getFactLoop(double n) {
		double fact = 1;
		for (int i=1; i<=n; i++){
			fact*=i;
		}
		// System.out.println();
		return(fact);
	}

	static double getFactRec(double n) {
		if (n==1 || n==0) {
			return(1);
		} else {
			return(n*getFactRec(n-1));
		}
	}

	public static void main (String[]arg){
		if (arg.length == 1) {
			double N = Double.parseDouble(arg[0]);
			if (N > 0) {
				System.out.println("For N = " + N  + ", N! equals:");
				System.out.println("Loop      N!: " + getFactLoop(N));
				System.out.println("Recursive N!: " + getFactRec(N));
			} else {
				System.out.println("ERROR: N > 0");
			}
		} else {
			System.out.println("java hw31fact <N> - !!! N > 0 !!!");
		}
	}
}

