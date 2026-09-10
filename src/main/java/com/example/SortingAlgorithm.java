package com.example;

interface SortingAlgorithm<T extends Comparable<T>> {
    String getName();

    // Worst-case, Best-case, Average-case
    ComplexityInfo getTimeComplexity();

    // Worst-case
    Complexity getSpaceComplexity();

    void sort(T[] unsortedList);
}
