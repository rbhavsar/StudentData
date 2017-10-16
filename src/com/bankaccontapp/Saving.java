package com.bankaccontapp;

public class Saving extends Account{

    //List Properties specific to saving account
    private int safetyDepositeBoxID;
    private int safetyDepositeBoxKey;


    //Constructor to initialize Saving acconut properties
    public Saving(String name,String ssn,double initDeposit)
    {
        super(name,ssn,initDeposit);
        accountNumber = "1"+accountNumber;
        //System.out.println("Account Number :"+accountNumber);
        /*System.out.println("=============================");
        System.out.println("This is New Saving Account .");
        System.out.println("=============================");*/
        setSafetyDepositBox();
    }

    @Override
    public void setRate()
    {
        //System.out.println("Implement setRate for Saving ");
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositeBoxID =(int) (Math.random()*Math.pow(10,3));
        //System.out.println("safetyDepositeBoxID :"+safetyDepositeBoxID);
        safetyDepositeBoxKey = (int)(Math.random()*Math.pow(10,4));
        //System.out.println("getSafetyDepositeBoxKey :"+getSafetyDepositeBoxKey);
    }


    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE : Saving ");
        super.showInfo();
        System.out.println(
                "Your Saving Account Features :"+"\nSafetyDeposite BoxID "+safetyDepositeBoxID+
                        "\nSafetyDeposite BoxKey "+safetyDepositeBoxKey);


    }
    //Specific methods for saving
}
