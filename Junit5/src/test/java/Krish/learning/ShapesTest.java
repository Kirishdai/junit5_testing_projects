package Krish.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Shapes class using JUnit 5.
 */
class ShapesTest {

    // Create an instance of the class to test
    Shapes testObj = new Shapes();

    /**
     * Test that computeSquareArea does not return an incorrect value.
     * Expected: Not equal to 576 for input length = 24 (should be 576.0)
     */
    @Test
    void testComputeSquareArea() {
        assertNotEquals(576, testObj.computeSquareArea(24));
    }

    /**
     * Test that computeCircleArea returns the correct floored result.
     * Input radius: 5 → Area = π * 25 ≈ 78.54 → floored to 78
     */
    @Test
    void testComputeCircleArea() {
        assertEquals(78, testObj.computeCircleArea(5), () -> "Area of Circle calculation is wrong");
    }

    /**
     * A basic assertion test to check a true condition.
     * Verifies that the string is exactly equal to "Junit"
     */
    @Test
    void testAssertTrue() {
        String str = "Junit";
        assertTrue(str.equals("Junit"));
    }
}
