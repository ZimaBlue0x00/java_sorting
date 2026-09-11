package com.example;

public class SelectionSortTest extends SortingTest {
    
    SelectionSortTest() {
        SortingAlgorithm<Integer> algorithm = new SelectionSort<>();
        super(algorithm, 
            100, 
            "Selection Sort", 
            new ComplexityInfo(Complexity.QUADRATIC, Complexity.QUADRATIC, Complexity.QUADRATIC), 
            Complexity.LINEAR
        );
    }
}
