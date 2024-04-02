package exceptionhandling.bank;

public class BankAccount {
	
	    private String accNumber;
	    private double bal;
	    public BankAccount(String accNumber, double bal) {
	        this.accNumber = accNumber;
	        this.bal = bal;
	    }
	    public void withdraw(double amt) throws InSufficientBalanceException {
	        if (amt > bal) {
	            throw new InSufficientBalanceException("Insufficient balance. Cannot withdraw.");
	        }
	        bal -= amt;
	        System.out.println("Withdrawal successful. Remaining balance: " + bal);
	    }
	    public void deposit(double amt) {
	        bal += amt;
	        System.out.println("Deposit successful. Current balance: " + bal);
	    }
	    public double getBalance() {
	        return bal;
	    }
	}

	
	
	

