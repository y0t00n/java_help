// 1. Write a function named countChars that has a String and a char as 
// parameters. The function should count the number of times the 
// character occurs in the string, and it should return the result as 
// the value of the function.
// 2. Write a subroutine with three parameters of type int. The subroutine 
// should determine which of its parameters is smallest. The value of 
// the smallest parameter should be returned as the value of the 
// subroutine.

import java.util.Scanner;
import java.util.Arrays;
class arrFinPrac{

    public static int countChars(String str, char chr){
        int count =0;
        for (int c=0; c<str.length(); c++){
            if(str.charAt(c)==chr){
                count++;
            }
        }
        return(count);
    }

    public static int[] getCharsPos(String strp, char chrp){
        int[] res = new int [countChars(strp, chrp)];
        int i = 0;
        for (int c=0; c<strp.length(); c++){
            if(strp.charAt(c)==chrp){
                res[i] = c;
                i++;
            }
        }
        return(res);
    }

    public static String printCharsPos(int[] pos){
        String res = "";
        int i=0;
        if (pos.length>0) {
            for (int c=0; c<=pos[pos.length-1]; c++){
                if(c==pos[i]){
                    res+="^";
                    i++;
                } else {
                    res+=" ";
                }
            }
        }
        return(res);
    }

    public static int getMax(int[] ints){
        int max = ints[0];
        for(int i = 1; i < ints.length; i++){
            if (max <= ints[i]){
                max=ints[i];
            }
        }
        return(max);
    }

    public static int getMin(int[] ints){
        int min = ints[0];
        for(int i = 1; i < ints.length; i++){
            if (min >= ints[i]){
                min=ints[i];
            }
        }
        return(min);
    }

    public static String stringArray(int[] arr) {
        if (arr.length>0){
            String res = "";
            for (int i= 0; i < arr.length; i++){
                res+=arr[i] + " ";
            }
            return(res);
        } else {
            return("");
        }
    }

    public static void main (String [] args) {
        String str="init";
        int[] n = new int [3];

        while (str.length() > 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\n   START   \n#1 Please, enter the String (empty String to EXIT):");
            str = keyboard.nextLine();
            if (str.length() > 0) {
                System.out.println("#1 Please, enter the single Character to search:");
                char ch = keyboard.next(".").charAt(0);
                System.out.println("#1 In a given String, character " + ch + " is found " + countChars(str, ch) + " times.");
                System.out.println("#1 " + str);
                System.out.println("#1 " + printCharsPos(getCharsPos(str,ch)));

                System.out.println("#2 Please, enter three int numbers to compare:");
                n[0] = keyboard.nextInt();
                n[1] = keyboard.nextInt();
                n[2] = keyboard.nextInt();
                int min = getMin(n);
                int max = getMax(n);
                if (min!=max) {
                    System.out.println("#2 The max of numbers " + stringArray(n) + " is " + max);
                    System.out.println("#2 The min of numbers " + stringArray(n) + " is " + min);
                } else {
                    System.out.println("#2 All three numbers " + stringArray(n) + " are  EQUAL");
                }
            }
        }
    }
}