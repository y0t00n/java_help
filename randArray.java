import java.util.Scanner;

class randArray{

	public static void main (String[]arg){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int N = keyboard.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int count=0;count<10;count++){
			int indFrom = (int) (Math.random() * (N-1));
			int indTo = (int) (Math.random() * (N-1));
			
			// System.out.println("arr[" + indFrom + "] To arr[" + indTo + "]");
			// System.out.println("    " + arr[indFrom] + "         " + arr[indTo]);
			
			if (indFrom!=indTo) {
				arr[indFrom]+=arr[indTo];
				arr[indTo]=arr[indFrom]-arr[indTo];
				arr[indFrom]=arr[indFrom]-arr[indTo];
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}