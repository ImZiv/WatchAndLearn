package five.part1.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 員工薪資分析系統
 */
public class Main {
    public static void main(String[] args) {
        // 建立員工資料 (姓名, 部門, 薪資)，建立一個employee的class
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000),
                new Employee("Bob", "HR", 40000),
                new Employee("Charlie", "IT", 60000),
                new Employee("David", "Finance", 70000),
                new Employee("Eva", "HR", 45000),
                new Employee("Frank", "Finance", 80000),
                new Employee("Grace", "IT", 55000)
        );

        // 計算每個部門的平均薪資
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        // 找出薪資最高的前3名員工
        List<Employee> top3 = employees.stream()
                .sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .limit(3)
                .toList();

        // 統計各部門人數
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.counting()
                ));

        // 找出薪資超過平均值的員工
        double overallAvg = employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);

        List<Employee> aboveAvg = employees.stream()
                .filter(e -> e.getSalary() > overallAvg)
                .collect(Collectors.toList());

        // === 輸出結果 ===
        System.out.println("部門平均薪資: " + avgSalaryByDept);
        System.out.println("薪資最高的前3名員工: " + top3);
        System.out.println("各部門人數: " + countByDept);
        System.out.println("全公司平均薪資: " + overallAvg);
        System.out.println("薪資超過平均的員工: " + aboveAvg);
    }
}
