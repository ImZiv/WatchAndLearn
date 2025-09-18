package three.part5.advance;

public enum ProductCategory {
    ELECTRONICS("E01", "電子", 0.05),
    CLOTHING("C01", "服飾", 0.08),
    FOOD("F01", "食品", 0.03),
    BOOKS("B01", "書籍", 0.0);
    // 分類代碼
    private final String code;
    // 名稱
    private final String name;
    // 稅率
    private final double taxRate;

    // 建構子
    ProductCategory(String code, String name, double taxRate) {
        this.code = code;
        this.name = name;
        this.taxRate = taxRate;
    }

    // Getter 方法
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    // 計算含稅價格
    public double calculatePriceWithTax(double price) {
        return price * (1 + taxRate);
    }

    // 靜態方法：根據代碼查找分類
    public static ProductCategory fromCode(String code) {
        for (ProductCategory c : ProductCategory.values()) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        // 找不到就回傳 null
        return null;
    }

    // toString 友善顯示
    @Override
    public String toString() {
        return String.format("%s(%s, 稅率: %.0f%%)", name, code, taxRate * 100);
    }
}

