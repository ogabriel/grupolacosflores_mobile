package lacosflores.com.br.lacosflores.java.model;

import java.util.ArrayList;

/**
 * Created by SENAI on 19/11/2016.
 */

public class Apiary {

    private String question;
    private String published_at;
    private ArrayList<Choices> choices;

    public ArrayList<Choices> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<Choices> choices) {
        this.choices = choices;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Apiary{" +
                "question='" + question + '\'' +
                ", published_at='" + published_at + '\'' +
                ", choices=" + choices +
                '}';
    }



}