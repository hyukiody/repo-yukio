package application;

import entities.Account;
import java.util.Scanner;
import model.exceptions.DomainException;

public class ExceptionExerciseAccountObjectCursoNelio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {System.out.println("Enter account data below: ");
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.println("Holder: ");
        String holder = sc.nextLine();
        System.out.println("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.println("withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println("Enter the amount for withdraw: ");
        Double amount = sc.nextDouble();

        account.withdraw(amount);

        System.out.println("Now enter the amount for deposit");
        amount = sc.nextDouble();
        account.deposit(amount);
        }
        catch(DomainException e){
            System.out.println("Entry error: " + e.getMessage());
        }
    }
}
