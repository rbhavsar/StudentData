package src.com.bankaccontapp;

public class Checking extends Account {

    //List Properties specific to Checking Account
    private int debitCardNumber;
    private int debitCardPIN;


    //Constructor to initialize checking acconut properties
    public Checking(String name,String ssn,double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber = "2"+accountNumber;
        //System.out.println("Account Number :"+accountNumber);
        /*System.out.println("=============================");
        System.out.println("This is New Checking Account .");
        System.out.println("=============================");*/
        setDebitCard();

    }

    @Override
    public void setRate()
    {
        //System.out.println("Implement set Rate for Checking ");
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {

        debitCardNumber=(int)(Math.random()*Math.pow(10,12));
                debitCardPIN = (int)(Math.random()*Math.pow(10,4));

    }

    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE : Checking ");
        super.showInfo();
        System.out.println("Debit Card Number :" + debitCardNumber+
                "\nPIN Number :"+debitCardPIN);

    }

    //Methods

}
