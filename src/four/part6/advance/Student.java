package four.part6.advance;

import java.io.Serializable;

//必須實作 Serializable 才能被序列化
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，成績：" + score;
    }
}
