package com.studentlogger;

public class Main {
    public static void main(String[] args) {
        FileWriterUtil fileWriter = new FileWriterUtil();

        Thread t1 = new StudentWriterThread(fileWriter, new Student("chirag", 101, 85.5));
        Thread t2 = new StudentWriterThread(fileWriter, new Student("dishan", 102, 91.0));
        Thread t3 = new StudentWriterThread(fileWriter, new Student("vikyath", 103, 76.4));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All student scores have been logged successfully!");
    }
}
