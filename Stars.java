import java.util.Scanner;

class Stars{

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
			printStars(i);		
		} else {
			System.out.println("java Stars <int NUMBER_OF_STARS>");
		}
	}
}