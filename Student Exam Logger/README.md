# Student Exam Logger

A Java-based console application to log and manage student exam results.  
This project is part of the `Java‑Programs` repository.

## 🚀 Features

- Add new students with their exam information  
- Record exam results (subject, score, date) for each student  
- View logged results sorted by student or exam date  
- Simple menu‑driven interface in the console  
- Data stored in memory (or optionally in a file if you extend it)  

## 🧱 Project Structure

```
Student Exam Logger/
├── src/                ← Java source code
│   └── <package>/      ← your Java package(s)
│       ├── Student.java
│       ├── ExamResult.java
│       ├── LoggerApp.java   ← main application
│       └── …  
├── README.md           ← this file
└── …                   ← any other project files
```

## 🎯 Technologies Used

- Java (version 17 or above recommended)  
- Console / CLI interface  
- Collections (e.g., `List`, `Map`) for storing student & exam data  
- (Optional) File I/O if persisting results  

## 📥 Getting Started

### Prerequisites  
- Java JDK (version 17 or above)  
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal  

### Running the Application  
1. Clone the repository:  
   ```bash
   git clone https://github.com/gsrcode01/Java-Programs.git
   ```  
2. Navigate to the project folder:  
   ```bash
   cd "Java-Programs/Student Exam Logger"
   ```  
3. Compile the Java source files:  
   ```bash
   javac -d bin src/<package>/*.java
   ```  
4. Run the application:  
   ```bash
   java -cp bin <package>.LoggerApp
   ```  
5. Follow the menu options in the console to add students/exams, view logs, etc.

## 🛠️ How It Works

- **Student.java**: Represents a student (ID, name, etc.)  
- **ExamResult.java**: Represents an exam result (student ID, subject, score, date)  
- **LoggerApp.java**: Contains main method and provides a menu‑based loop for user to interact.

## 🔧 How to Extend / Improve

- Persist data to a file (CSV/JSON)  
- Add validation (e.g., ensure score is within 0‑100)  
- Implement sorting and filtering  
- Add authentication or GUI (Swing/JavaFX)  
- Write unit tests using JUnit  

## 🧪 Testing

- Manual testing through console options  
- Automated tests via JUnit for core classes  

## 📁 Licensing

Specify your licence here (e.g., MIT, Apache 2). If none chosen, mention “All rights reserved.”
