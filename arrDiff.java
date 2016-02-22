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
            resArr[i] = i;
         }
        return(resArr);
    }
    
    public static int[] swapElements(int[] arr, int el1, int el2) {
        if (arr.length>1){
            arr[el1] += arr[el2];
            arr[el2] = arr[el1] - arr[el2];
            arr[el1] -= arr[el2];
        }
        return(arr);
    }

    public static int[] swapMinMax(int[] arr) {
        //System.arraycopy( src, 0, dest, 0, src.length );
        int[] minmax = getMinMax(arr);
        int[] resArr = new int[arr.length];
        System.arraycopy( arr, 0, resArr, 0, arr.length );
        resArr = swapElements(resArr, minmax[0], minmax[1]);
        return(resArr);
    }

    public static int[] getMinMax(int[] arr) {
        int[] minmax={0,0}; // {minIndex,maxIndex}
        for (int i= 0; i < arr.length; i++) {
            if(arr[i] <= arr[minmax[0]]) {
                minmax[0] = i;
            }
            if(arr[i] >= arr[minmax[1]]) {
                minmax[1] = i;
            }
        }
        return(minmax);
    }

    public static void printArray(int[] arr) {
        if (arr.length>0){
            for (int i= 0; i < arr.length-1; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[arr.length-1]);
        }
    }

    public static String stringArray(int[] arr) {
        if (arr.length>0){
            String res = "";
            for (int i= 0; i < arr.length; i++){
                res+=arr[i];
            }
            return(res);
        } else {
            return("");
        }
    }

    public static int getAvgElementIndex(int[] arr) {
        if (arr.length>1){
            int[] minmax = getMinMax(arr);
            int res = 0;

            float avg = ((float)arr[minmax[0]]+(float)arr[minmax[1]])/2;
            float minrel = Math.abs((float)arr[0] - avg);
            for (int i= 1; i < arr.length; i++){
                if (Math.abs((float)arr[i]-avg)<=minrel){
                    minrel = Math.abs((float)arr[i]-avg);
                    res = i;
                }
            }
            return res;
        } else {
            return(0);
        }
    }    

    public static int[] randomizeArr(int[] arr) {
        //System.arraycopy( src, 0, dest, 0, src.length );
        int[] resArr = new int[arr.length];
        System.arraycopy( arr, 0, resArr, 0, arr.length );

        if (resArr.length>1){
            for(int i = 0; i<arr.length*2; i++){
                int r1 = (int) (Math.random() * arr.length);
                int r2 = (int) (Math.random() * arr.length);
                if (r1!=r2){
                    resArr[r1] += resArr[r2];
                    resArr[r2] = resArr[r1] - resArr[r2];
                    resArr[r1] -= resArr[r2];
                } else {
                    i--;
                }
            }
        }
        return(resArr);
    }

    public static int[] mirrorArr(int[] arr) {
        //System.arraycopy( src, 0, dest, 0, src.length );
        int[] resArr = new int[arr.length];
        System.arraycopy( arr, 0, resArr, 0, arr.length );

        if (resArr.length>1){
            for(int i = 0; i<arr.length; i++){
                resArr[i] = arr[arr.length-1-i];
            }
        }
        return(resArr);
    }

    public static int[] shiftArr(int[] arr, int shift) {
        //System.arraycopy( src, 0, dest, 0, src.length );
        int[] resArr = new int[arr.length];
        System.arraycopy( arr, 0, resArr, 0, arr.length );

        if (resArr.length>1 && shift!=0) {
            for (int s = Math.abs(shift);s>0;s--) {
                if(shift>0){
                    for(int i = resArr.length-1; i>0; i--){
                        swapElements(resArr, i, i-1);
                    }
                } else {
                    for(int i = 0; i<resArr.length-1; i++){
                        swapElements(resArr, i, i+1);
                    }
                }
            }
        }
        return(resArr);
    }

    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any integer number");
        int n = keyboard.nextInt();
        
        int[] initArr= genArray(n);
        // printArray(initArr);
        int[] swapArr= swapMinMax(initArr);
        // printArray(swapArr);
        int avg = getAvgElementIndex(initArr);
        int[] mirArr= mirrorArr(initArr);
        // printArray(mirArr);
        int[] rArr= randomizeArr(initArr);
        // printArray(rArr);
        int[] rAr= shiftArr(rArr,rArr.length - getMinMax(rArr)[1]-1);
        // printArray(rAr);
        int[] rrA= shiftArr(rArr,-1*getMinMax(rArr)[0]);
        // printArray(rrA);

        System.out.println("#0      Original " + stringArray(initArr));
        System.out.println("#1  Swap min/max " + stringArray(swapArr));
        System.out.println("#2  Avg of array " + initArr[avg]);
        System.out.println("#3  Mirror array " + stringArray(mirArr));
        System.out.println("#5     Randomize " + stringArray(rArr));
        System.out.println("#4 Shift Array > " + stringArray(rAr));
        System.out.println("#4 Shift Array < " + stringArray(rrA));
    }
}