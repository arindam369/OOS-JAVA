class BankAccount{
    int accountNumber;
    float balance;
    String ownerName;
    BankAccount(int accNum,float bal,String name){
        accountNumber = accNum;
        balance = bal;
        ownerName = name;
    }
    void add(float amount){
        balance+=amount;
    }
    void subtract(float amount){
        balance-=amount;
    }
    void details(){
        System.out.print("Account No. : "+accountNumber);
        System.out.print("\t\t Account Holder : "+ownerName);
        System.out.println("\t\t Balance left : "+balance);
    }
}
class AccountManager{
    int nextIndex;
    int capacity;
    BankAccount bankAccounts[];
    AccountManager(int accountLimit){
        nextIndex=0;
        capacity=accountLimit;
        bankAccounts = new BankAccount[capacity];
    }
    void create(BankAccount newAcc){
        if(nextIndex<capacity){
            bankAccounts[nextIndex] = newAcc;
            nextIndex++;
        }
    }
    void delete(int accNum){
        int i=0;
        while(i<nextIndex){
            if(bankAccounts[i].accountNumber == accNum){
                break;
            }
            i++;
        }
        while(i<nextIndex){
            bankAccounts[i]=bankAccounts[i+1];
            i++;
        }
        bankAccounts[i].accountNumber=0;
        bankAccounts[i].balance=0;
        bankAccounts[i].ownerName="";
        nextIndex--;
    }
    void deposit(int accNum,int depositingMoney){
        for(int i=0;i<nextIndex;i++){
            if(bankAccounts[i].accountNumber == accNum){
                bankAccounts[i].add(depositingMoney);
            }
        }
    }
    void withdraw(int accNum,int withdrawingMoney){
        for(int i=0;i<nextIndex;i++){
            if(bankAccounts[i].accountNumber == accNum){
                bankAccounts[i].subtract(withdrawingMoney);
            }
        }
    }
    void allAccountDetails(){
        for(int i=0;i<nextIndex;i++){
            bankAccounts[i].details();
        }
    }
}
class Bank{
    public static void main(String args[]){
        AccountManager AM = new AccountManager(10); // this Account Manager can store max 10 accounts
        BankAccount acc1 = new BankAccount(12001, 56000, "Arindam Halder");
        BankAccount acc2 = new BankAccount(12002, 60000, "Souvik Naskar");
        BankAccount acc3 = new BankAccount(12003, 64000, "Soumabha Ghosh");
        BankAccount acc4 = new BankAccount(12004, 68000, "Rajdeep Mallick");
        BankAccount acc5 = new BankAccount(12004, 72000, "Dibyabrata Panja");

        AM.create(acc1);
        AM.create(acc2);
        AM.create(acc3);
        AM.create(acc4);
        AM.create(acc5);

        AM.allAccountDetails();
    }
}
