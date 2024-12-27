/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex401;

/**
 *
 * @author Administrator
 */
class CheckAccount extends Account {
    private double feeTransfer; 

    public CheckAccount(double initialBalance, double feeTransfer) {
        super(initialBalance);
        this.feeTransfer = feeTransfer;
    }

    @Override
    public void deposit(double money) {
        if (money > feeTransfer) {
            balance += (money - feeTransfer);
            System.out.println("Gửi tiền thành công (đã trừ phí). Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn phí giao dịch.");
        }
    }

    @Override
    public void withdraw(double money) {
        if (money + feeTransfer <= balance) {
            balance -= (money + feeTransfer);
            System.out.println("Rút tiền thành công (đã trừ phí). Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư (bao gồm phí).");
        }
    }
}
