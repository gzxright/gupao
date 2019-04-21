package 行为型模式.观察者模式.咕泡社区;

/**
 * Created by gaozhengxing 2019/3/17
 */
public class GPer {

    private final String name = "GPer生态圈";
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }
}