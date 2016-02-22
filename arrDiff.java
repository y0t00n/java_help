// !!! Dan massiv iz 10-ti sluchaynyih tselyih chisel
// 1 Pomenyat mestami maksimalnyiy i minimalnyiy element massiva
// 2 Nayti element massiva, znachenie kotorogo nahoditsya blizhe vsego k
// srednemu znacheniyu maksimalnogo i minimalnogo elementov massiva.
// !!!3. Izmenit poryadok sledovaniya elementov massiva na protivopolozhnyiy
// 4. Sdvinut massiv vpravo (vlevo) tak, chtobyi minimalnyiy (maksimalnyiy)
// element massiva okazalsya pervyim(poslednim).
// !!! 5. Peretasovat massiv.

import java.util.Scanner;
import java.util.Arrays;
class arrDiff{

    public static int[] genArray(int length) {
        int[] resArr = new int [length];
        for (int i= 0; i < length; i++){
            resArr[i] = i + 1;
         }
        return(resArr);
    }

    public static int[] swapMinMax(int[] arr) {
        int[] resArr = arr;
        if (resArr.length>0){
            int[] minmax={0,0}; // {minIndex,maxIndex}
            int min=resArr[0];
            for (int i= 0; i < resArr.length; i++) {
                if(resArr[i] <= resArr[minmax[0]]) {
                    minmax[0] = i;
                }
                if(resArr[i] >= resArr[minmax[1]]) {
                    minmax[1] = i;
                }
            }
            
        }
        return(resArr);
    }


    public static void printArray(int[] arr) {
        if (arr.length>0){
            for (int i= 0; i < arr.length-1; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[arr.length-1]);
        }
    }

    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any integer number");
        int n = keyboard.nextInt();
        int[] initArr= genArray(n);
        printArray(initArr);
        
        // System.out.println("Original Array " + getOriginalArray(N));
        // System.out.println("Random Original Array" + getRandomArray(N));
        // System.out.println("Reverse Original Array" + getReverseArray(N));
    }
}