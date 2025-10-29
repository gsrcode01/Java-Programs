
package com.studentlogger1;

/**

 Represents a student with their name, roll number, and marks.
 */
public class Student {
    private String studentName;
    private int rollNumber;
    private double academicMarks;

    /**

     Constructs a Student object.
     @param studentName the name of the student
     @param rollNumber the roll number of the student
     @param academicMarks the marks obtained by the student
     */
    public Student(String studentName, int rollNumber, double academicMarks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.academicMarks = academicMarks;
    }

    /**

     Returns a CSV string representation of the student.
     @return the CSV string
     */
    public String toCsvString() {
        return String.format("%s,%d,%.1f", studentName, rollNumber, academicMarks);
    }

    @Override
    public String toString() {
        return String.format("Student[name=%s,_rollNumber=%d,_academicMarks=%.1f]", studentName, rollNumber, academicMarks);
    }
}

