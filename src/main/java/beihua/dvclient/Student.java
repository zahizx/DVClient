package beihua.dvclient;

public class Student {
    protected String name;
    protected int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        scoreToGrade();
    }

    public String getNames() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String scoreToGrade() {
        if (score >= 90) {
            return "优秀";
        } else if (score >= 80) {
            return "良好";
        } else if (score >= 70) {
            return "中等";
        } else if (score >= 60) {
            return "及格";
        } else {
            return "不及格";
        }
    }
}