package com.studentlogger;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    // The file path where student scores will be logged
    private static final String SCORE_LOG_FILE = "student_scores.csv";

    public synchronized void logStudentScore(Student student) {

        try (FileWriter writer = new FileWriter(SCORE_LOG_FILE, true)) {
    // Append the student data as a new line in the CSV file
            writer.write(student.toString() + "\n");
            System.out.println("Logged: " + student);
        } catch (IOException e) {
    // Handle the exception, consider logging it instead of printing the stack trace
            System.err.println("Error logging student score: " + e.getMessage());
        }
    }

    public String getLogFilePath() {
        return SCORE_LOG_FILE;
    }
}