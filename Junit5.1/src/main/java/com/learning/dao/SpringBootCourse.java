package com.learning.dao;

/**
 * Concrete implementation of the Course interface representing a Spring Boot course.
 */
public class SpringBootCourse implements Course {

    /**
     * Simulates a scenario where the Spring Boot course is not available for purchase.
     *
     * @return false indicating the course cannot be purchased
     */
    @Override
    public boolean coursePurchased() {
        System.out.println("SpringBoot course can not be purchased");
        return false;
    }
}
