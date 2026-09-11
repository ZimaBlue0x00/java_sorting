package com.example;

public class SelectionSort<T extends Comparable<T>> implements SortingAlgorithm<T> {
    String name = "Selection Sort";

    // Worst-case
    Complexity spaceComplexity = Complexity.LINEAR;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ComplexityInfo getTimeComplexity() {
        return new ComplexityInfo(
            Complexity.QUADRATIC,
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

        for (int i = 0; i < unsortedList.length; i++) {
            int jMin = i;

            for(int j = i+1; j < unsortedList.length; j++) {
                if (unsortedList[j].compareTo(unsortedList[jMin]) < 0) {
                    jMin = j;
                }    
            }

            if (jMin != i) {
                // swap
                T tmp = unsortedList[jMin];
                unsortedList[jMin] = unsortedList[i];
                unsortedList[i] = tmp;
            }
        }
    }
}
