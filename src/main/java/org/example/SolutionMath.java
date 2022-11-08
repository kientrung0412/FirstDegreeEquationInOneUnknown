package org.example;

public enum SolutionMath {
    INFINITELY_SOLUTIONS, NO_SOLUTION, ONE_SOLUTIONS;

    private Double value;

    SolutionMath() {
    }

    public SolutionMath setValue(Double value) {
        this.value = value;
        return this;
    }

    public static SolutionMath valueOf(Double v) {
        return ONE_SOLUTIONS.setValue(v);
    }

    public Double getValue() {
        return value;
    }
}
