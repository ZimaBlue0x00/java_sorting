package com.example;

public class BubbleSort<T extends Comparable<T>> implements SortingAlgorithm<T>  {
    String name = "Bubble Sort";

    // Worst-case
    Complexity spaceComplexity = Complexity.CONSTANT;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ComplexityInfo getTimeComplexity() {
        return new ComplexityInfo(
            Complexity.LINEAR,
            Complexity.QUADRATIC, 
            Complexity.QUADRATIC
        );
    }

    @Override
    public Complexity getSpaceComplexity() {
        return spaceComplexity;
    }

    @Override
    public void sort(T[] unsortedList) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < (unsortedList.length-1); i++) {
                if (unsortedList[i].compareTo(unsortedList[i+1]) > 0) {
                    isSorted = false;
                    T tmp = unsortedList[i];
                    unsortedList[i] = unsortedList[i+1];
                    unsortedList[i+1] = tmp;
                }
            }
        }
    }
}

