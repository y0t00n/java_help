import java.util.Scanner;

class StarsLoop{

	static void printStars(int times) {
		if (times > 0) {
			for(int i=0;i<times;i++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}

	public static void main (String[]arg){
		if (arg.length > 0) {
			int i = Integer.parseInt(arg[0]);
			if (i>0){
				for (int ii=1;ii<=i;ii++){
					printStars(ii);		
				}
			}
		} else {
			System.out.println("java StarsLoop <int NUMBER_OF_LOOPS>");
		}
	}
}