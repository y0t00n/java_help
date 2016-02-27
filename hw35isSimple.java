// 35. Dano celoe chislo N (> 1). Esli ono yavlyaetsya prostym, to est' ne 
// imeet polozhitel'nyh delitelej, krome 1 i samogo sebya, to vyvesti True, 
// inache vyvesti False.


import java.util.Scanner;

class hw35isSimple{

	public static boolean isSimple(long N){
		boolean res = true;
		long limit = Math.round(Math.sqrt(N));
		for(long i=2;i<=limit;i++){
			// System.out.println(N + " % " + i + " = " + N%i);
			if (N%i==0){
				res = false;
			}
			// System.out.println(res);
		}
		return(res);
	}

	public static void main (String[]arg){
		if (arg.length == 1) {
			int N = Integer.parseInt(arg[0]);
			if (N > 1) {
				System.out.println("The Number is = " + N);
				if (isSimple(N)){
					System.out.println("+ It IS Simple");
				} else {
					System.out.println("- NOT SIMPLE");
				}
			} else {
				System.out.println("ERROR: N <= 1");
			}
		} else {
			System.out.println("java hw34Cypherize <int N> - !!! N > 1 !!!");
		}
	}
}

