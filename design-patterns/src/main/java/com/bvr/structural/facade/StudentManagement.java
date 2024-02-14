package com.bvr.structural.facade;

import java.util.HashMap;
import java.util.Map;
public class StudentManagement {
    private final Map<Integer, String> stdentList;

    public StudentManagement(){
        stdentList = new HashMap<>();
    }

    public void enrollStudent(int studentId, String studentName){
        stdentList.put(studentId, studentName);
        System.out.println("Student with id: " + studentId + " and name: " + studentName + " enrolled successfully");
    }

    public void removeStudent(int studentId){
        stdentList.remove(studentId);
        System.out.println("Student with id: " + studentId + " removed successfully");
    }

    public void updateStudent(int studentId, String studentName){
        stdentList.put(studentId, studentName);
        System.out.println("Student with id: " + studentId + " updated successfully");
    }

    public void displayStudentDetails(int id ) {
        if(!stdentList.containsKey(id)){
            System.out.println("Student with id: " + id + " not found");
            return;
        }
        System.out.println("Student with id: " + id + " and name: " + stdentList.get(id));
    }

    public void displayAllStudents(){
        stdentList.forEach((k,v) -> System.out.println("Student with id: " + k + " and name: " + v));
    }



}
