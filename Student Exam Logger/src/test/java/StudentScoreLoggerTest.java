import com.studentlogger.*;
import com.studentlogger1.StudentScoreLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for StudentScoreLogger to verify thread-safe file writing.
 */
public class StudentScoreLoggerTest {

    private static final String LOG_FILE_PATH = "student_scores.log";
    private StudentScoreLogger scoreLogger;

    @BeforeEach
    void setUpLogger() {
        scoreLogger = new StudentScoreLogger();
        // Clean up log file before each test
        File logFile = new File(scoreLogger.getLogFilePath());
        if (logFile.exists()) {
            assertTrue(logFile.delete(), "Failed to delete log file");
        }
    }

    @Test
    void testSingleStudentScoreLogged() throws IOException {
        // Arrange
        Student testStudent = new Student("TestStudent", 999, 88.0);

        // Act
        scoreLogger.logStudentScore(testStudent);

        // Assert
        List<String> loggedLines = Files.readAllLines(Paths.get(scoreLogger.getLogFilePath()));
        assertFalse(loggedLines.isEmpty(), "Log file should not be empty");
        assertTrue(loggedLines.get(0).contains("TestStudent,999,88.0"),
                "Logged line should contain student data");
    }

    @Test
    void testConcurrentStudentScoresLogged() throws InterruptedException, IOException {
        // Arrange
        Student studentA = new Student("A", 1, 75.0);
        Student studentB = new Student("B", 2, 85.0);

        // Create and start threads for concurrent logging
        Thread threadA = new Thread(() -> scoreLogger.logStudentScore(studentA));
        Thread threadB = new Thread(() -> scoreLogger.logStudentScore(studentB));

        // Act
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        // Assert
        List<String> loggedLines = Files.readAllLines(Paths.get(scoreLogger.getLogFilePath()));
        assertEquals(2, loggedLines.size(), "Log file should contain two entries");
        // TODO: Verify contents of logged lines are correct (consider refactoring for better readability)
    }
}