package src.com.bankaccontapp;

/**
 * @author rbhavsar
 * Created on 3/4/20.
 */
public class GlobalVar {

  public static boolean clickElement;

  public GlobalVar(boolean clickElement){
    this.clickElement=clickElement;
  }

  public GlobalVar(){
    clickElement=false;
  }

  public static void print(){
    if(clickElement){
      System.out.println("Working fine...");
    }
  }
}
