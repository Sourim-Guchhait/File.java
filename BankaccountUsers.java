//Encapsulation example.................
//Bank account balance sheet example ........

class Bankaccount {
    private long accountNumber;
    private String accountHolderName;
    private double accountbalance;

    public long getAccountNumber(){  //getter pin
        return accountNumber;
    }
    public void setaccountNumber(long accNumber){
        this.accountNumber = accNumber;  //setter pin
    }
    public String getAccountHolderName(){  //getter pin
        return accountHolderName;
    }
    public void setAccountHolderName(String name){
        accountHolderName = name;  //setter pin
    }
    public double getBalance(){
        return accountbalance;
    }
    public void setBalance(double balance){
        this.accountbalance = balance;
    }
    public void deposit(double amount)
    {
        if(amount<=0){
            System.out.println("invalid amount");
        }
        else
        {
            accountbalance = accountbalance + amount;
            System.out.println(amount + " deposit successfully");
        }
    }

    public void withdraw(double amount)
    {
        if(amount<=0){
            System.out.println("invalid amount");
        }
        else if(amount > accountbalance){
            System.out.println("insufficient balance");
        }
        else {
            accountbalance = accountbalance - amount;
            System.out.println(amount + " withdraw successfully");
        }
    }
}

class BankaccountUsers{


    public static void main(String[] args) {

        Bankaccount a = new Bankaccount();
        a.setBalance(26363);
        a.setaccountNumber(73839399393l);
        a.setAccountHolderName("Sourim");

        System.out.println("The account holder name : " + a.getAccountHolderName());
        System.out.println("account balance : " + a.getBalance());
        System.out.println("account number : " + a.getAccountNumber());

        a.deposit(983838d);
        System.out.println("updated balance : "  + a.getBalance());
        System.out.println("--------------");

        a.withdraw(6000d);
        System.out.println("updated balance : "  + a.getBalance());
        System.out.println("--------------");
    }
}
