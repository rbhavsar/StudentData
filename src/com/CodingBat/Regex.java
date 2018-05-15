package com.CodingBat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author rbhavsar
 * Created on 5/1/18.
 */
public class Regex {

  private static final String REGEX = ".*SPACE_ID.*";
  private static final String INPUT = "FROM_SPACE_ID";
  private static Pattern pattern;
  private static Matcher matcher;

  public static void main( String args[] ) {
    pattern = Pattern.compile(REGEX);
    matcher = pattern.matcher(INPUT);

    System.out.println("Current REGEX is: "+REGEX);
    System.out.println("Current INPUT is: "+INPUT);

    //System.out.println("lookingAt(): "+matcher.lookingAt());
    //System.out.println("matches(): "+matcher.matches());

    System.out.println("matches(): "+matcher.matches());

    System.out.println("Error");

    System.out.println("Revert Testing");
  }


}
