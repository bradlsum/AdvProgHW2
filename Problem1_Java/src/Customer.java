public class Customer {
    private int accountNumber;
    private int balance;
    private int chargesApplied;
    private int creditsApplied;
    private int creditLimit;
    private static int numberInc = 1;

    Customer(){
        this.accountNumber = numberInc;
        this.balance = 0;
        this.chargesApplied = 0;
        this.creditsApplied = 0;
        this.creditLimit = 0;

        incNumber();
    }
    Customer(int balance, int chargesApplied, int creditsApplied, int creditLimit){
        this.accountNumber = numberInc;
        this.balance = balance;
        this.chargesApplied = chargesApplied;
        this.creditsApplied = creditsApplied;
        this.creditLimit = creditLimit;

        incNumber();
    }
    int getAccountNumber(){
        return this.accountNumber;
    }
    int getBalance(){
        return this.balance;
    }
    int getChargesApplied(){
        return this.chargesApplied;
    }
    int getCreditsApplied(){
        return this.creditsApplied;
    }
    int getCreditLimit(){
        return this.creditLimit;
    }

    void setAccountNumber(int number){
        this.accountNumber = number;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
    void setChargesApplied(int charge){
        this.chargesApplied = charge;
    }
    void setCreditsApplied(int credit){
        this.creditsApplied = credit;
    }
    void setCreditLimit(int limit){
        this.creditLimit = limit;
    }

    void incNumber(){
        this.numberInc = numberInc + 1;
    }

    void printNewBalance(){
        System.out.print("\n" + this.getAccountNumber() + "\n" + "Beginning balance: $" + this.getBalance() + "\n" +
                "Credit Limit: $" + this.creditLimit + "\n" +
                "Charges: $" + this.getChargesApplied() + "\n" + "Credits: $" + this.getCreditsApplied() + "\n" +
                "$" + this.getBalance() + " + $" + this.getChargesApplied() + " - $" + this.getCreditsApplied() + " = $");
        // Set new balance
        this.setBalance(this.getBalance() + this.getChargesApplied()  - this.getCreditsApplied());
        System.out.print(this.getBalance() + "\n");

        //Check if customer is overdrawn
        if (this.getCreditLimit() < this.balance) System.out.println("Customer's account is over drawn!\n");
        else System.out.println("Customer's account is in good standing.\n");
    }
}
