package two.part2.basic;

/**
 * 學生類別
 */
public class Student {
    // 私有屬性，外部不能直接訪問
    private String name;
    private int age;
    private int score;

    // 建構子
    public Student(String name) {
        this.name = name;
    }

    // Getter 和 Setter (封裝 + 驗證)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // 這裡不限制，名字可以自由輸入
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("年齡輸入錯誤，必須介於 0 ~ 150 之間");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("成績輸入錯誤，必須介於 0 ~ 100 之間");
        }
    }

    // 顯示學生資訊
    public void showInfo() {
        System.out.println("姓名: " + name + "，年齡: " + age + "，成績: " + score);
    }
}
