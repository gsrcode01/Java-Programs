package com.studentlogger;

public class StudentWriterThread extends Thread {
    private final FileWriterUtil fileWriter;
    private final Student studentRecord;

    public StudentWriterThread(FileWriterUtil fileWriter, Student studentRecord) {
        this.fileWriter = fileWriter;
        this.studentRecord = studentRecord;
    }

    @Override
    public void run() {
        fileWriter.logStudentScore(studentRecord);
    }

}