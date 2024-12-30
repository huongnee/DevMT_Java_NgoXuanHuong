package lab09.baiTapTuLam3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<AsiaCountry> countries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input information for n countries of Asia");
            System.out.println("2. Display information");
            System.out.println("3. Sort descending by area and display result");
            System.out.println("4. Find information by country name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter number of countries: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Enter details for country %d:%n", i + 1);
                        AsiaCountry country = new AsiaCountry();
                        country.input();
                        countries.add(country);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Country Information:");
                    for (AsiaCountry country : countries) {
                        country.display();
                    }
                    break;
                }
                case 3: {
                    countries.sort(Comparator.comparingDouble(AsiaCountry::getArea).reversed());
                    System.out.println("Sorted Country Information:");
                    for (AsiaCountry country : countries) {
                        country.display();
                    }
                    break;
                }
                case 4: {
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter country name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (AsiaCountry country : countries) {
                        if (country.getCountryName().equalsIgnoreCase(searchName)) {
                            country.display();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Country not found.");
                    }
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

    }
}
