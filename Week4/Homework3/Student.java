package Homework3;

public class Student {

    String name; // creates name variable
    double totalScore; // creates totalScore variable; double for average later
    int numberOfQuizzes; // creates numberOfQuizzes variable

    public Student(String name) { // constructor
        this.name = name; //takes parameter values and stores it
    }
    public String getName() { // Function that returns Name of Student object
        return this.name;
    }
    public void addQuiz(int score) { // Void return type as result is not needed to be returned
        this.totalScore = this.totalScore + score;
        this.numberOfQuizzes += 1;
    }
    public double getTotalScore() {
        return this.totalScore;
    }
    public double getAverageScore() {
        return this.totalScore / this.numberOfQuizzes;
    }
}
