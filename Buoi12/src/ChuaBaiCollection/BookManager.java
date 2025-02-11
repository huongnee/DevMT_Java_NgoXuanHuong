package ChuaBaiCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    List<Book> bookList = new ArrayList<Book>();

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sách");
            Book book = new Book();
            System.out.println("Enter isbn");
            book.setIsbn(sc.next());
            System.out.println("Enter Book Name: ");
            book.setBookName(sc.next());
            System.out.println("Enter Author: ");
            book.setAuthor(sc.next());
            System.out.println("Enter Publish ");
            book.setPublisher(sc.next());
            System.out.println("Enter giá");
            book.setPrice(sc.nextInt());
            bookList.add(book);
        }
    }
    public void printBook(){
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
    public void sortBook(){
        Collections.sort(bookList,(b,a)->b.getBookName().compareTo(a.getBookName()));
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.input();
        bookManager.printBook();
        System.out.println("Sau khi sắp xếp giảm đân theo giá là");
        bookManager.sortBook();
    }
}
