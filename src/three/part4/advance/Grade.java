package three.part4.advance;

public enum Grade {
    A, B, C, D, F;

    // 使用 switch 印出對應訊息
    public void printMessage() {
        switch (this) {
            case A:
                System.out.println("等級 A：優秀");
                break;
            case B:
                System.out.println("等級 B：不錯");
                break;
            case C:
                System.out.println("等級 C：還行");
                break;
            case D:
                System.out.println("等級 D：要加油！");
                break;
            case F:
                System.out.println("等級 F：you should not pass!");
                break;
        }
    }

    // 靜態方法：根據分數回傳成績等級
    public static Grade getGradeByScore(int score) {
        if (score >= 90) {
            return A;
        } else if (score >= 80) {
            return B;
        } else if (score >= 70) {
            return C;
        } else if (score >= 60) {
            return D;
        } else {
            return F;
        }
    }
}

