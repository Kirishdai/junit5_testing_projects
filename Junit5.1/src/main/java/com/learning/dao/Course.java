package com.learning.dao;

/**
 * Interface representing a Course in the system.
 * Intended to be implemented by any class that needs to define course purchase logic.
 */
public interface Course {

    /**
     * Determines whether the course has been purchased.
     *
     * @return true if the course is purchased, false otherwise
     */
    boolean coursePurchased();
}
