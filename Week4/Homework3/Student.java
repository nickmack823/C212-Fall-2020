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
    public static  void main(String[] args) {
        Student a = new Student("Calypso");
        System.out.println("Student" + a + "'s name is: " + a.getName() );
        a.addQuiz(90);
        a.addQuiz(96);
        a.addQuiz(90);
        System.out.println(a.getName() + "'s total score is: " + a.getTotalScore() );

        Student b = new Student("Odysseus");
        b.addQuiz(94);
        System.out.println(b.getName() + "'s total score is: " + b.getTotalScore() );
        b.addQuiz(93);
        System.out.println(b.getName() + "'s total score is: " + b.getTotalScore() );

        System.out.println(a.getName() + "'s average score is: " + a.getAverageScore() );

        System.out.println(b.getName() + "'s average score is: " + b.getAverageScore() );

    }
}
