package com.learning.service;

import com.learning.dao.JavaCourse;
import com.learning.dao.SpringBootCourse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the PurchaseCourse service class using JUnit 5.
 */
class PurchaseCourseTest {

    /**
     * Tests the proceedWithCourse method with different course types.
     * - JavaCourse should return true (purchased)
     * - SpringBootCourse should return false (not purchasable)
     */
    @Test
    void testProceedWithCourse() {
        PurchaseCourse pc = new PurchaseCourse();

        // Test with JavaCourse - should return true
        assertTrue(pc.proceedWithCourse(new JavaCourse()));

        // Test with SpringBootCourse - should return false
        assertFalse(pc.proceedWithCourse(new SpringBootCourse()));
    }
}
