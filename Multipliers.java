import java.util.Scanner;

class Multipliers{
	public static void main (String[]arg){
	
		// int x;
		// int y;
		// String str;
		// char ch;
		
		// Scanner keyboard = new Scanner(System.in);
		// System.out.println("enter x: ");
		// x = keyboard.nextInt();
		// System.out.println("enter y: ");
		// y = keyboard.nextInt();

		// ch='#';
		String str="";
		int[] tempArr = {0,0};
		int[] num = {0,0};
		int top = Integer.parseInt(arg[0]);
		double sqrttop = Math.sqrt(top);

		// for (int i=top;i>=Math.round(sqrttop);i--) {
		for (int i=top;i>=1;i--) {
			tempArr[0]=i;
			tempArr[1]=0;
			// for (int k=i;k>=Math.round(sqrttop);k--) {
			for (int k=i;k>=1;k--) {
				if (i%k==0){

					tempArr[1]++;
				}
			}
			if (tempArr[1]>num[1]){
				System.out.println("tempArr[0] = " + tempArr[0] + " tempArr[1] = " + tempArr[1]);
				num[0] = tempArr[0];
				num[1] = tempArr[1];
			}
		}
		System.out.println("Number: " + num[0] + "; Counter: " + num[1] + ";");
	}
}