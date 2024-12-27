package products;

import java.util.Scanner;

public class Product {
    private String prodID;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product() {
    }

    /**
     *
     * @param prodID
     * @param prodName
     * @param manufacturer
     * @param producerPrice
     */
    public Product(String prodID, String prodName, String manufacturer, float producerPrice) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }
    //Attribute

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    //Method
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        this.prodID = sc.nextLine();
        System.out.println("Enter product name: ");
        this.prodName = sc.nextLine();
        System.out.println("Enter product manufacturer: ");
        this.manufacturer = sc.nextLine();
        System.out.println("Enter product producer price: ");
        this.producerPrice = sc.nextFloat();
    }
    public void display(){
        System.out.println("Product ID: " + this.prodID);
        System.out.println("Product Name: " + this.prodName);
        System.out.println("Product Manufacturer: " + this.manufacturer);
        System.out.println("Product Price: " + this.producerPrice);
        System.out.println("Sale-price: " + calculateSalesPrice());
    }
    public float calculateSalesPrice(){
        return  this.producerPrice + 5 * this.producerPrice/100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID='" + prodID + '\'' +
                ", prodName='" + prodName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                '}';
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.input();
        p.display();
        //
        Product p2 = new Product("MS01","Hehe","Ok",1000);
        System.out.println(p2.toString());    }
}
