package com.tinesh.Day6;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        boolean Conti = true;
        Scanner scanner = new Scanner(System.in) ;
        do{
            System.out.println("Enter you username : ");
            String curUserName = scanner.nextLine() ;
            System.out.println("Enter your pin : ");
            int curUserPin = scanner.nextInt() ;
            Account account = new Account() ;
            if(account.getUserName().equals(curUserName) && account.getUserPin() == curUserPin){
                    System.out.println("Press 1 for Withdraw \nPress 2 for Deposit \nPress 3 for Balance Check\nPress 4 for mini Statement\nPress 5 for Change Pin \nPress 0 to exit ");
                    int option = scanner.nextInt() ;
                    if(option == 0) break;
                    else if(option == 1){
                        System.out.println("Enter the amount to Withdraw : ");
                        int amountToWithdraw = scanner.nextInt() ;
                        if(amountToWithdraw > account.getUserBalance()){
                            System.out.println("You don't have the sufficient balance to withdraw....");
                        }else{
                            account.withdraw(amountToWithdraw);
                            account.dateList.add(LocalDateTime.now()) ;
                            account.actions.add("Withdraw") ;
                            account.amountInvolved.add(amountToWithdraw) ;
                            System.out.println("Your amount has been withdrawed , please collect it!!!");
                            System.out.println("Your current Balance is..." + account.getUserBalance());
                        }
                    }
                    else if(option == 2 ){
                        System.out.println("Enter the amount to deposit : ");
                        int amountToDeposit = scanner.nextInt() ;
                        account.deposit(amountToDeposit);
                        account.dateList.add(LocalDateTime.now()) ;
                        account.actions.add("Deposit") ;
                        account.amountInvolved.add(amountToDeposit) ;
                        System.out.println("Your amount has been deposited....");
                        System.out.println("Your current Balance is..." + account.getUserBalance());
                    }
                    else if(option == 3 ){
                        System.out.println("Your current Balance is " + account.getUserBalance());
                    }
                    else if(option == 4){
                        System.out.println("Your Mini Statement is....");
                        int statementMembersLength ;
                        if(account.dateList.isEmpty()){
                            System.out.println("You haven't done any transactions in the recent times....");
                            continue;
                        }
                        else if(account.dateList.size() < 6){
                            statementMembersLength = account.dateList.size() ;
                        }else{
                            statementMembersLength = 6 ;
                        }
                        for(int i = statementMembersLength-1 ; i >=0 ; i--){
                            System.out.println(account.dateList.get(i) + " " + account.actions.get(i) + " " + account.amountInvolved.get(i));
                        }

                    }
                    else if(option == 5){
                        System.out.println("Enter new Pin : ");
                        int newPin = scanner.nextInt() ;
                        scanner.nextLine() ;
                        account.setUserPin(newPin);
                        System.out.println("NEW PIN CHANGED!!!!");
                    }
            }
            System.out.println("Do you want to continue with other services.....(press y/Y for Yes and press something else for No: )");
            char option2 = scanner.next().charAt(0) ;
            scanner.nextLine() ;
            Conti = option2 == 'y' || option2 == 'Y';
        }while (Conti) ;
    }
}
