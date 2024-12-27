/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex401;

/**
 *
 * @author Administrator
 */
public class Program {
    public static void main(String[] args) {
        Account account = new Account(10000);
        account.deposit(5500);
        account.withdraw(3500);
        System.out.println("Số dư tài khoản: " + account.getBalance());

        SavingAccount sA = new SavingAccount(2000, 5);
        System.out.println("Lãi suất: " + sA.getInterest());

        CheckAccount cA = new CheckAccount(1500, 10);
        cA.deposit(2002);
        cA.withdraw(1020);
        System.out.println("Số dư tài khoản kiểm tra: " + cA.getBalance());
    }
}
