package two.part3.advance;

// Developer 類別，繼承 Employee
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String employeeId, double salary, String programmingLanguage) {
        super(name, age, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + "，程式語言: " + programmingLanguage;
    }
}