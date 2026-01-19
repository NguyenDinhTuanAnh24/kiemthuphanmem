import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2,
                analyzer.countExcellentStudents(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0)));
    }

    @Test
    public void testCountExcellentStudents_NullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void testCountExcellentStudents_ContainsNull() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1,
                analyzer.countExcellentStudents(Arrays.asList(9.0, null, 7.0)));
    }

    @Test
    public void testCountExcellentStudents_StrictBoundary() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // 7.99 -> Not excellent, 8.0 -> Excellent
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(7.99, 8.0)));
    }

    @Test
    public void testCountExcellentStudents_RobustnessBoundary() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // -0.01 (Invalid), 10.01 (Invalid), NaN, Infinity -> Expect 0
        assertEquals(0, analyzer.countExcellentStudents(
                Arrays.asList(-0.01, 10.01, Double.NaN, Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)),
                0.01);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
                analyzer.calculateValidAverage(Arrays.asList(-2.0, 12.0)));
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage_NullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.calculateValidAverage(null));
    }

    @Test
    public void testCalculateValidAverage_ContainsNull() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // 10.0 + null + 5.0 = 15.0 / 2 = 7.5
        assertEquals(7.5,
                analyzer.calculateValidAverage(Arrays.asList(10.0, null, 5.0)),
                0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryAndRobustness() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Valid: 0.0, 10.0
        // Invalid: -0.01, 10.01, NaN, Infinity
        // Average = (0.0 + 10.0) / 2 = 5.0
        assertEquals(5.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(0.0, 10.0, -0.01, 10.01, Double.NaN, Double.POSITIVE_INFINITY)),
                0.01);
    }
}
