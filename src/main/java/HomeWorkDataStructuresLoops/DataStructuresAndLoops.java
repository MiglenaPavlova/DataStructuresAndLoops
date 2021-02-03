package HomeWorkDataStructuresLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataStructuresAndLoops {
    static int[] arrayElemet = new int[20];
    static int[] arraySmall = {2,3,4,5,6};

    static  ArrayList<Integer> myNumberslist = new ArrayList<Integer>();
    static  ArrayList<Integer> printMyNumberlist = new ArrayList<Integer>();


    public static void main(String[] args) {

        fillAndPrintTheArray();
        averageSumArray();
        sumEvenOdd();
        printMyNumbersList();
        printNotDivideThreeSeven();
        fibonacciNumbers();

    }

    //array from 20 elements
        public static void fillAndPrintTheArray(){
            for (int i = 0; i < arrayElemet.length; i++) {
                arrayElemet[i] = i * 5;
            }
                System.out.println("1. Task: Array from 20 elements \n" + Arrays.toString(arrayElemet));
        }

    //average sum in the array
        public static void averageSumArray(){
        int sum = 0;
            for (int i = 0; i < arraySmall.length; i++){
                sum +=  arraySmall[i];
            }
            System.out.println("\n2. Task: The average sum in the array\nThe average sum of elements in the array is: " + sum/arraySmall.length);
        }
    // sum of the evens and the odds
        public static void sumEvenOdd(){
        int sumEvenen = 0;
        int sumOdd = 0;

            for (int i = 0; i < arraySmall.length; i++) {
                if (arraySmall[i] % 2 == 0){
                    sumEvenen += arraySmall[i];
                }
                else {
                    sumOdd += arraySmall[i];
                }
            }
            System.out.println("\n3. Task: The sum of the evens and the odds in the array \nThe sum of evens is: " + sumEvenen);
            System.out.println("The sum of odds is: " + sumOdd);

        }
        //array list
        public static void printMyNumbersList() {
           Scanner scan = new Scanner(System.in);
           System.out.println("\n4. Task: Print the list of N numbers \nEnter N the number for the end of the list: ");
           int enterNumber = scan.nextInt();
            for (int i = 0; i < enterNumber; i++) {
                myNumberslist.add(i+1);
            }
           System.out.printf("The numbers in the list form 1 to %s are: %s\n",enterNumber, myNumberslist );
        }

        //print numbers not divisible by 3 and 7
        public static void printNotDivideThreeSeven(){
            int h = 0;
            for (int i = 0; i < myNumberslist.size(); i++) {
               if (myNumberslist.get(i) % 3 != 0){
                   if (myNumberslist.get(i) % 7 != 0){
                       printMyNumberlist.add(h, myNumberslist.get(i));
                       h++;
                   }

               }

           }
           System.out.println("\n5. Task: Print the not divisible by 3 and 7 numbers from the list \nNumbers of the arraylist that can not be divided by 3 or 7 are: " + printMyNumberlist);
        }

        // Fobonacci Numbers
        public static void fibonacciNumbers(){
            int enterNum, firstNumber = 0, secondNumber = 1;
            System.out.println("\n6. Task: Print the Fibonacci sequence \nHow many numbers you want in the sequence:");
            Scanner scanner = new Scanner(System.in);
            enterNum = scanner.nextInt();
            System.out.print("Fibonacci Series of "+enterNum+" numbers:");

            int i=1;
            while(i<=enterNum)
            {
                System.out.print(firstNumber+" ");
                int sumOfFirstAndSecond = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sumOfFirstAndSecond;
                i++;
            }

        }

}
