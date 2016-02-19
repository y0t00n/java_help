class hw19{

	public static void main (String[]arg){

		int x1 = Integer.parseInt(arg[0]);
		int y1 = Integer.parseInt(arg[1]);
		int x2 = Integer.parseInt(arg[2]);
		int y2 = Integer.parseInt(arg[3]);
		int B=0;

		// Check if both in range [1..8]
		if ((x1>0 && x1<9 && y1>0 && y1<9 && x2>0 && x2<9 && y2>0 && y2<9)){
			// print the field START
			System.out.println("..........");
			for (int ix=1;ix<=8;ix++){
				System.out.print(".");
				for (int iy=1;iy<=8;iy++){
					if (x1==x2 && y1==y2) {
						B=1;
					}
					if (ix==x1 && iy==y1){
						if (B==1) {
							System.out.print("B");
						}else {
							System.out.print("1");
						}
					} else if (ix==x2 && iy==y2){
						if (B==1) {
							System.out.print("B");
						}else {
							System.out.print("2");
						}
					} else if ((ix+iy)%2==0) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(".");
			}
			System.out.println("..........\n");
			// print the field FINISH

			// Solution itself 8-)
			if (B==1) {
				System.out.println("No movement");
			}else if (x1==x2 || y1==y2){
				System.out.println("+ Rook friendly");
			} else {
				System.out.println("- unRookAble ");	
			}
		} else {
			System.out.println("One of the coordinates is out of [1..8] range!");
		}
	}
}