package com.example;

public record ComplexityInfo(
    Complexity best,
    Complexity average,
    Complexity worst
) {
    void printComplexityInfo() {
        System.out.println("Hello World");
    }
}
