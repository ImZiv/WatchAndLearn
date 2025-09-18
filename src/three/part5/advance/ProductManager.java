package three.part5.advance;

import java.util.EnumMap;

public class ProductManager {
    //使用enumMap去做操作
    private EnumMap<ProductCategory, Integer> inventory = new EnumMap<>(ProductCategory.class);

    // 增加商品數量
    public void addProduct(ProductCategory category, int quantity) {
        /*
        inventory.getOrDefault(category, 0)這段意思是
        先檢查 inventory 裡有沒有這個 category
        如果有就取出原本的數量，再加上新數量。
        如果沒有就先用 0 當預設數量，再加上新數量(quantity)
         */
        inventory.put(category, inventory.getOrDefault(category, 0) + quantity);
    }

    // 顯示統計結果
    public void printInventory() {
        System.out.println("商品分類數量統計：");
        for (ProductCategory c : inventory.keySet()) {
            System.out.println(c.getName() + " -> " + inventory.get(c) + " 件");
        }
    }
}
