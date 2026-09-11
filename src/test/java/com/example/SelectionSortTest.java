package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import java.util.Random;

import org.junit.jupiter.api.Test;


public class SelectionSortTest {
    

    public static void randomArray (Integer[] array) {
        Random random = new Random(42);

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
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        algorithm.sort(unsortedList);

        assertArrayEquals(tmp, unsortedList);
    }

    @Test
    public void sortedArrayTest() {
        int arraySize = 100;

        Integer[] sortedList = new Integer[arraySize];
        sortedArray(sortedList);

        Integer[] tmp = sortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        algorithm.sort(sortedList);

        assertArrayEquals(tmp, sortedList);
    }

    @Test
    public void randomArrayLargeTest() {
        int arraySize = 1000;

        Integer[] unsortedList = new Integer[arraySize];
        randomArray(unsortedList);

        Integer[] tmp = unsortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        algorithm.sort(unsortedList);

        assertArrayEquals(tmp, unsortedList);
    }

    @Test
    public void sortedArrayLargeTest() {
        int arraySize = 1000;

        Integer[] sortedList = new Integer[arraySize];
        sortedArray(sortedList);

        Integer[] tmp = sortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        algorithm.sort(sortedList);

        assertArrayEquals(tmp, sortedList);
    }

    @Test 
    public void emptyArrayTest(){
        Integer[] unsortedList = new Integer[0];
        Integer[] tmp = unsortedList.clone();

        Arrays.sort(tmp);
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        algorithm.sort(unsortedList);

        assertArrayEquals(tmp, unsortedList);
    }

    @Test
    public void nameTest(){
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        assertEquals("Selection Sort", algorithm.getName());
    }
    
    @Test 
    public void timeComplexityTest() {
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        ComplexityInfo ci = new ComplexityInfo(Complexity.QUADRATIC, Complexity.QUADRATIC, Complexity.QUADRATIC);
        assertEquals(ci, algorithm.getTimeComplexity());
    }

    @Test
    public void spaceComplexityTest() {
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        Complexity c = Complexity.LINEAR;
        assertEquals(c, algorithm.getSpaceComplexity());
    }
}
