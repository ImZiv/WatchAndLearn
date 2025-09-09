package two.part2.basic;

/**
 * 程式進入點
 */
public class Main {
    public static void main(String[] args) {
        // 建立學生物件
        Student s1 = new Student("小明");
        s1.setAge(20);
        s1.setScore(85);
        s1.showInfo();

        // 測試資料驗證 (錯誤輸入)
        Student s2 = new Student("小華");
        s2.showInfo();
        s2.setAge(200);
        s2.setScore(120);
        // 修改屬性 (測試 setter 驗證)
        s1.setAge(25);      // 合法
        //因為我們資料有封裝了，所以第8行設定85就被保留下來，這裡的105就不會被寫入
        s1.setScore(105);   // 錯誤
        s1.showInfo();
    }
}

