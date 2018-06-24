package src.com.CodingBat;





/**
 * @author Ravi Bhavsar
 */
public class String22 {

  public static void main(String[] args) {
    //doubleChar("hello");
    countBirst("Hello BirST BIRST");
    //countCode("aaacoo");
    //xyzThere(".xyz");
    //bobThere("abccbbob");
    //xyBalance("yaaxbby");
    //xyBalance_V2("yxyxyxyxy");
    //mixString_V2("abcd","xyztyu");
    //repeatEnd("abc",3);
    //repeatFront_V2("xyz",3);
    //repeatSeprator("AAA","",0);
    //xyzMiddle_V2("AxyzBBB");

    

  }

  private static void xyzMiddle_V2(String str) {
   boolean flag=   str.substring(str.length()/2-2,str.length()/2+1).equals("xyz") || str.substring(str.length()/2-1,str.length()/2+2).equals("xyz") ||
       str.substring(str.length()/2,str.length()/2+3).equals("xyz");
    System.out.println("flag :"+flag);

  }

  private static void repeatSeprator(String str, String sep, int count) {
    StringBuilder sb=new StringBuilder();

    if(count==0)
    {
      System.out.println(str);
    }
    else {
      while (count != 0) {
        sb.append(str);
        if (count > 1) {
          sb.append(sep);
        }
        count--;
      }
      System.out.println("Final String :" + sb.toString());
    }

  }

  private static void repeatFront_V2(String str, int x) {

    StringBuilder sb = new StringBuilder();
    while(x!=0) {
      str = str.substring(0, x);
      sb.append(str);
      //System.out.println(str);
      x--;
    }

    System.out.println("Final String :"+sb.toString());
  }

  private static void repeatEnd(String str,int x) {
    StringBuilder sb = new StringBuilder();
    str = str.substring(str.length()-x);
    System.out.println("String :"+str);
    while(x!=0)
    {
      sb.append(str);
      x--;
    }
    System.out.println("Final String  :"+sb.toString());
  }

  private static void mixString_V2(String a, String b) {

    StringBuilder sb = new StringBuilder();
    for(int i=0;i<Math.min(a.length(),b.length());i++)
    {
      sb.append(a.charAt(i));
      sb.append(b.charAt(i));
    }

    if(a.length()>b.length())
    {
      sb.append(a.substring(a.length()-b.length()));
    }

    if(b.length()>a.length())
    {
      sb.append(b.substring(b.length()-a.length()));
    }

    System.out.println("Final String :"+sb.toString());


  }

  private static void xyBalance_V2(String str) {
    boolean xyBalance=false;

    int xMaxPosition=0;
    int yMaxPosition=0;
    char[] chars = str.toCharArray();
    for(int i=0;i<chars.length;i++)
    {
      if(chars[i]=='x')
      {
        xMaxPosition=i;
      }
      if(chars[i]=='y')
      {
        yMaxPosition=i;
      }
    }

    if(yMaxPosition>xMaxPosition)
    {
      xyBalance=true;
      System.out.println("xyBalance :"+xyBalance);
    }
    else {
      System.out.println("xyBalance :" + xyBalance);
    }
  }

  private static void xyBalance(String str) {

    int pos=0;
    int count=0;
    int maxPosition=0;
    boolean xy=false;
    while(true)
    {
      pos = str.indexOf("x",pos);
      if(pos==-1)
      {
        break;
      }
      else
      {
        count++;
        System.out.println("count :"+count+ ",pos :"+pos);
        maxPosition=pos;
        pos++;
      }
    }

    System.out.println("maxPosition :"+maxPosition);

    while(true) {
      pos = str.indexOf("y", maxPosition);
      System.out.println("pos :"+pos);
      if(pos==-1)
      {
        break;
      }
      if (pos > maxPosition)
      {
        xy = true;
        break;
      }
    }

    System.out.println("xy Balance :"+xy);



  }

  private static void bobThere(String str) {
    int pos=0;
    boolean test=false;

    while(true)
    {
      pos = str.indexOf("b",pos);
      if(pos==-1)
      {
        break;
      }
      else
      {
        if(pos+2==str.indexOf("b",pos+2)) {
          test = true;
          break;
        }
        pos++;
      }
    }
    System.out.println("found :"+test);
  }

  private static void xyzThere(String str) {

    int pos =0;
    int count=0;
    while(true)
    {
      pos = str.indexOf("xyz",pos);
      if(pos==-1)
      {
        break;
      }
      else
      {
        if(!(pos-1 == str.indexOf(".",pos-1))) {
          count++;
        }
        pos++;
      }
    }
    System.out.println("xyz count :"+count);

  }



  private static void countCode(String str) {
    int pos = 0;
    int count = 0;
    while(true)
    {
      pos = str.indexOf("co",pos);
      if(pos==-1) {
        break;
      }
      else
      {

        if(pos+3 < str.length() && pos+3 == str.indexOf("e",pos+3)) {
          count++;
        }
        pos++;
      }
    }
    System.out.println("Number of times co : "+count);
  }

  private static void countBirst(String str) {


    int pos=0;
    int count=0;
    while(true)
    {
      pos = str.toLowerCase().indexOf("birst", pos);
      if(pos == -1)
      {
        break;
      }
      else
      {
        pos++;
        count++;
      }
    }
    System.out.println("Birst Number of times :"+count);
  }

  private static void doubleChar(String str) {

    StringBuilder sb = new StringBuilder();
    for (char c:str.toCharArray())
    {
      sb.append(c);
      sb.append(c);
    }

    System.out.println(sb.toString());
  }

}
