package com.example;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public abstract class SortingTest {
    protected SortingAlgorithm<Integer> algorithm;
    protected int arraySize = 100;
    protected String name = "";
    protected ComplexityInfo expectedComplexityInfo;
    protected Complexity expectedComplexity;

    public SortingTest (SortingAlgorithm<Integer> algorithm, int arraySize, String name, ComplexityInfo expectedComplexityInfo, Complexity expectedComplexity) {
        this.algorithm = algorithm;
        this.arraySize = arraySize;
        this.name = name;
        this.expectedComplexityInfo = expectedComplexityInfo;
        this.expectedComplexity = expectedComplexity;
    }

    static void randomArray (Integer[] array) {
        Random random = new Random(1);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    static void sortedArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    @Test
    void randomArrayTest() {
        Integer[] unsortedList = new Integer[arraySize];
        randomArray(unsortedList);

        Integer[] expected = unsortedList.clone();

        Arrays.sort(expected);
        this.algorithm.sort(unsortedList);

        assertArrayEquals(expected, unsortedList);
    }

    @Test
    void sortedArrayTest() {
        Integer[] sortedList = new Integer[arraySize];
        sortedArray(sortedList);

        Integer[] expected = sortedList.clone();

        Arrays.sort(expected);
        this.algorithm.sort(sortedList);

        assertArrayEquals(expected, sortedList);
    }

    @Test
    void randomArrayLargeTest() {
        Integer[] unsortedList = new Integer[arraySize];
        randomArray(unsortedList);

        Integer[] expected = unsortedList.clone();

        Arrays.sort(expected);
        this.algorithm.sort(unsortedList);

        assertArrayEquals(expected, unsortedList);
    }

    @Test
    void sortedArrayLargeTest() {
        Integer[] sortedList = new Integer[arraySize];
        sortedArray(sortedList);

        Integer[] expected = sortedList.clone();

        Arrays.sort(expected);
        this.algorithm.sort(sortedList);

        assertArrayEquals(expected, sortedList);
    }

    @Test 
    void emptyArrayTest(){
        Integer[] unsortedList = new Integer[0];
        Integer[] expected = unsortedList.clone();

        Arrays.sort(expected);
        this.algorithm.sort(unsortedList);

        assertArrayEquals(expected, unsortedList);
    }

    @Test
    void nameTest(){
        assertEquals(name, this.algorithm.getName());
    }
    
    @Test 
    void timeComplexityTest() {
        assertEquals(this.expectedComplexityInfo, this.algorithm.getTimeComplexity());
    }

    @Test
    void spaceComplexityTest() {
        assertEquals(this.expectedComplexity, this.algorithm.getSpaceComplexity());
    }
}
