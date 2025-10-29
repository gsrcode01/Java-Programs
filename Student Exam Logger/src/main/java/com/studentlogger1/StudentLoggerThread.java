package com.studentlogger1;

import com.studentlogger.Student;

public class StudentLoggerThread extends Thread {
    private final StudentScoreLogger logger;
    private final Student student;

    public StudentLoggerThread(StudentScoreLogger logger, Student student) {
        this.logger = logger;
        this.student = student;
    }

    @Override
    public void run() {
        logger.logStudentScore(student);
    }

}
