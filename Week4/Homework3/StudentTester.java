package Homework3;

public class StudentTester {
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
