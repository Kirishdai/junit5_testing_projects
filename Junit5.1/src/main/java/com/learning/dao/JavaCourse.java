package com.learning.dao;

/**
 * Concrete implementation of the Course interface representing a Java course.
 */
public class JavaCourse implements Course {

    /**
     * Simulates the action of purchasing a Java course.
     *
     * @return true indicating the course has been purchased
     */
    @Override
    public boolean coursePurchased() {
        System.out.println("Java course purchased");
        return true;
    }
}
