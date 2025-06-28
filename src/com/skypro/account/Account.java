package com.skypro.account;

public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        //если нельзя идентифицировать аккаунт, то тоже будем выкидывать ошибку
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.balance = balance;
    }
    //делаем некий метод, который будет прибавлять amount к нашему существующему балансу
    public void changeBalance(int amount) {
        //будем прибавлять если только денег больше 0, если меньше нуля
        if (balance + amount < 0) {
            //будем выкидывать ошибку
            throw  new IllegalArgumentException();
        }
        //в другом случае
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account {" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
