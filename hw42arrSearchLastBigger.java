// 42. Äàíî öåëîå ÷èñëî K è ìàññèâ èç äåñÿòè öåëûõ íåíóëåâûõ ÷èñåë. Âûâåñòè 
// íîìåð ïîñëåäíåãî ÷èñëà â ìàññèâå, áîëüøåãî K. Åñëè òàêèõ ÷èñåë íåò, òî 
// âûâåñòè 0.

public class hw42arrSearchLastBigger {

		public static int getLastBiggerItemInArr(int [] arr,int k){
			int i = arr.length;
			int res = 0;
			while(i > 0 ){
				if (arr[i-1]>k){
					res = i;
					break;
				}
				i--;
			}
			return(res);
		}

}
