package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class BubbleSortTest 
{
    public static void randomArray (Integer[] array) {
        Random random = new Random(1);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    public static void sortedArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    @Test
    public void randomArrayTest() {
        int arraySize = 100;

        Integer[] unsortedList = new Integer[arraySize];
        randomArray(unsortedList);

        Integer[] tmp = unsortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(unsortedList);

        assertArrayEquals(tmp, unsortedList);
    }

    @Test
    public void sortedArrayTest() {
        int arraySize = 100;

        Integer[] sortedList = new Integer[arraySize];
        sortedArray(sortedList);

        Integer[] tmp = sortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(sortedList);

        assertArrayEquals(tmp, sortedList);
    }

    @Test
    public void randomArrayLargeTest() {
        int arraySize = 10000;

        Integer[] unsortedList = new Integer[arraySize];
        randomArray(unsortedList);

        Integer[] tmp = unsortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(unsortedList);

        assertArrayEquals(tmp, unsortedList);
    }

    @Test
    public void sortedArrayLargeTest() {
        int arraySize = 10000000;

        Integer[] sortedList = new Integer[arraySize];
        sortedArray(sortedList);

        Integer[] tmp = sortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(sortedList);

        assertArrayEquals(tmp, sortedList);
    }

    @Test 
    public void emptyArrayTest(){
        Integer[] unsortedList = new Integer[0];
        Integer[] tmp = unsortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(unsortedList);

        assertArrayEquals(tmp, unsortedList);
    }

    @Test
    public void nameTest(){
        SortingAlgorithm<Integer> algorithm = new BubbleSort<>();
        assertEquals("Bubble Sort", algorithm.getName());
    }
    
    @Test 
    public void timeComplexityTest() {
        SortingAlgorithm<Integer> algorithm = new BubbleSort<>();
        ComplexityInfo ci = new ComplexityInfo(Complexity.LINEAR, Complexity.QUADRATIC, Complexity.QUADRATIC);
        assertEquals(ci, algorithm.getTimeComplexity());
    }

    @Test
    public void spaceComplexityTest() {
        SortingAlgorithm<Integer> algorithm = new BubbleSort<>();
        Complexity c = Complexity.CONSTANT;
        assertEquals(c, algorithm.getSpaceComplexity());
    }
}
