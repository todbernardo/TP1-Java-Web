import static org.junit.jupiter.api.Assertions.*;

import ex1.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestScientificCalculator {

    private ScientificCalculator sc;

    @BeforeEach
    public void setup(){
        sc = new ScientificCalculator();
    }
    @Test
    public void testAddition() {
        assertEquals(10, sc.add(5, 5));
    }
    @Test
    public void testSubtraction() {
        ScientificCalculator sc = new ScientificCalculator(); // setup

        double teste = sc.subtract(5, 5); // execution
        assertEquals(0, teste); // assertion
    }
    @Test
    public void testSquareRootPositive(){
        assertEquals(5, sc.squareRoot(25));
    }
    @Test
    public void testSquareRootNegative(){
        assertEquals(5, sc.squareRoot(-25));
    }
//    @Test public void testDivide() {
//        assertEquals(1, sc.divide(5, 5));
//    }
//    @Test public void testLog() {
//        assertEquals(0, sc.log(1));
//    }
//    @Test public void testSin() {
//        assertEquals(1, sc.sin(90));
//    }

}
