package ThucHanh;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private String numOfPages;
    private float price;
    public Book() {}

    public Book(String bookName, String nxb, int yearOfPublish, String numOfPages, String author, float price) {
        this.bookName = bookName;
        this.nxb = nxb;
        this.yearOfPublish = yearOfPublish;
        this.numOfPages = numOfPages;
        this.author = author;
        this.price = price;
    }
    public void nhapDuLieu(){
        System.out.println("Nhap Du Lieu");
        Scanner sc = new Scanner(System.in);
        System.out.println("bookName : ");
        bookName = sc.nextLine();
        System.out.println("nxb : ");
        nxb = sc.nextLine();
        System.out.println("yearOfPublish : ");
        yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.println("numOfPages : ");
        numOfPages = sc.nextLine();
        System.out.println("author : ");
        author = sc.nextLine();
        System.out.println("price : ");
        price = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", nxb='" + nxb + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", author='" + author + '\'' +
                ", numOfPages='" + numOfPages + '\'' +
                ", price=" + price +
                '}';
    }
}

