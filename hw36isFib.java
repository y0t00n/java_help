// 36. Dano celoe chislo N (> 1). Posledovatel'nost' chisel Fibonachchi FK 
// opredelyaetsya sleduyushchim obrazom: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … 
// . Proverit', yavlyaetsya li chislo N chislom Fibonachchi. Esli yavlyaetsya, to 
// vyvesti True, esli net — vyvesti False.


import java.util.Scanner;

class hw36isFib{

	static int[] getFibLoop(int n) {
		int [] fib = new int[n];
		for (int i=0; i<n; i++){
			if (i < 2) {
				fib[i] = 1;
			} else {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		return(fib);
	}

	public static boolean isFib(int N){
		boolean res = false;
		int i=0;
		int[] fib = getFibLoop(N+1);
		System.out.println(stringArray(fib));
		while(i<=N && fib[i]<=N){
			if(fib[i]==N){
				res=true;
			}
			i++;
		}
		return(res);
	}

    public static String stringArray(int[] arr) {
        if (arr.length>0){
            String res = "";
            for (int i= 0; i < arr.length; i++){
                res+=arr[i] + " ";
            }
            return(res);
        } else {
            return("");
        }
    }

	public static void main (String[]arg){
		if (arg.length == 1) {
			int N = Integer.parseInt(arg[0]);
			if (N > 1) {
				System.out.println("The Number is = " + N);
				if (isFib(N)){
					System.out.println("+ It IS from Fib");
				} else {
					System.out.println("- NOT Fib");
				}
			} else {
				System.out.println("ERROR: N <= 1");
			}
		} else {
			System.out.println("java hw36isFib <int N> - !!! N > 1 !!!");
		}
	}
}

