// 29. Dany dva celyh chisla A i B (A < B). Najti summu kvadratov vsekh celyh 
// chisel ot A do B vklyuchitel'no.


import java.util.Scanner;

class hw29SumSqrInt{

	static int getSqrSumLoop(int a, int b) {
		int sumsqr = 0;
		for (int i=a; i<=b; i++){
			sumsqr+=i*i;
		}
		return(sumsqr);
	}

	static int getSqrSumRec(int low, int high) {
		if (high==low) {
			return(low*low);
		} else {
			return(high*high+getSqrSumRec(low, high-1));
		}
	}

	public static void main (String[]arg){
		if (arg.length == 2) {
			int A = Integer.parseInt(arg[0]);
			int B = Integer.parseInt(arg[1]);
			if (A < B) {
				System.out.println("For numbers " + A + " and " + B + ", Sum of numbers A^2,(A+1)^2..B^2 equals:");
				System.out.println("Loop      SqrSum: " + getSqrSumLoop(A,B));
				System.out.println("Recursive SqrSum: " + getSqrSumRec(A,B));
			} else {
				System.out.println("ERROR: A >= B");
			}
		} else {
			System.out.println("java hw29SumSqrInt <int A> <int B> - !!! A < B !!!");
		}
	}
}

