package lacosflores.com.br.lacosflores.java.model;

/**
 * Created by SENAI on 19/11/2016.
 */

public class Choices {

    private String choice;
    private String votes;

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Choices{" +
                "choice='" + choice + '\'' +
                ", votes=" + votes +
                '}';
    }
}
