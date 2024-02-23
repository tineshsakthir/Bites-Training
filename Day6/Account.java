package com.tinesh.Day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private  String bankName = "Bank Of Boroda" ;
    private String userName = "tinesh" ;
    private int userPin = 1234 ;

    private double userBalance = 400000 ;
    List<LocalDateTime> dateList = new ArrayList<>() ;
     ArrayList<String> actions = new ArrayList<>() ;
     ArrayList<Integer> amountInvolved = new ArrayList<>() ;
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPin() {
        return userPin;
    }

    public void setUserPin(int userPin) {
        this.userPin = userPin;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    public void deposit(int amount){
        userBalance = userBalance + amount ;
    }
    public void withdraw(int amount){
        userBalance = userBalance - amount ;
    }


}
