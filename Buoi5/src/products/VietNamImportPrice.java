package products;

import java.util.Scanner;

public class VietNamImportPrice extends Product{
    private float taxImported;

    public VietNamImportPrice(String prodID, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodID, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public VietNamImportPrice() {
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Tax Imported: ");
        taxImported = sc.nextFloat();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tax Imported: " + taxImported);
        System.out.println(calculateSalesPrice());
    }

    @Override
    public String toString() {
        return "VietNamImportPrice{" +
                "taxImported=" + taxImported +
                ",Sellprice " + calculateSalesPrice() +
                '}';
    }

    @Override
    public float calculateSalesPrice() {
        float importedPrice = super.calculateSalesPrice();
        float salesPrice = importedPrice + taxImported * importedPrice
                + 10 * (importedPrice + taxImported*importedPrice)/100;
        return salesPrice;
    }

    public static void main(String[] args) {
        VietNamImportPrice vip = new VietNamImportPrice();
        vip.input();
        System.out.println(vip.toString());

    }
}
