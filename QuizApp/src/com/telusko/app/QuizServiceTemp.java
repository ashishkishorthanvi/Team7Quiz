package com.telusko.app;

public class QuizServiceTemp
{

    int nums[] = new int[5]; // array of 5 integer
    QuizTemp questions[] = new QuizTemp[5]; // array of References

    public QuizServiceTemp() {

        questions[0] = new QuizTemp(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new QuizTemp(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new QuizTemp(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new QuizTemp(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new QuizTemp(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz() {
        for(QuizTemp q : questions)
        {
            System.out.println(q.getTitle());
        }
    }
}
