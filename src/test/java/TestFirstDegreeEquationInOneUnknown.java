import org.example.MathUtils;
import org.example.SolutionMath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirstDegreeEquationInOneUnknown {

    @Test
    void testInfinitelySolutions() {
        Assert.assertEquals(MathUtils.findX(0, 0), SolutionMath.INFINITELY_SOLUTIONS);
    }

    @Test
    void testNoSolution() {
        Assert.assertEquals(MathUtils.findX(0, -3), SolutionMath.NO_SOLUTION);
    }

    @Test
    void testOneSolutions() {
        double a = -3;
        double b = 6;
        SolutionMath solutionMath = SolutionMath.valueOf(-b/a) ;

        Assert.assertEquals(MathUtils.findX(a, b), solutionMath);
    }


}
