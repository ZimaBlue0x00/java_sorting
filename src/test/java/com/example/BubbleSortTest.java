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

    @Test
    public void isListSortedBubbleSort() {
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
