import java.util.Scanner;

class Chess{
	public static void main (String[]arg){
	
		int x;
		int y;
		String str;
		char ch;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter x: ");
		x = keyboard.nextInt();
		System.out.println("enter y: ");
		y = keyboard.nextInt();

		ch='#';
		for (int i=0;i<y;i++) {
			str="";
			for (int k=0;k<x;k++) {
				str+=ch;
				if (ch=='#') {
					ch=' ';
				} else {
					ch='#';
				}
			}
			if (str.charAt(0)==' '){
				ch='#';
			} else {
				ch=' ';
			}
			System.out.println(str);
		}
	}
}