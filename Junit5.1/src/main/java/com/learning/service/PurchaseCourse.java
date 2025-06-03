package com.learning.service;

import com.learning.dao.Course;

/**
 * Service class responsible for handling course purchase operations.
 */
public class PurchaseCourse {

    // Optional: private Course field if you plan to use constructor-based or setter-based injection
    private Course course;

    /**
     * Proceeds with purchasing the given course by invoking its coursePurchased() method.
     *
     * @param course the course to be purchased
     * @return true if the course was successfully purchased, false otherwise
     */
    public boolean proceedWithCourse(Course course) {
        return course.coursePurchased();
    }
}
