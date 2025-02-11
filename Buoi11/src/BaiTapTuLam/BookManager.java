package BaiTapTuLam;

import java.util.*;

class BookManager {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

//    public void displayBooksSortedByPriceDescending() {
//        Collections.sort(books, Comparator.comparing(Book::getPrice).reversed());
//        displayBooks();
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager manager = new BookManager();

        System.out.print("Nhập vào số lượng sách ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            System.out.print("Name: ");
            String bookName = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Price: ");
            float price = Float.parseFloat(scanner.nextLine());

            Book book = new Book(isbn, bookName, author, publisher, price);
            manager.addBook(book);
        }

        System.out.println("\nDanh sách");
        manager.displayBooks();

//        System.out.println("\nBooks Sắp xếp");
//        manager.displayBooksSortedByPriceDescending();
    }
}