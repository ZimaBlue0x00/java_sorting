package com.example;

public class SelectionSort {
    
}
// public class Sorting {

//     public static int[] bubbleSort(int[] list, int n) {
//         boolean isSorted = false;
//         while (!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < (n-1); i++) {
                
//                 if (list[i] > list [i+1]) {
//                     isSorted = false;
//                     int tmp = list[i];
//                     list[i] = list[i+1];
//                     list[i+1] = tmp;
//                 }
//             }
//             if (isSorted == true) {
//                 break;
//             }
//         }
//         return list;
//     } 

//     public static int[] selectionSort(int[] list, int n) {
//         int[] returnList = new int[n];

//         for (int i = 0; i < n; i++) {
//             int smallestItem = Integer.MAX_VALUE;
//             int index = 0;
//             for(int j = 0; j < n; j++) {
//                 if (smallestItem > list[j]) {
//                     smallestItem = list[j];
//                     index = j;
//                 }
//             }
//             list[index] = Integer.MAX_VALUE;
//             returnList[i] = smallestItem;
//         }
//         return returnList;
//     }
// }
