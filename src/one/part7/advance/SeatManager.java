package one.part7.advance;

/**
 * 座位管理系統
 */
public class SeatManager {
    public static void main(String[] args) {
        // 建立 3x4 座位陣列 (false=空位, true=已占用)
        boolean[][] seats = new boolean[3][4];

        // 模擬預訂幾個座位
        seats[0][1] = true; // 預訂 (0,1)
        seats[1][2] = true; // 預訂 (1,2)
        seats[2][3] = true; // 預訂 (2,3)

        // 顯示座位狀態
        System.out.println("座位狀態圖 (O=空位, X=已占用):");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] ? "X " : "O ");
            }
            System.out.println();
        }

        // 統計剩餘座位
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) count++;
            }
        }
        System.out.println("剩餘座位數: " + count);
    }
}
