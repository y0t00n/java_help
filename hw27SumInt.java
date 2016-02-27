// 28. Dany dva celyh chisla A i B (A < B). Najti proizvedenie vsekh celyh 
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
			return(a*getMultABRec(high-1,low));
		}
	}

	static int getSumABSmart(int a, int b) {
		int sum = 0;
		float s1 = (float)(a+b)/2;
		float s2 = (float)(b-a)+1;
		sum=(int)(s1*s2);
		return(sum);
	}

	public static void main (String[]arg){
		if (arg.length == 2) {
			int A = Integer.parseInt(arg[0]);
			int B = Integer.parseInt(arg[1]);
			if (A < B) {
				System.out.println("From numbers " + A + " and " + B + ", Sum of numbers A,A+1..B equals:");
				System.out.println("Loop Sum: " + getSumABLoop(A,B));
				System.out.println("Smart Sum: " + getSumABSmart(A,B));
			} else {
				System.out.println("ERROR: A <= B");
			}
		} else {
			System.out.println("java hw27SumInt <int A> <int B> - !!! A > B !!!");
		}
	}
}

