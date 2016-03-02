// 29. Dany dva celyh chisla A i B (A < B). Najti summu kvadratov vsekh celyh 
// chisel ot A do B vklyuchitel'no.


import java.util.Scanner;

class hw28MultInt{

	static int getMultABLoop(int a, int b) {
		int mul = 1;
		for (int i=a; i<=b; i++){
			mul*=i;
		}
		return(mul);
	}

	static int getMultABRec(int low, int high) {
		if (high==low) {
			return(low);
		} else {
			return(high*getMultABRec(low, high-1));
		}
	}

	public static void main (String[]arg){
		if (arg.length == 2) {
			int A = Integer.parseInt(arg[0]);
			int B = Integer.parseInt(arg[1]);
			if (A < B) {
				System.out.println("For numbers " + A + " and " + B + ", Multiplication of numbers A*(A+1)*..*B equals:");
				System.out.println("Loop      Multiplication: " + getMultABLoop(A,B));
				System.out.println("Recursive Multiplication: " + getMultABRec(A,B));
			} else {
				System.out.println("ERROR: A >= B");
			}
		} else {
			System.out.println("java hw28MultInt <int A> <int B> - !!! A < B !!!");
		}
	}
}

