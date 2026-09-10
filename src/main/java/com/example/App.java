package com.example;

import java.util.Arrays;
import java.util.Random;


public class App 
{
    public static void randomArray (Integer[] rArray, int size) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            rArray[i] = r.nextInt(10);
        }
    }

    public static void printArray(Integer[] array, int size) {
        for (int i = 0; i < size; i++){
            System.out.print(array[i]);
        }
    }   
    public static void main( String[] args )
    {
        int arraySize = 10;
        Integer[] unsortedList = new Integer[arraySize];
        randomArray(unsortedList, arraySize);
        Integer[] tmp = unsortedList.clone();
        Arrays.sort(tmp);
        printArray(tmp, arraySize);
        System.out.println();
        // printArray(Sorting.SelectionSort(unsortedList, arraySize), arraySize);    
    }
}
