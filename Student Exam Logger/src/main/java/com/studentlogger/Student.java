package com.studentlogger;
/**
 Represents a student with their name, roll number, and marks.
 */

public class Student {
    private String studentName;
    private int USN;
    private double Marks;

    /**
     * Constructs a StudentRecord object.
     * @param studentName   the name of the student
     * @param rollNumber    the USN of the student
     * @param academicMarks the marks obtained by the student
     */
    public Student(String studentName, int rollNumber, double academicMarks) {
        this.studentName = studentName;
        this.USN = rollNumber;
        this.Marks = academicMarks;
    }

    @Override

    public String toString() {
        return studentName + "," + USN + "," + Marks;
    }
}



