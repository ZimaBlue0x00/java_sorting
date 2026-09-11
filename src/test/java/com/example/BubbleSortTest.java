package com.example;

public class BubbleSortTest extends SortingTest
{
    BubbleSortTest () {
        SortingAlgorithm<Integer> algorithm = new BubbleSort<>();
        super(algorithm, 
            100, 
            "Bubble Sort", 
            new ComplexityInfo(Complexity.LINEAR, Complexity.QUADRATIC, Complexity.QUADRATIC), 
            Complexity.CONSTANT);
    }
}
