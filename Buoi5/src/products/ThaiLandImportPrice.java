package products;

import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice(String prodID, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodID, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice() {
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Tax Imported : " + taxImported);
        taxImported = sc.nextFloat();
        System.out.println("Import Price Supported : " + importPriceSupport);
        importPriceSupport = sc.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tax Imported : " + taxImported);
        System.out.println("Import Price Supported : " + importPriceSupport);
    }

    @Override
    public float calculateSalesPrice() {
        return 0;
    }
}
