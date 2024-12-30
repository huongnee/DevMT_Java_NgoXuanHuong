package lab09.baiTapTuLam3;

import java.util.Scanner;

public class Country implements ICountry {
    private String countryName;
    private double area;
    private long numberPerson;

    public Country() {
    }

    public Country(String countryName, double area, long numberPerson) {
        this.countryName = countryName;
        this.area = area;
        this.numberPerson = numberPerson;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(long numberPerson) {
        this.numberPerson = numberPerson;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name: ");
        countryName = scanner.nextLine();
        System.out.print("Enter area: ");
        area = scanner.nextDouble();
        System.out.print("Enter number of people: ");
        numberPerson = scanner.nextLong();
    }

    @Override
    public void display() {
        System.out.printf("Country: %s, Area: %.2f, Population: %d%n", countryName, area, numberPerson);
    }

    @Override
    public float averageArea(double area, long numberPerson) {
        return (float) (area / numberPerson);
    }
}