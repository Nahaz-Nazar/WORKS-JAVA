package com.center.management;

public class Course {

    
    private static int courseCount = 0;

   
    public final String TRAINING_CENTER_NAME = "Global Training Center";

    
    private String courseName;
    private int durationWeeks;

    
    public Course() {
        this.courseName = "Foundation Skills";
        this.durationWeeks = 4;
        courseCount++; // Increment static counter
    }

    
    public Course(String courseName, int durationWeeks) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        courseCount++; // Increment static counter
    }

    
    public void printCourseDetails() {
        System.out.println("Training Center : " + TRAINING_CENTER_NAME);
        System.out.println("Course Name     : " + this.courseName);
        System.out.println("Duration        : " + this.durationWeeks + " weeks");
    }

    
    public static int getCourseCount() {
        return courseCount;
    }

   
    public class CourseMaterial {
        
        public void printMaterialMessage() {
            System.out.println("Material Info   : Materials provided for this course.");
        }
    }

    
    public static void main(String[] args) {
        System.out.println("=== Training Center Course Management ===\n");

       
        Course course1 = new Course();
        
        Course.CourseMaterial material1 = course1.new CourseMaterial();
        
        course1.printCourseDetails();
        material1.printMaterialMessage();
        System.out.println("----------------------------------------");

        
        Course course2 = new Course("Advanced Java Programming", 12);
        
       Course.CourseMaterial material2 = course2.new CourseMaterial();
        
        course2.printCourseDetails();
        material2.printMaterialMessage();
        System.out.println("----------------------------------------");

        
        System.out.println("Total Courses Created: " + Course.getCourseCount());
    }
}
