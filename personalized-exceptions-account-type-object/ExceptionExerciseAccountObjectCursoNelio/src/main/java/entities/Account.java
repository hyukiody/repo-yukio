package entities;

import model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    private Double amount;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        //conflito caso variavel de instancia amount > withdrawLimit;: tratar exceção;

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(Double amount) {
        if (getBalance() >= amount && getWithdrawLimit() >= amount) {
            setBalance((getBalance() - amount));
            System.out.println("New balance: " + getBalance());
        }

        if (getWithdrawLimit() < amount) {
            throw new DomainException("Given amount exceeds withdraw limit");
        } else if (getBalance() < amount) {

            throw new DomainException("Negative balance not possible");
        }
    }

    public void deposit(Double amount) {
        setBalance((getBalance() + amount));
        System.out.println("New balance after deposit: " + getBalance());
    }

}
