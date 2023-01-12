package io.wisoft.exercise;

public class Main {
    public static void main(String[] args) {
        SelectExercise selectExercise = new SelectExercise();
        UpdateExercise updateExercise = new UpdateExercise();
        selectExercise.getQuestionOne();
        selectExercise.getQuestionTwo();
        selectExercise.getQuestionThree("HNU-E");
        selectExercise.getQuestionFour();
        selectExercise.getQuestionSeven();
        selectExercise.getQuestionEight();
        selectExercise.getQuestionNine();
        selectExercise.getQuestionTen();
        selectExercise.getQuestionEleven();
        updateExercise.getQuestionTwelve();
        updateExercise.getQuestionThirteen("실장","김수현");
        selectExercise.getQuestionFourteen("E904","이동엽","E901",4000,"R006");
        selectExercise.getQuestionFifteen();
        selectExercise.getQuestionSixteen("엔터테이너");

    }
}
