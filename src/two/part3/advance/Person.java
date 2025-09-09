package two.part3.advance;

// Person 父類別
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名: " + name + "，年齡: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        // 比較記憶體位置，如果當前的物件(Person)跟傳入的物件是同一個，就回傳true
        if (this == obj) return true;
        // 檢查傳進來的 obj 是否是 Person 類別或是它的子類別，如果不是，就不能比較，直接回傳 false
        if (!(obj instanceof Person)) return false;
        // 把 obj 強制轉型成 Person，因為上面那個if判斷已經確定 obj 是 Person，這裡安全無誤
        Person other = (Person) obj;
        // 這裡假設「名字」和「年齡」相同，就認為兩個人是相等的。
        return this.name.equals(other.name) && this.age == other.age;
    }
}
