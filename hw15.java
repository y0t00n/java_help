class hw15{

	public static void main (String[]arg){

		int n=Integer.parseInt(arg[0]);
		int digits;

		if ((n/100>0) && (n/100<10) && (n%2==0)){
			System.out.println(n + " +");
		} else {
			System.out.println(n + " -");
		}
	}
}