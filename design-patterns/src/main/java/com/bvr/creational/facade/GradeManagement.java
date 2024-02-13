package com.bvr.creational.facade;

import java.util.HashMap;
import java.util.Map;
public class GradeManagement {
    private Map<String, Integer> gradeList;

    public GradeManagement(){
        gradeList = new HashMap<>();
    }

    public void addGrade(int studentId, int courseId, Integer grade ){
        String key = studentId + "_" + courseId;
        gradeList.put(key, grade);
        System.out.println("Grade with student id: " + studentId + " and course id: " + courseId + " added successfully");
    }

    public void removeGrade(int studentId, int courseId){
        String key = studentId + "_" + courseId;
        gradeList.remove(key);
        System.out.println("Grade with student id: " + studentId + " and course id: " + courseId + " removed successfully");
    }

    public void updateGrade(int studentId, int courseId, Integer grade){
        String key = studentId + "_" + courseId;
        gradeList.put(key, grade);
        System.out.println("Grade with student id: " + studentId + " and course id: " + courseId + " updated successfully");
    }

    public void displayGradeDetails(int studentId, int courseId){
        String key = studentId + "_" + courseId;
        if(!gradeList.containsKey(key)){
            System.out.println("Grade with student id: " + studentId + " and course id: " + courseId + " not found");
            return;
        }
        System.out.println("Grade with student id: " + studentId + " and course id: " + courseId + " and grade: " + gradeList.get(key));
    }

    public void displayAllGrades(){
        gradeList.forEach((k,v) -> {
            String[] keys = k.split("_");
            System.out.println("Grade with student id: " + keys[0] + " and course id: " + keys[1] + " and grade: " + v);
        });
    }


}
