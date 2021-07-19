
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		double amount = 0; 
		int option = 0; 
		Account ac1 = new Account("gonzalo","23456789", 1000); 
		do {
			System.out.println("Welcome to Banking Application: " + ac1.getUsername());
			System.out.println("==============================");
			System.out.println("1.-Check balance");
			System.out.println("2.-Deposite");
			System.out.println("3.-withdraw");
			System.out.println("4.-Check previous transaction");
			System.out.println("5.-Exit");
			System.out.println("==============================");
			System.out.println("Enter a number to do a operation:");
			option = s.nextInt(); 
			
			switch(option) {
			case 1: 
				System.out.println("Your balance is: " + ac1.checkBalance());
				break; 
			case 2: 
				System.out.println("Enter the amount of money for deposite");
				amount = s.nextDouble(); 
				ac1.deposite(amount);
				break; 
			case 3: 
				System.out.println("Enter the amount of money for withdraw");
				amount = s.nextDouble(); 
				ac1.withdraw(amount);
				break; 
				
			case 4: 
				System.out.println(ac1.checkprevious());
				break; 
				
			case 5: 
				System.out.println("Good bye");
				break; 
				
			default: 
				System.out.println("That option doesn't exist");
			}
		}while(option !=5); 
		s.close();
		
		
	}
	

}
