package three.part8.basic;

import java.util.LinkedList;

/**
 * LinkedList基本操作
 */
public class Main {
    public static void main(String[] args) {
        // 1. 建立 LinkedList 儲存學生姓名
        LinkedList<String> students = new LinkedList<>();
        students.add("小a");
        students.add("小b");
        students.add("小c");

        System.out.println("初始名單：" + students);

        // 2. 使用 addFirst() 在開頭加入班長
        students.addFirst("班長");
        System.out.println("加入班長後：" + students);

        // 3. 使用 addLast() 在結尾加入轉學生
        students.addLast("轉學生");
        System.out.println("加入轉學生後：" + students);

        // 4. 使用 removeFirst() 移除第一個學生
        String removed = students.removeFirst();
        System.out.println("移除第一個學生（" + removed + "）後：" + students);
    }
}
