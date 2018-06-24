package src.com.CodingBat;

import java.util.ArrayList;
import java.util.List;

public class String2 {

    public static void main(String[] args) {

        String script = "[CategoryID]=[Categories.CategoryID]\n" +
                "[CategoryName]=[Categories.CategoryName]\n" +
                "[Description]=[Categories.Description]";



        //System.out.println(xyBalance("xaxxbbyx")) ;
        //System.out.println(mixString("abc", "xyzpq"));

        //doubleChar("The");
        //System.out.println("flag :"+endOther("Hiabcx", "bc"));


        //System.out.println(repeatFront("Chocolate", 4));
        //repeatEnd("Hello",3);
        System.out.println(getBetweenPizza("xyz"));

        //System.out.println(repeatSeparator("Word", "X", 3));


        //System.out.println(xyzMiddle("AAAAAxyzBBB"));

       // System.out.println(getSandwich("breadAbread"));

        //System.out.println(sameStarChar("12*2*3*"));

        //System.out.println(oneTwo("abc"));

        //System.out.println(zipZap("zipXzap"));
        //System.out.println(starOut("ab**cd"));
        //plusOut("12xy34", "xy");

       /* int position = script.indexOf("=", 0);
        System.out.println("position :-"+position);
        String source1 = script.substring(position+2, script.indexOf(".", position));
        System.out.println("Source :-"+source1);

        position = script.indexOf("=",position);
        String source2 = script.substring(position+2, script.indexOf(".", position));
        System.out.println("Source :-"+source2);

        position = script.indexOf("=",position);
        String source3 = script.substring(position+2, script.indexOf(".", position));
        System.out.println("Source :-"+source3);*/

        List<String> sources = new ArrayList<String>();
        int position = 0;
        while (position >= 0) {
            position = script.indexOf("=", position);
            //System.out.println("position :-"+position);
            if (position == -1) break;
            int dotIndex = script.indexOf(".", position);
            String source = script.substring(position + 2, dotIndex);
            //System.out.println("Source :-"+source);
            sources.add(source);
            position = dotIndex;
        }
        //System.out.println("Sources "+sources);
    }

    private static String getBetweenPizza(String str) {

        int pos=0;
        int count=0;
        int first=0;
        int last=0;
        while(pos>=0)
        {
            pos=str.indexOf("pizza",pos);
            if(pos<=-1) break;
            count++;
            if(count==1)
            {
                first = pos;
            }
            if(count>=2)
            {
                last = pos;
            }
            pos++;
        }

        if(count>=2)
        {
           return str.substring(first+5,last);
        }
        else
        {
            return "";
        }
    }

