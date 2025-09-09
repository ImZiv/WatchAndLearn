package two.part3.advance;

// Manager 類別，繼承 Employee
public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, String employeeId, double salary, String department) {
        super(name, age, employeeId, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "，部門: " + department;
    }
}
