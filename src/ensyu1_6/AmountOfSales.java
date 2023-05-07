package src.ensyu1_6;

public class AmountOfSales {

    private String productCode;
    private String productName;
    private int productUnitPrice;
    private int productQuantity;
    private final double TAX = 0.1;
    private int taxIncludedAmount;

    public AmountOfSales(String productCode, String productName, int productUnitPrice,  int productQuantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.productUnitPrice = productUnitPrice;
        this.productQuantity = productQuantity;
    }

    public int getTaxIncludedAmount() {

        int sum = productUnitPrice*productQuantity;
        taxIncludedAmount = (int) (sum * TAX);
        return  taxIncludedAmount + sum;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(int productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getTAX() {
        return TAX;
    }

    public void setTaxIncludedAmount(int taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }
}
