package one.part8.advance;

/**
 * 動態HTML生成器
 */
public class StudentScoreHtml {
    public static void main(String[] args) {
        // 建立學生資料陣列
        String[][] students = {
                {"小明", "90"},
                {"小華", "75"},
                {"小美", "82"},
                {"小強", "68"}
        };

        // 這裡面都是html語法，所以知道可以拼接就好
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n<head>\n<meta charset='UTF-8'>\n");
        html.append("<title>學生成績表</title>\n");
        html.append("<style>table, th, td {border:1px solid black; border-collapse: collapse; padding:5px;}</style>\n");
        html.append("</head>\n<body>\n");

        html.append("<h2>學生成績表</h2>\n");
        html.append("<table>\n<tr><th>姓名</th><th>分數</th></tr>\n");

        // 加入學生資料
        for (String[] student : students) {
            html.append("<tr><td>").append(student[0]).append("</td><td>")
                    .append(student[1]).append("</td></tr>\n");
        }

        html.append("</table>\n");
        html.append("</body>\n</html>");

        // 輸出 HTML 內容
        System.out.println(html);
    }
}
