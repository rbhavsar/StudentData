package src.com.bankaccontapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import com.utilities.CSV;







public class BankAccountApp {

    public static void main(String[] args)
    {

        List<Account> accounts = new LinkedList<Account>();


        //Check code is working
        /*Checking chkAccount = new Checking("Ravi Bhavsar","123456789",1500);
        chkAccount.showInfo();

        Saving svgAccount = new Saving("Ronak Shah","567890123",500);
        svgAccount.showInfo();
        svgAccount.deposit(5000);
        svgAccount.withdraw(100);
        svgAccount.transfer("Nikunj",500);
        svgAccount.compound();*/
        //svgAccount.printBalance();


        //Read file then create new Account on that data
        String file = "/Users/rbhavsar/StudentData/src/com/bankaccontapp/NewAccountDetail.csv";

        try {
            List<String[]> newAccountHolders = CSV.read(file);
            for (String[] newAccountHolder : newAccountHolders) {
                //System.out.println("***** NEW ACCOUNT ******** ");
                for(int i=0;i<newAccountHolder.length;i++)
                {
                    //System.out.println(newAccountHolder[i]);
                }
                String name = newAccountHolder[0];
                String ssn = newAccountHolder[1];
                String accountType = newAccountHolder[2];
                double initDeposit = Double.parseDouble(newAccountHolder[3]);
                //System.out.println("name :"+name
                //+"\nssn :"+ssn+"\naccountType :"+accountType+"\ninitDeposit :$"+initDeposit);
                if(accountType.equals("Savings"))
                {
                    //System.out.println("Open Savings Account ");
                    accounts.add(new Saving(name,ssn,initDeposit));
                }
                else if(accountType.equals("Checking"))
                {
                    //System.out.println("Open Checking Account ");
                    accounts.add(new Checking(name,ssn,initDeposit));
                }
                else
                {
                    System.out.println("Error in Reading Account Type");
                }

            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (Account account : accounts) {
            System.out.println("**************\n");
            account.showInfo();
        }
    }
}
