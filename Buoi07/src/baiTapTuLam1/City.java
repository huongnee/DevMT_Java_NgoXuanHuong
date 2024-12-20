package baiTapTuLam1;

import java.util.Scanner;

public class City {
    private String cityID;
    private String cityName;
    private String country;
    private double area;

    public City() {
    }

    public City(String cityID, String cityName, String country, double area) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID : ");
        this.cityID = sc.nextLine();
        System.out.println("Nhập tên thành phố");
        this.cityName = sc.nextLine();
        System.out.println("Nhập tên quốc gia ");
        this.country = sc.nextLine();
        System.out.println("Nhập diện tích : ");
        this.area = sc.nextDouble();
    }
    public void hienThi()
    {
        System.out.println(this.cityID + "----" + this.cityName + "----" + this.country + "----" + this.area);
    }
}
