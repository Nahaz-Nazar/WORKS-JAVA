package com.platform.enrollment;

public class Course {

    
    private static int totalStudentsEnrolled = 0;

   
    public static final String CREATOR_NAME = "CodeMentor Academy";

    // Instance variables
    private String courseName;
    private int durationWeeks;
    private int studentsEnrolled;

    // 3. Parameterized constructor
    public Course(String courseName, int durationWeeks, int studentsEnrolled) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        this.studentsEnrolled = studentsEnrolled;
        
        
        totalStudentsEnrolled += studentsEnrolled;
    }

    
    public void printCourseDetails() {
        System.out.println("Creator         : " + CREATOR_NAME);
        System.out.println("Course Name     : " + this.courseName);
        System.out.println("Duration        : " + this.durationWeeks + " weeks");
        System.out.println("Students Enrolled: " + this.studentsEnrolled);
    }

    // Static getter to access total students safely
    public static int getTotalStudentsEnrolled() {
        return totalStudentsEnrolled;
    }

    // 4. Static nested class
    public static class Platform {
        public void printPlatformMessage() {
            System.out.println("Host Message    : Courses are hosted on CodeMentor.");
        }
    }

    // 5. Consolidated Main Method
    public static void main(String[] args) {
        System.out.println("=== Online Course Enrollment System ===\n");

        
        Course course1 = new Course("Web Development Bootcamp", 12, 150);
        course1.printCourseDetails();
        System.out.println("---------------------------------------");

        
        Course course2 = new Course("Introduction to Python", 6, 230);
        course2.printCourseDetails();
        System.out.println("---------------------------------------");

        
        Course.Platform platformInstance = new Course.Platform();
        platformInstance.printPlatformMessage();
        System.out.println("---------------------------------------");

        
        System.out.println("Total Platform Enrollment: " + Course.getTotalStudentsEnrolled());
    }
}
