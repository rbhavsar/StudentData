package src.com.bankaccontapp;

public abstract class Account implements IBaseRate {

    //Can't create object

    //List Common propeties for Saving and checking account
    private String name;
    private String ssn;
    private double balance;

    protected String accountNumber;

    static int index = 10000;
    protected double rate;

    //Constructor to set base Properties and initialize account
    public Account(String name,String ssn,double initDeposit)
    {

        this.name=name;
        this.ssn=ssn;
        balance=initDeposit;
        this.accountNumber=setAccountNumber();
        //System.out.println("BaseRate "+getBaseRate());
        setRate();

        /*System.out.println("Name : "+name);
        System.out.println("SSN :"+ssn);
        System.out.println("Balance :"+balance);*/

        System.out.println("Apple");
        System.out.println("Banana");
        //System.out.print("NEW ACCOUNT , ");
    }

    public abstract void setRate();

    public void compound()
    {
        System.out.println("Balance Available in Compound is "+balance);
        double accuredInterest = balance * (rate/100);
        balance = balance + accuredInterest;
        System.out.println("accuredInterest $"+accuredInterest);
        printBalance();
    }

    //last two digit of ssn +
    private String setAccountNumber()
    {
        String lastTwoOfSsn = ssn.substring(ssn.length()-2,ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*Math.pow(10,3));//3 digit random Number
        index++;
        return lastTwoOfSsn+uniqueID+randomNumber;
    }


    public void showInfo()
    {
        System.out.println(
                "Name :"+name+ "\nssn :"+ssn+"\nAccount Number :"+accountNumber+"\nBalance:"+balance+"\nRate:"+rate+"%");

    }

    //Common methods - Transaction
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Depositing $ "+amount);
        printBalance();
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.println("withdrawing $ "+amount);
        printBalance();
    }

    public void transfer(String toWhere,double amount)
    {
        balance = balance - amount;
        System.out.println("Transfering $"+amount+" to "+toWhere);
        printBalance();
    }

    public  void printBalance()
    {
        System.out.println("Your Balance is Now $"+balance);
    }


}
