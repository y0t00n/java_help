// 43. ���� ������������ ����� B, ����� ����� N � ������ �� N ����� �����, 
// ������������� �� �����������. ������� �������� ������� ������ � ������ B, 
// �������� ��������������� ��������� �����.

public class hw43arrSortInsertFloat {
	public static void PrintExtendedArr(int [] arr,double k){
		int i = arr.length;
		String res = "";
		boolean added = false;
		while(i > 0){
			if ((double)arr[i-1] < k && !added){
				res = Double.toString(k) + " " + res;
				added = true;
			}
			res = Integer.toString(arr[i-1]) + " " + res;
			i--;
		}
		if (!added) {
			res = Double.toString(k) + " " + res;
		}
		System.out.println(res);
	}
}
