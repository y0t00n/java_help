/**
 * 
 */

/**
 * @author y0t00n
 *  41. ���� ����� ����� K � ������ �� ������ ����� ��������� �����. ������� 
 *  ����� ������� ����� � �������, �������� K. ���� ����� ����� ���, �� 
 *  ������� 0. 
 */
public class hw41arrSearchFirstBigger {
	public static int getFirstBiggerItemInArr(int [] arr,int k){
		int i = 0;
		int res = 0;
		while(i < arr.length){
			if (arr[i]>k){
				res = i+1;
				break;
			}
			i++;
		}
		return(res);
	}

}
