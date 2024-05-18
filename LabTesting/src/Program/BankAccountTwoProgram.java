package Program;

import java.util.Random;
import java.util.Scanner;

import entities.BankAccountTwo;

public class BankAccountTwoProgram {
	

	public static void main(String[] args) {
	
		Random random = new Random();
		
		boolean wantsToContinue;
		
		int randomN = random.nextInt(1000, 9999);
		
		Scanner scanner = new Scanner (System.in);
		
		BankAccountTwo account;
		
		
			
			System.out.print("Your account Number is: ");
			System.out.print(randomN + "\n");
			System.out.print("Enter your account name: ");
			String holder = scanner.nextLine();
			
			System.out.print("Is there an initial deposit? y/n ");
			char response = scanner.next().charAt(0);
			
			if (response == 'y') {
				System.out.print("Enter initial deposit value: " );
				double initialDeposit = scanner.nextDouble();
				account = new BankAccountTwo(initialDeposit, holder, randomN);
			}
			else {
				account = new BankAccountTwo(holder, randomN);
			}
			
			System.out.println("\n" + "Information data: " + "\n");
			
			System.out.println(account.show());
			
			do {
			System.out.print("Enter with value of deposit: ");
			double deposit = scanner.nextDouble();
			account.deposit(deposit);
			
			System.out.println("\n" + "Updated Data: " + "\n");
			
			System.out.println(account.show());
			
			System.out.print("Enter with value of withdraw: ");
			double withdraw = scanner.nextDouble();
			account.withdraw(withdraw);
			
			System.out.println("\n" + "Updated Data: " + "\n");
			
			System.out.println(account.show());
			
			System.out.println("Do yout want continuous? y/n");
			char repeat = scanner.next().charAt(0);
			
			if (repeat == 'y') {
		        wantsToContinue = true;
		    } 
			else {
		    	wantsToContinue = false;
		    	System.out.println(account.show());
		    }
		} while (wantsToContinue);
		
		scanner.close();

	}

}
