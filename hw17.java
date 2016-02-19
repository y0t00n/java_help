class hw17{

	public static void main (String[]arg){

		int n=Integer.parseInt(arg[0]);
		int t,h,d,u;

		if ((n/1000>0) && (n/1000<10)){
			t = n/1000;
			h = (n-t*1000)/100;
			d = (n-t*1000-h*100)/10;
			u = n%10;
			System.out.println(n + "-> " + t + " " + h + " " + d + " " + u);
			if (t==u && h==d){
				System.out.print(n + " is a palindrome");
			} else {
				System.out.println(" - ");	
			}
		} else {
			System.out.println(n + " is non 4-digit");
		}
	}
}