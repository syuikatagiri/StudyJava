package src.ensyu1_6;

public class UseAmountOfSales {
    public static void main(String[] args) {
        AmountOfSales data = new AmountOfSales("f001", "apple", 80,  8);

        System.out.println( "商品コード"+ data.getProductCode()      + "\n" +
                            "商品名"   + data.getProductName()      + "\n" +
                            "商品単価"  + data.getProductUnitPrice()      + "\n" +
                            "販売数量"  + data.getProductQuantity() + "\n" +
                            "売上金額"  + data.getTaxIncludedAmount() );
                }
}
