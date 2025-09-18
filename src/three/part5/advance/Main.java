package three.part5.advance;

public class Main {
    public static void main(String[] args) {
        // 測試 Enum 的基本功能
        ProductCategory pc1 = ProductCategory.ELECTRONICS;
        System.out.println(pc1);
        System.out.println("原價: 1000, 含稅: " + pc1.calculatePriceWithTax(1000));

        // 測試代碼查詢
        ProductCategory pc2 = ProductCategory.fromCode("F01");
        System.out.println("查詢 F01 → " + pc2);

        // 使用 EnumMap 做統計
        ProductManager manager = new ProductManager();
        manager.addProduct(ProductCategory.ELECTRONICS, 5);
        manager.addProduct(ProductCategory.CLOTHING, 10);
        manager.addProduct(ProductCategory.FOOD, 20);
        manager.addProduct(ProductCategory.BOOKS, 7);

        manager.printInventory();
    }
}
