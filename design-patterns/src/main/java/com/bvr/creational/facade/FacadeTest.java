package com.bvr.creational.facade;

public class FacadeTest {

    public static void main(String[] args) {

        SchoolFacade school = new SchoolFacade();

        school.enrollStudent(1, "John");
        school.enrollStudent(2, "Jane");
        school.enrollStudent(3, "Doe");

        school.addCourse(1, "Math");
        school.addCourse(2, "Science");
        school.addCourse(3, "English");

        school.addGrade(1, 1, 90);
        school.addGrade(1, 2, 80);
        school.addGrade(1, 3, 70);

        school.displayStudentDetails(1);
        school.displayAllStudents();

        school.displayCourseDetails(1);
        school.displayAllCourses();

        school.displayAllGrades();

    }
}
