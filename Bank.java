package com.example;

public class Bank {
    private  int balance;
    private  int account;
    private  String name ;
    private  String email;
    
    public Bank() {
    }
    
    
    public Bank(int balance, int account, String name, String email) {
        this.balance = balance;
        this.account = account;
        this.name = name;
        this.email = email;
    }


    
   public int getBalance() {
        return balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getAccount() {
        return account;
    }


    public void setAccount(int account) {
        this.account = account;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Bank [balance=" + balance + ", account=" + account + ", name=" + name + ", email=" + email + "]";
    }

    public void deposit(int amount){
        balance+=amount;

    }

    public Boolean withdraw(int amount){
        if (balance-amount>=1500){
            balance-=amount;
            return true;
        }
        return false;

    }    
    
    
}
