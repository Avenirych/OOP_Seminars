package model;
public class User {
    private String name;
    private int age;
    private int balance;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getBalance() {
        return balance;
    }

    public void creditBalance(int money) {
        this.balance += money;
    }
    public int debitBalance(int money) {
        if (money > this.balance) {
            return this.balance;
        }
        return this.balance -= money;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' + ", balance='" + balance + '\'' + '}';
    }
}