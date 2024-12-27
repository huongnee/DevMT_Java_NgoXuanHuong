/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex401;

/**
 *
 * @author Administrator
 */
class Account {
    protected double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Số tiền ban đầu phải lớn hơn hoặc bằng 0.");
        }
    }

    //gửi tiền
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Gửi tiền thành công. Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }

    //rút tiền
    public void withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Rút tiền thành công. Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư.");
        }
    }

    //lấy số dư
    public double getBalance() {
        return balance;
    }
}

