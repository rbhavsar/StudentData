package src.com.CodingBat;

public class TestCode {

    public static void main(String[] args) {
        //pagination("1-100 of 443");

        method(5);
    }

    private static void method(int maxStaleExceptionRetries) {
        int tries=0;
        boolean elementFound;
        while (tries < maxStaleExceptionRetries) {
            tries++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            elementFound = false;
        }
            System.out.println("error");;
    }

    private static void pagination(String page) {

        String firstPageRecords = page.substring(page.indexOf("-")+1,page.indexOf("of")-1);
        System.out.println(firstPageRecords);
        String totalRecords = page.substring(page.indexOf("of")+3,page.length());
        System.out.println(totalRecords);

        int numberofTimeClickNext = Integer.parseInt(totalRecords)/Integer.parseInt(firstPageRecords);
        System.out.println(numberofTimeClickNext);

        while(numberofTimeClickNext!=0)
        {
            //click
            System.out.println("Click"+numberofTimeClickNext);
            numberofTimeClickNext--;
        }

    }

}