    private static String repeatEnd(String str, int n) {

        String rep = str.substring(str.length()-n,str.length());
        StringBuilder sb=new StringBuilder();
        while(n>=1)
        {
            sb.append(rep);
            n--;
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    private static boolean endOther(String a, String b) {

        a = a.toLowerCase();
        int lenA=a.length()-1;
        b = b.toLowerCase();
        int lenB=b.length()-1;
        boolean flagB=true;
        boolean flagA=true;
        boolean flag=false;

        if(a.contains(b))
        {
            System.out.println("b is in a "+flagB);
            return flagB;
        }
        if(b.contains(a))
        {
            System.out.println("a is in b"+flagA);

            return  flagA;
        }
        return flag;

    }

    private static void doubleChar(String str) {

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }

    public static String plusOut(String str,String word)
    {
        char[] strchar = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int word_len = word.length();
        for(int i=0; i < str.length(); i++){
            //char a = strchar[i];
            if((i+word_len <= str.length()) && str.substring(i, i+word_len).equals(word)){
                sb.append(word);
                i=i+word_len-1;
            } else {
                sb.append('+');
            }
        }
        return sb.toString();
    }

    public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        char[] strarray = str.toCharArray();
        //boolean right_add=false;
        //boolean left_add = false;
        for(int i = 0; i < str.length(); i++){
            if(strarray[i] != '*'){
                boolean right_add=true;
                boolean left_add=true;
                if(i+1 < str.length() && strarray[i+1] == '*') {
                    right_add = false;
                }
                if(i-1 >= 0 && strarray[i-1] == '*'){
                    left_add = false;
                }
                if(right_add && left_add){
                    sb.append(strarray[i]);

                }
            }
        }
        return sb.toString();
    }

    public static String zipZap(String str)
    {
        for (int i = 0; i < str.length()-2; i++)
            if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p')
                str = str.substring(0,i+1) + str.substring(i+2);
        return str;
    }

    public static String oneTwo(String str)
    {
        String str2 = "";
        for(int i=0; i<str.length()-2; i+=3) {
            str2 = str2+str.substring(i+1,i+3)+str.charAt(i);
        }
        return str2;
        

       /* int index =2;

        for(int i=0;i<str.length();i++)
        {
            if(i%3==0)
            {
               newString.add(index,"a");
            }
            else
            {
                newString.add(str.substring(i,i+1));
            }
        }*/




    }

    public static boolean sameStarChar(String str)
    {
        int pos=0;
        String first="";
        String last="";
        int count=0;
        List<String> decision=new ArrayList<String>();



        if(str.length()==0)
        {
            return true;
        }

        while(pos>=0)
        {
            pos = str.indexOf("*",pos);
            if(pos==-1)break;
            pos++;
            count++;
        }

        pos=0;

        if(count>=1) {

            while(pos>=0)
            {
                pos = str.indexOf("*",pos);
                {
                    if(pos>0 && pos<str.length()-1)
                    {
                        first = str.substring(pos - 1, pos);
                        last = str.substring(pos + 1, pos + 2);
                        if (first.equalsIgnoreCase(last)) {
                           decision.add("true");
                        }
                        else
                        {
                            decision.add("false");
                        }
                    }
                }
                if(pos==-1)break;
                pos++;
            }
        }

        if(decision.contains("false"))
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    public static String getSandwich(String str)
    {

        int pos=0;
        int count=0;
        int lastPosition=0;
        int firstPosition=0;
        while(pos>=0)
        {
            pos = str.indexOf("bread",pos);
            if(count==0)
            {
                firstPosition = pos;
                //System.out.println("firstPosition :"+firstPosition);
            }
            if(pos==-1)break;
            lastPosition = pos;
            pos=pos+1;
            count++;
        }
        if(count<2)
        {
            return "";
        }
        //System.out.println("lastPosition :"+lastPosition);

        String expectedString=str.substring(firstPosition+5,lastPosition);
        //System.out.println("expectedString "+expectedString);

        return "";



        /*int position=0;
        if(count>=2)
        {
            position = str.indexOf("bread",position);
            int firstPosition = position+5;
            String afterBread = str.substring(position+5,str.length());
            System.out.println("afterBread "+afterBread);
            position=str.indexOf("bread",firstPosition);
            String beforeBread = str.substring(firstPosition,position);
            System.out.println("beforeBread "+beforeBread);
            return beforeBread;
        }
        else
        {
            return "";
        }*/




    }

    public static boolean xyzMiddle(String str)
    {

        if(str.length()<3)
        {
            return false;
        }

        int pos=0;
        pos = str.indexOf("xyz",0);
        //System.out.println("pos :"+pos);
        String before = str.substring(0,pos);
        //System.out.println("before "+before);
        String after = str.substring(pos+3,str.length());
        //System.out.println("after "+after);

        if(before.length()==after.length() || before.length()+1==after.length() || after.length()+1==before.length())
        {
            return true;
        }

        return false;
    }


    public static String repeatSeparator(String str,String sep,int n)
    {
        StringBuilder sb=new StringBuilder();
        while(n>=1) {
            sb.append(str);
            if(n>=2) {
                sb.append(sep);
            }
            n--;
        }
        return sb.toString();
    }


    public static String repeatFront(String str,int n)
    {
        StringBuilder sb= new StringBuilder();
        while(n>=1) {
            sb.append(str.substring(0, n));
            n=n-1;
        }
        return sb.toString();
    }

    public String mashUpString(String a, String b) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        return sb.toString();
    }


    public static String mixString(String a,String b) {
        StringBuilder sb = new StringBuilder();
        if(a.length()==0 && b.length()!=0)
        {
            return b;
        }
        if(a.length()!=0 && b.length()==0)
        {
            return a;
        }
        /*if(a.length()==0 && b.length()==0)
        {
            return "";
        }*/
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
        sb.append(b.substring(a.length(),b.length()));
        }
        if(a.length()>b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
            sb.append(a.substring(b.length(), a.length()));
        }

        if(a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
        }

        return sb.toString();
    }




    public static boolean xyBalance(String str){

        boolean x=false;
        boolean y=false;
        int posy=0;
        int posyy=0;
        int posx=0;
        int posxx=0;
        while(posy>=0) {
            posyy=posy;
            posxx=posx;
            posy = str.indexOf('y',posy);
            posx = str.indexOf('x',posx);
            if(posy==-1)break;
            posy++;
            posx++;
        }

        if(posyy<posxx)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='x')
            {
                x=true;
            }
            if(str.charAt(i)=='y')
            {
                y=true;
            }
        }
        if(x && y)
        {
            return true;
        }
        return false;
    }
}

