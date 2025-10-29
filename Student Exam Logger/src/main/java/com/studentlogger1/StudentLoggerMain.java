package com.studentlogger1;

import com.studentlogger.Student;

public class StudentLoggerMain {
    public static void main(String[] args) {
        StudentScoreLogger logger = new StudentScoreLogger();

        Student student1 = new Student("Chirag", 101, 85.5);
        Student student2 = new Student("Dishan", 102, 91.0);
        Student student3 = new Student("Vikyath", 103, 76.4);

        Thread thread1 = new StudentLoggerThread(logger, student1);
        Thread thread2 = new StudentLoggerThread(logger, student2);
        Thread thread3 = new StudentLoggerThread(logger, student3);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // TODO: Consider handling InterruptedException more robustly
        }

        System.out.println("All student scores have been logged successfully!");
    }

}
