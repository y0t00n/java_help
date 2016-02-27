// 32. Dano celoe chislo N (> 1). Posledovatel'nost' chisel Fibonachchi FK 
// (celogo tipa) opredelyaetsya sleduyushchim obrazom: 
// F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . 
// Vyvesti ehlementy F1, F2, ..., FN.


import java.util.Scanner;

class hw32fib{

    public static void printArray(int[] arr) {
        if (arr.length>0){
            for (int i= 0; i < arr.length-1; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[arr.length-1]);
        }
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

	// static int getFibRec(int n) {
	// 	if (n==1 || n==0) {
	// 		return(1);
	// 	} else {
	// 		return(n*getFactRec(n-1));
	// 	}
	// }

	public static void main (String[]arg){
		if (arg.length == 1) {
			int N = Integer.parseInt(arg[0]);
			if (N > 0) {
				System.out.println("For N = " + N  + ", Fibonacci sequence is:");
				System.out.println("Loop      Fib:\n" + stringArray(getFibLoop(N)));
				// System.out.println("Recursive Fib:\n" + getFactRec(N));
			} else {
				System.out.println("ERROR: N > 0");
			}
		} else {
			System.out.println("java hw32fib <N> - !!! N > 0 !!!");
		}
	}
}

