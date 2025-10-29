import com.studentlogger.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;

public class FileWriterUtilTest {

    private FileWriterUtil fileWriter;

    @BeforeEach
    void setup() {
        fileWriter = new FileWriterUtil();
        // Clear the file before each test
        File file = new File(fileWriter.getLogFilePath());
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testSingleStudentWrite() throws IOException {
        // Arrange
        Student student = new Student("TestStudent", 999, 88.0);

        // Act
        fileWriter.logStudentScore(student);

        // Assert
        List<String> lines = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(fileWriter.getLogFilePath()));
        assertTrue(lines.get(0).contains("TestStudent,999,88.0"));
    }

    @Test
    void testConcurrentWrites() throws InterruptedException, IOException {
        // Arrange
        Student studentA = new Student("A", 1, 75);
        Student studentB = new Student("B", 2, 85);
        StudentWriterThread threadA = new StudentWriterThread(fileWriter, studentA);
        StudentWriterThread threadB = new StudentWriterThread(fileWriter, studentB);

        // Act
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        // Assert
        List<String> lines = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(fileWriter.getLogFilePath()));
        assertEquals(2, lines.size());
    }
}
