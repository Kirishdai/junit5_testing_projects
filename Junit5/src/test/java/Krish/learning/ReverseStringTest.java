package Krish.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ReverseString class using JUnit 5.
 */
class ReverseStringTest {

    // Create an instance of the class under test
    ReverseString reverse = new ReverseString();

    /**
     * Test reversing a simple word.
     * Input: "Java"
     * Expected Output: "avaJ"
     */
    @Test
    void reverseStringTest() {
        assertEquals("avaJ", reverse.reverseString("Java"));
    }

    /**
     * Test reversing a full sentence with spaces.
     * Input: "Java is easy"
     * Expected Output: "ysae si avaJ"
     */
    @Test
    void reverseStringTest2() {
        assertEquals("ysae si avaJ", reverse.reverseString("Java is easy"));
    }
}
