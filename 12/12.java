class Account{
    int accountNumber;
    String holderName;
    double balance;
    Account()
    {
        accountNumber = 1001;
        holderName = "";
        balance = 0;
    }
    Account(String holderName, int accoundNumber, double balance)
    {
        this.holderName = holderName;
        this.accountNumber = accoundNumber;
        this.balance = balance;
    }
    void print(){

    }
    double calculateYearlyInterest()
    {
        return 0;
    }
}
class SavingsAccount extends  Account{
    double interestRate;
    SavingsAccount(String accountHolder, int accNum, double bal, double interestRate)
    {
        super(accountHolder,accNum,bal);
        this.interestRate = interestRate;
    }
    double calculateYearlyInterest()
    {
        return (balance*interestRate);
    }
    void print()
    {
        System.out.println("Account Holder : "+ holderName);
        System.out.println("Account No. : "+ accountNumber);
        System.out.println("Balance left : " + balance);
    }

}
class CurrentAccount extends Account{
    CurrentAccount(String accountHolder, int accNum, double balance)
    {
        super(accountHolder,accNum,balance);
    }
    void print()
    {
        System.out.println("Account Holder : " + holderName);
        System.out.println("Account No. : "+ accountNumber);
        System.out.println("Balance left : " + balance);
    }
}
class Manager {
    static Account arr[] = new Account[5];

    Manager()
    {
        arr[0] = new SavingsAccount("Arindam",1001,10000,0.05);
        arr[1] = new SavingsAccount("Rajdeep",1002,20000,0.06);
        arr[2] = new CurrentAccount("Sanghita", 1003,30000);
        arr[3] = new CurrentAccount("Isika", 1004,40000);
        arr[4] = new CurrentAccount("Soumabha", 1005,50000);

    }
    public static void main(String[] args) {
        Manager ob = new Manager();
        for(int i = 0; i<2;i++)
            System.out.println("The yearly interest of the savings account no "+ (i+1) + " is "+ arr[i].calculateYearlyInterest());

        System.out.println("");

        for(int i = 0; i<arr.length; i++){
            arr[i].print();
            System.out.println("");
        }
    }
}
