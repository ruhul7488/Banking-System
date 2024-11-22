public class Bank {
    private double amount;

    public Bank(double TotalAmount) {
        this.amount = TotalAmount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = withdrawalAmount <= amount  ? "Withdrawal successful." : "Insufficient Amount.";
        
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount; 
        }
        
        System.out.println(message);
    }

    public void deposit(double depositAmount) {
        amount += depositAmount; 
        System.out.println("Deposit successful.");
    }

    public void displayBalance() {
        System.out.printf("Total balance: %.2f%n", amount);
    }

 public static void main(String[] args) {
        Bank SBI = new Bank(10000);
        
        SBI.withdraw(3000);   
        SBI.deposit(5000); 
        SBI.displayBalance();
    }
}
