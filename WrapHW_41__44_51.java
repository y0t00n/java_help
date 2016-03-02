/**
 * 
 */

/**
 * @author y0t00n
 *
 *  41. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести 
 *  номер первого числа в массиве, большего K. Если таких чисел нет, то 
 *  вывести 0. 
 * 
// 42. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести 
// номер последнего числа в массиве, большего K. Если таких чисел нет, то 
// вывести 0.
 * 
// 43. Дано вещественное число B, целое число N и массив из N целых чисел, 
// упорядоченных по возрастанию. Вывести элементы массива вместе с числом B, 
// сохраняя упорядоченность выводимых чисел.
 * 
// 44. Дано целое число N и массив из N целых чисел, упорядоченный по 
// возрастанию. Данный набор может содержать одинаковые элементы. Вывести в 
// том же порядке все различные элементы данного массива.
 * 
// 51. В компании "Фабрика Од Уа, ЛТД" работает 10 человек. Используя класс 
// Employee написать программу, которая создает список (массив) из 10 
// элементов и заполняет его данными о сотрудниках компании. Главбух 
// компании очень любит различные красивые отчеты и статистику. Для того, 
// чтобы сделать работу главбуха веселее, а себе выбить возможность 
// получения бонусов, реализовать в программе следующие функции:
// a. Печать отчета в виде: INN ФИО зряплата
// b. Вычислить ежемесечное количество денег, которое главбух должен 
// c. Вычислить сотрудника с минимальным окладом. Распечатать в виде: INN 
// d. Вычислить мажора с максимальным окладом. Распечатать в виде:
// INN ФИО зряплат
// Note: Класс Employee должен содержать следующую информацию о сотруднике - 
// INN, Name, Surname, Salary 
// оторвать от фонда заработной платы для выдачи сотрудникам.
// ФИО зряплата
 */
import java.util.Random;
import java.util.Scanner;
//43
import java.util.Arrays;
//41 public class WrapHW_41__46_51 extends hw41arrSearchFirstBigger {
//42	public class WrapHW_41__44_51 extends hw42arrSearchLastBigger {
//43	public class WrapHW_41__44_51 extends hw43arrSortInsertFloat {
//44
	public class WrapHW_41__44_51 extends hw44arrPrintDifferent {
    public static int[] genIntArrayRand(int length, int low, int high) {
        int[] resArr = new int [length];
        Random rand = new Random();
        long range = (long)high - (long)low + 1;
        long fraction;
        for (int i= 0; i < length; i++){
        	fraction = (long)(range * rand.nextDouble());
            resArr[i] = (int)(fraction + low);
         }
        return(resArr);
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
	public static int[][] getBiggerItemsInArr(int [] arr,int k){
		int i = 0;
		int[][] resArr = new int [arr.length][2];
		int res = 0;
		while(i < arr.length){
			if (arr[i]>k){
				resArr[res][0] = i+1;
				resArr[res][1] = arr[i];
				res++;
			}
			i++;
		}
		return(resArr);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Enter side A:");
//		float a = keyboard.nextFloat();
//		System.out.println("Enter side B:");
//		float b = keyboard.nextFloat();
//		System.out.println("Enter side C:");
//		float c = keyboard.nextFloat();

		int[] arr = genIntArrayRand(10, 1,100);
		Arrays.sort(arr);
		System.out.println("\nArray:\n"+stringArray(arr));
		
//414243	Scanner keyboard = new Scanner(System.in);
//4142		System.out.println("Enter K to check:");
//43		System.out.println("Enter K (Double) to check:");
//4142		int k = keyboard.nextInt();
//43		Double k = keyboard.nextDouble();
//41		int n = getFirstBiggerItemInArr(arr,k);
//42		int n = getLastBiggerItemInArr(arr,k);
//43		PrintExtendedArr(arr,k);
		
//4142		int searchRes[][] = getBiggerItemsInArr(arr,k);
//41		System.out.println("The first Bigger item number is " + n);
//42		System.out.println("The last Bigger item number is " + n);
//4142		int i = 0;
//4142		while(i < arr.length && searchRes[i][0] != 0){
//4142			System.out.println("Element Nr " + searchRes[i][0] + " is " + searchRes[i][1] + " > " + k);
//4142			i++;
//4142		}
//44
		PrintDifferentArr(arr);
		int [] arrM = new int[] {1,1,1,1,2,2,2,2,2,2};
		System.out.println("\n\nManual Array:\n"+stringArray(arrM));
		PrintDifferentArr(arrM);
		
		
	}

}

