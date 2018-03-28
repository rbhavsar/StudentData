package com.CodingBat;

import java.util.Stack;

/**
 * @author Ravi Bhavsar
 */
public class CondingProblems {

  public static void main(String[] args) {
    //triangle();
    diamond();
    //System.out.println(check("{[()]}"));
    System.out.println(check_v1("{[()]}"));
  }

  private static boolean check_v1(String str) {
    boolean flag=false;
    for(int i=0,j=str.length()-1;i<str.length();i++,j--)
    {
      System.out.println(str.charAt(i));
      System.out.println(str.charAt(j));
      if(String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j))))
      {
        flag=true;
      }
      else
      {
        flag=false;
        break;
      }
    }

    return flag;

  }


  public static boolean check(String str)
  {
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i <   str.length(); i++)
    {

      char ch = str.charAt(i);
      if (ch == '(' || ch == '[' || ch == '{')
        stack.push(i);
      else if (ch == ')'|| ch == ']' || ch == '}')
      {
        //nothing to match with
        if(stack.isEmpty())
        {
          return false;
        }
        else if(stack.pop() != ch)
        {
          return false;
        }

      }
    }
    if (stack.isEmpty())
    {
      return true;
    }
    else
    {
      return false;
    }
  }




  private static void diamond() {

    for(int i=3;i>=1;i--)
    {
      for(int j=i;j>=1;j--)
      {
        System.out.print("*");
      }

      System.out.println();
    }


  }

  private static void triangle() {

    /*for(int i=1;i<=6;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("$");
      }
      System.out.println();
    }*/

    System.out.println("*******************");


    for(int i=6;i>=1;i--)
    {
      for(int j=i;j>=1;j--)
      {
        System.out.print(" ");
      }
      System.out.print("#");
      for(int k=6;k>=i;k--)
      {
        System.out.print("$");
      }
      for(int k=6;k>=i;k--)
      {
        System.out.print("$");
      }
      System.out.print("#");
      System.out.println();
    }

    for(int k=1;k<=16;k++)
    {
      System.out.print("#");
    }


  }

}
