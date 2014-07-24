package QuizCardv1;

/**
 * Created by vlasyk on 07.07.14.
 */
public class QuizCard {

    String question;
    String answer;

    QuizCard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswwer(){
        return  answer;
    }
}
