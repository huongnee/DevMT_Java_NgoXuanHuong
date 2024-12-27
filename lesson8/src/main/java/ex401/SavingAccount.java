/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex401;

/**
 *
 * @author Administrator
 */
class SavingAccount extends Account {
    private double rate; // Tỉ lệ lãi suất

    // Constructor
    public SavingAccount(double initialBalance, double rate) {
        super(initialBalance);
        this.rate = rate;
    }

    // Phương thức tính lãi
    public double getInterest() {
        return balance * rate / 100;
    }
}
