package two.part3.advance;

// Employee 類別，繼承 Person
public class Employee extends Person {
    protected String employeeId;
    protected double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age); // 呼叫父類別建構子
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "，員工編號: " + employeeId + "，薪資: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        /*
         * 這裡的 super 指的是 父類別 (Person) 的 equals 方法，先檢查父類別 (Person) 的屬性是否相等
         * 如果這裡不先驗證，兩個員工名字或年齡不同，只要員工編號和薪資相同，就會被認為是一樣的，你的錢就變成別人的，哭啊
         */
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.employeeId.equals(other.employeeId) && this.salary == other.salary;
    }
}

