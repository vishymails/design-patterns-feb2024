package com.bvr.creational.facade;

import java.util.HashMap;
import java.util.Map;

public class CourseManagement {
    private final Map<Integer, String> courseList;

    public CourseManagement(){
        this.courseList = new HashMap<>();
    }

    public void addCourse(int courseId, String courseName){
        courseList.put(courseId, courseName);
        System.out.println("Course with id: " + courseId + " and name: " + courseName + " added successfully");

    }

    public void removeCourse(int courseId){
        courseList.remove(courseId);
        System.out.println("Course with id: " + courseId + " removed successfully");
    }

    public void updateCourse(int courseId, String courseName){
        courseList.put(courseId, courseName);
        System.out.println("Course with id: " + courseId + " updated successfully");
    }

    public void displayCourseDetails(int id ) {
        if(!courseList.containsKey(id)){
            System.out.println("Course with id: " + id + " not found");
            return;
        }
        System.out.println("Course with id: " + id + " and name: " + courseList.get(id));
    }

    public void displayAllCourses(){
        courseList.forEach((k,v) -> System.out.println("Course with id: " + k + " and name: " + v));
    }


}
