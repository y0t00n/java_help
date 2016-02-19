class hw16{

	public static void main (String[]arg){

		int n=Integer.parseInt(arg[0]);
		int h,d,u;

		if ((n/100>0) && (n/100<10)){
			h = n/100;
			d = (n-100*h)/10;
			u = n%10;
			//System.out.println(n + " " + h + " " + d + " " + u);
			if (h<d && d<u){
				System.out.print(n + " is ");
				if (u-d == d-h) {
					System.out.println("an increasing arithmetic progression with delta = " + (u-d));
				} else {
					System.out.println("an increasing progression.");
				}
			} else {
				System.out.println(n + " is not an increasing progression");	
			}
		} else {
			System.out.println(n + " is non 3-digit");
		}
	}
}