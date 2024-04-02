package exceptionhandling.bank;

public class Main {

	    public static void main(String[] args) {
	  
	        BankAccount account = new BankAccount("3243232564", 1000);
	        try {
	            account.withdraw(500); 
	            account.deposit(200);  
	            account.withdraw(800); 
	            account.withdraw(600); 
	        } catch (InSufficientBalanceException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


