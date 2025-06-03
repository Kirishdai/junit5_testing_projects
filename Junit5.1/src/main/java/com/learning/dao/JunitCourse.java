package com.learning.dao;

/**
 * Concrete implementation of the Course interface representing a JUnit course.
 */
public class JunitCourse implements Course {

    /**
     * Simulates the action of purchasing a JUnit course.
     *
     * @return true indicating the course has been purchased
     */
    @Override
    public boolean coursePurchased() {
        System.out.println("Junit course purchased");
        return true;
    }
}
