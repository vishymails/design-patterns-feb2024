package com.bvr.creational.facade;

public class SchoolFacade {

    private final StudentManagement studentManagement;
    private final CourseManagement courseManagement;
    private final GradeManagement gradeManagement;

    public SchoolFacade(){
        studentManagement = new StudentManagement();
        courseManagement = new CourseManagement();
        gradeManagement = new GradeManagement();
    }

    public void enrollStudent(int studentId, String studentName){
        studentManagement.enrollStudent(studentId, studentName);
    }

    public void removeStudent(int studentId){
        studentManagement.removeStudent(studentId);
    }

    public void updateStudent(int studentId, String studentName){
        studentManagement.updateStudent(studentId, studentName);
    }

    public void displayStudentDetails(int id ) {
        studentManagement.displayStudentDetails(id);
    }

    public void displayAllStudents(){
        studentManagement.displayAllStudents();
    }

    public void addCourse(int courseId, String courseName){
        courseManagement.addCourse(courseId, courseName);
    }

    public void removeCourse(int courseId){
        courseManagement.removeCourse(courseId);
    }

    public void updateCourse(int courseId, String courseName){
        courseManagement.updateCourse(courseId, courseName);
    }

    public void displayCourseDetails(int id ) {
        courseManagement.displayCourseDetails(id);
    }

    public void displayAllCourses(){
        courseManagement.displayAllCourses();
    }

    public void addGrade(int studentId, int courseId, Integer grade ){
        gradeManagement.addGrade(studentId, courseId, grade);
    }

    public void removeGrade(int studentId, int courseId){
        gradeManagement.removeGrade(studentId, courseId);
    }

    public void updateGrade(int studentId, int courseId, Integer grade){
        gradeManagement.updateGrade(studentId, courseId, grade);
    }

    public void displayGradeDetails(int studentId, int courseId){
        gradeManagement.displayGradeDetails(studentId, courseId);
    }

    public void displayAllGrades(){
        gradeManagement.displayAllGrades();
    }

}
