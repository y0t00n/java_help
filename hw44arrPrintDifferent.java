// 44. ���� ����� ����� N � ������ �� N ����� �����, ������������� �� 
// �����������. ������ ����� ����� ��������� ���������� ��������. ������� � 
// ��� �� ������� ��� ��������� �������� ������� �������.

public class hw44arrPrintDifferent {
	public static void PrintDifferentArr(int [] arr){
		int i = 0;
		String res = "";
		while(i < arr.length){
			if (i==0 || arr[i] != arr[i-1]){
				res += Integer.toString(arr[i]) + " ";
			}
			i++;
		}
		System.out.println(res);
	}
}
