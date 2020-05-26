package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Account;
import Entities.DomainException;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Account> list = new ArrayList<>();
			
		try {
				System.out.println("Enter account data");
				System.out.print("Number: ");
				int number = sc.nextInt();
				System.out.print("Holder: ");
				String holder = sc.next();
				System.out.print("Initial balance: ");
				Double balance = sc.nextDouble();
				System.out.print("Withdraw limit: ");
				Double withdrawLimit = sc.nextDouble();
				System.out.println();
				
				Account account = new Account(number, holder, balance, withdrawLimit);
			
				System.out.print("Enter amount for withdraw: ");
				Double amount = sc.nextDouble();
				System.out.print("New Balance: " + account.withdraw(amount));
		}
		catch (DomainException e) {
			System.out.println("Withdraw error:" + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		
	}

}
