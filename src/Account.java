
public class Account {
	private String username; 
	private String iduser; 
	private double balance; 
	private double previousTransaction;
	
	public Account(String username, String iduser, double balance) {
		super();
		this.username = username;
		this.iduser = iduser;
		this.balance = balance;
	}
	public void deposite(double amount) {
		if(amount !=0) {
			balance += amount; 
			previousTransaction = amount; 
		}
		
	}
	public void withdraw(double amount) {
		if(balance >= amount && amount !=0) {
			balance -= amount;
			previousTransaction = -amount; 
		}else {
			System.out.println("Denied operation");
			previousTransaction = 0; 
		}
		 
	}
	
	public String checkprevious() {
		String r; 
		if(previousTransaction > 0) {
			r = "Deposite: " + previousTransaction; 
		}else {
			r = "Withdraw: " + previousTransaction;  
		}
		return r; 
	}
	public double checkBalance() {
		return balance; 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	} 
	
	
	
	
}
