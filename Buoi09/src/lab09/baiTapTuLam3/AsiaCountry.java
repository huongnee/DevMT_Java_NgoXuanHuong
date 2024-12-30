package lab09.baiTapTuLam3;

import lab09.baiTapTuLam3.Country;
import java.util.Scanner;

public class AsiaCountry extends Country {
    private String location;

    public AsiaCountry() {
    }

    public AsiaCountry(String countryName, double area, long numberPerson, String location) {
        super(countryName, area, numberPerson);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter location (Southeast Asia, East Asia, or South Asia): ");
        location = scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Location: %s%n", location);
    }
}