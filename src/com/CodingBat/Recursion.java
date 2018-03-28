package com.CodingBat;

import java.util.Arrays;

/**
 * @author Ravi Bhavsar
 */
public class Recursion {

  public static void main(String[] args) {
    //System.out.println(printNumber(4));
    //System.out.println(factorial(4));
    //System.out.println(pow(3,3));
    int[] nums={1,2,2,4,5};
    //System.out.println(sumArray(nums));
    //System.out.println(bunnyEars(3));
    //System.out.println(changeXY("codex"));
    //System.out.println(countPairs("axaxa"));
    countPairs_v1("axaxa");
    //System.out.println(noX("xaxb"));
    //System.out.println(stringClean("yyzzza"));
    //System.out.println(count8(8));
    //System.out.println(changePi("xpix"));
    nestParen("(())");


  }

  private static boolean nestParen(String str) {

    if(str.length()==0)
    {
      return false;
    }
    return true;
  }

  private static String changePi(String str) {

    if(str.length()==0)
    {
      return "";
    }else
    {
      if(str.length() > 1) {
          String curr = str.substring(0, 2);
          if (curr.equalsIgnoreCase("pi")){
              return "3.14" + changePi(str.substring(2, str.length()));
          }
      }
      String curr = str.substring(0,1);
      return curr + changePi(str.substring(1, str.length()));
    }
  }

  //8888

  //8182788

  private static int count8Def(int n, int prev) {

    if(n==0)
    {
      return 0;
    }
    else{
      int currNum = n%10;
      if(currNum == 8 && prev == 8) {
        return 2 + count8Def(n/10, currNum);
      } else if(currNum == 8){
        return 1 + count8Def(n/10, currNum);
      } else {
        return count8Def(n/10, currNum);
      }
    }
  }

  private static int count8(int n) {
    return count8Def(n, 0);
  }
  private static String stringClean(String str) {
    if(str.length()==0)
    {
      return "";
    }
    if(str.length()==1)
    {
      return str;
    }
    else
    {
      char curr = str.charAt(0);
      String rest = str.substring(1,str.length());
      char next = rest.charAt(0);
      if(curr==next)
      {
        return stringClean(rest);
      }
      return String.valueOf(curr)+stringClean(rest);
    }
  }

  private static String noX(String str) {
    if(str.length()==0)
    {
      return "";
    }
    else
    {
      char curr = str.charAt(0);
      String rest = str.substring(1,str.length());
      if(curr=='x')
      {
        return noX(rest);
      }
    return curr+noX(rest);
    }
  }

  private static void countPairs_v1(String axaxa) {
  }

  public static int countPairsDef(String str, int start_pos){
    char prev = '\t';
    char next = '\n';

    if(str.length()<=start_pos)
    {
      return 0;
    }
    else{
      if (start_pos-1  < 0) {

      } else {
        prev = str.charAt(start_pos-1);
      }

      if (start_pos +1 >= str.length()) {

      } else {
        next = str.charAt(start_pos+1);
      }
      if (prev==next)
        return 1 + countPairsDef(str,start_pos+1);
      else
        return countPairsDef(str,start_pos+1);
    }
  }

  public static int countPairs(String str) {
    return countPairsDef(str, 0);
  }






  private static String changeXY(String str) {

    if(str.length()==0)
    {
      return "";
    }
    else{
      char ch = str.charAt(0);
      String rest = str.substring(1,str.length());
      if(ch=='x')
      {
        ch='y';
      }
      return String.valueOf(ch)+changeXY(rest);
    }

  }

  private static int bunnyEars(int n) {
      if(n==0)
      {
        return 0;
      }
      else
      {
        int cur = 2;
        return cur +bunnyEars(n-1);
      }
  }
 /* b(1) = 2+b(0);
  b(2) = 2+b(1);
  b(3) = 2+b(2);*/

  private static void con(int[] nums) {


  }

  private static int sumArray(int[] nums) {
    if (nums.length == 0){
      return 0;
    }
    int curr_num = nums[0];
    int[] rest = Arrays.copyOfRange(nums, 1, nums.length);
    return curr_num+sumArray(rest);

  }

  private static int pow(int k, int n) {
    if(n==0)
    {
      return 1;
    }
    else
    {
      return k*pow(k,(n-1));
    }
  }

  private static int factorial(int n) {
    if(n==1)
    {
      return 1;
    }
    else
    {
      System.out.println(n);
      return n*factorial(n-1);
    }
  }



 /*

  n=500
  f[500]


  f[0]=1
  f[1]=f[0]*1

  f(1) = 1;
  f(2) = 2*f(1);
  f(3) = 3*f(2);
  f(4) = 4*f(3);

  f(4) = 4*f(3);
       = 4*3*f(2);
       =4*3*2*f(1);
       =4*3*2*1;*/




  private static int printNumber(int n) {
    if(n==0)
    {
      return 0;
    }
    else{
     // System.out.println(n); //t=4  ,
      return n+printNumber(n - 1);
    }

  }

}
