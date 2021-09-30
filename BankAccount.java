public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.numberOfAccounts++;
    }
    //getters
    public double getChecking(){
        return this.checkingBalance;
    }
    public double getSaving(){
        return this.savingBalance;
    }
    public double getTotal(){
        return this.savingBalance + this.checkingBalance;
    }
    //setters
    public void depositChecking(double amt){
        this.checkingBalance+= amt;
        this.totalMoney+= amt;
    }
    public void depositSaving(double amt){
        this.savingBalance+= amt;
        this.totalMoney+= amt;
    }
    public void withdrawChecking(double amt){
        if(this.checkingBalance - amt >= 0){
            this.checkingBalance-= amt;
            this.totalMoney-= amt;
        }
    }
    public void withdrawSaving(double amt){
        if(this.savingBalance - amt >= 0){
            this.savingBalance-= amt;
            this.totalMoney-= amt;
        }
    }



    //static
    public static int accountCount() {
        return numberOfAccounts;
    }
    public static double moneyTotal() {
        return totalMoney;
    }
}