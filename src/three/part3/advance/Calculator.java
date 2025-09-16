package three.part3.advance;

//建立計算器類別，接受 Operation 參數進行計算
public class Calculator {
    public int execute(int a, int b, Operation op) {
        System.out.println("操作: " + op.describe());
        return op.apply(a, b);
    }
}
