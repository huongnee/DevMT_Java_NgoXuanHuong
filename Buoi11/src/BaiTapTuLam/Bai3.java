package BaiTapTuLam;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> countries = new HashMap<>();

        System.out.println("Nhập số lượng quốc gia: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập tên quốc gia thứ " + i + ": ");
            countries.put(i, scanner.nextLine());
        }


        System.out.println("Danh sách các quốc gia vừa nhập: ");
        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        Map<Integer, String> sortedCountries = new TreeMap<>(Comparator.comparing(countries::get));
        sortedCountries.putAll(countries);

        System.out.println("Danh sách các quốc gia tăng dần theo tên: ");
        for (Map.Entry<Integer, String> entry : sortedCountries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}

