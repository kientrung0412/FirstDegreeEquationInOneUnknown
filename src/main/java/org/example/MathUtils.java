package org.example;

public class MathUtils {

    public static SolutionMath findX(double a, double b) {
        if (a == 0) {
            if (b == 0) return SolutionMath.INFINITELY_SOLUTIONS;
            else return SolutionMath.NO_SOLUTION;
        } else {
            if (b == 0) return SolutionMath.valueOf(0.0);
            else return SolutionMath.valueOf(-b/ a);
        }
    }
}

