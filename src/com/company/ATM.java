package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<UserAccount> accounts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    UserAccount temp ;


    public ATM(ArrayList<UserAccount> accounts) {
        this.accounts = accounts;
    }
    public  void Start(){
        System.out.println("Welcome to the ATM project......");
        prompt();

    }
    public void prompt(){
        System.out.print("Please enter your Account numbber: ");
        String accountName = scanner.nextLine();
        validate(accountName);

    }
          public void validate(String accNo){
              for (UserAccount array:accounts
                   ) {
                  if (array.getAccountNumber().equals(accNo)){
                      temp = array;
                  }

              }
              if (temp!=null){
                  System.out.println("Welcome " + temp.getAccountName() + " what would you like to do??");
                  promptPassword();
              }
              else {
                  System.out.println("Invalid Account number entered");
                  prompt();
              }
          }
    public void promptPassword(){
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();
        validatePassword(password);

    }
    public void validatePassword(String password){

        if (temp.getPassword().equals(password)){
            System.out.println("How much do you want to withdraw??");
            double amount = scanner.nextDouble();
            System.out.println("$"+amount + " withdrawn successfully....");
            System.out.println("Do you want to make another transaction y/n??");
            String choice = scanner.next();
            switch (choice){
                case "y":
                    promptPassword();
                    break;
                case "n":
                    System.out.println("Byeee!!! Thanks for banking with us :)");
                    break;
                default:
                    System.out.println("Invalid command entered");
            }

        }
        else {
            System.out.println("Invalid password\n Try Again");
            promptPassword();
        }
    }
}
