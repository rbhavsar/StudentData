package src.com.CodingBat;

public class String1 {

    public static void main(String[] args) {

        //Check stash 123
        //Test
<<<<<<< HEAD
        //com.com , com.com
=======
>>>>>>> eebc9fe2c7f593a0d29a40cb8ff25ad36375a546
       String value = everyNth("RaviBhavsar",2);
       //System.out.println("Value :-"+value);

        int max = max1020(10,21);
        //System.out.println("max :"+max);

        boolean check = max3050(40, 50);
        //System.out.println("check :-"+check);

        //String str = printStringNTimes("Hi",3);
        //System.out.println("Str :"+str);

        String str = frontTimes("Chocolate",3);
        //System.out.println("str :"+str);

        //int count = countXX("abcxx");
        //System.out.println("count :"+count);

        boolean test= doubleX("axbxxc");
        //System.out.println("test :-"+test);

        doThis("3[a]2[b]");
    }

    private static void doThis(String str) {
        for(int i = -1; (i = str.indexOf("[", i + 1)) != -1; i++) {
            System.out.println(i);
        } // prints "4", "13", "22"
    }

    public static boolean doubleX(String str)
    {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");
    }

    public static int countXX(String str)
    {
        int counter=0;
       for(int i=0;i<str.length();i++) {
           if(str.charAt(i)=='x')
           {
               System.out.println("Value of i :"+i);
               counter++;
           }
       }
       return counter;
    }

    public static String everyNth(String str,int n)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        int i=2;
        while(i<str.length())
        {
            sb.append(str.charAt(i));
            i=i+2;
        }
        return sb.toString();
    }

    public static int max1020(int a,int b)
    {
        if(a>=10 && b<=20)
        {
            if(a>b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        return 0;
    }

    public static boolean max3050(int a,int b)
    {
        if(a>=30 && b<=40 || a>=40 && b<=50)
        {
            return true;
        }
        return false;
    }

    public static String printStringNTimes(String str,int n)
    {
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n)
        {
            sb.append(str);
            i++;
        }
        return sb.toString();
    }

    public static String frontTimes(String str,int n)
    {
        StringBuilder sb = new StringBuilder();
        int x = 2;
        int i=0;
        str.length();
        while(i<=x) {
           sb.append(str.charAt(i));
           i++;
        }

        StringBuilder mainSB = new StringBuilder();
        i=0;
        while(i<n)
        {
            mainSB.append(sb.toString());
            i++;
        }
        return mainSB.toString();
    }


}
