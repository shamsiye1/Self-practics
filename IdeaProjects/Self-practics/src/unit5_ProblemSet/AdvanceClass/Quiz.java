package unit5_ProblemSet.AdvanceClass;

public class Quiz {

    String topic;
    int totalNumberOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;

    }

    public String toString() {

        return "Quiz topic: " + topic + "\nnumbers of quiestions: " + totalNumberOfQuestions + "\nyour point is: " + totalPoints;

    }

    public void takeQuiz() {

        System.out.println("Taking the " + topic + " quiz");
    }

}


