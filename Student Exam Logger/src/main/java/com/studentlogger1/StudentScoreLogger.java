package com.studentlogger1;

import com.studentlogger.Student;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Utility class for logging student scores to a CSV file.
 */
public class StudentScoreLogger {
    // The file path where student scores will be logged
    private static final String SCORE_LOG_FILE = "student_scores.csv";

    /**
     * Logs a student score to the CSV file.
     *
     * @param student the student with their score
     */
    public synchronized void logStudentScore(Student student) {
        try (FileWriter writer = new FileWriter(SCORE_LOG_FILE, true)) {
// Append the student data as a new line in the CSV file
            writer.write(student.toString() + "\n");
            System.out.println("Logged: " + student);
        } catch (IOException e) {
// Handle the exception, consider logging it instead of printing the stack trace
            System.err.println("Error logging student score: " + e.getMessage());
// TODO: Consider using a logging framework instead of System.err
        }
    }

    /**
     * Returns the file path where student scores are logged.
     *
     * @return the log file path
     */
    public String getLogFilePath() {
        return SCORE_LOG_FILE;
    }
}
