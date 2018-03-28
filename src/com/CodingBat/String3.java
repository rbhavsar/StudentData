package com.CodingBat;


/*Can you write parsing code for the below:
        args can be  {"-e", "-s", inputFile1.getPath()}; as an example.

        filename: the file on which the capitalize operation has to be performed.

        -l: if specified, the capitalize utility will capitalize all the first characters in each new line, including the first line.

        -e: if specified, the capitalize utility will capitalize all the letters in each exclamatory sentence (i.e., in each sentence ending with a “!”).

        -s [<string of delimiters>]: if specified, the
         utility will capitalize the first character of each sentence. Sentences end by default with one of the characters ‘.’, ‘!’, or ‘?’. The optional string of delimiters can be used to specify an alternative set of sentence delimiters that replace the default ones for the effect of -s.

        -x: if specified, the capitalize utility will lowercase all existing capital letters that do not meet the specified capitalization rules, or the default capitalization rules if no other flags are specified.
        If none of the above OPT flags is specified, capitalize capitalizes all whitespace delimited words in the file. Otherwise, the specified flags override the default behavior, as illustrated in the examples below.*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {

    public static void main(String[] args) {

        //capitalize("Ra!&vi! bh*avsar!! \n");
        /*camelCase("Bill is,\n" +
                "in my opinion,\n" +
                "an easier name to spell than William.\n" +
                "Bill is shorter,\n" +
                "and Bill is\n" +
                "first alphabetically.");*/
        /*camelCase("Bill is,\n" +
                "in my opinion,\n" +
                "an easier name to spell than William.\n" +
                "Bill is shorter,\n" +
                "and Bill is\n" +
                "first alphabetically.");*/

        String str = "Bill is,\n" +
                "in my opinion,\n" +
                "an easier name to spell than William.\n" +
                "Bill is shorter,\n" +
                "and Bill is\n" +
                "first alphabetically.";
        convertToCamelCase(str,str.toCharArray());

        String value = "BillIs,\n" +
                "InMyOpinion,\n" +
                "AnEasierNameToSpellThanWilliam.\n" +
                "BillIsShorter,\n" +
                "AndBillIsFirstAlphabetically.";

        //reverseCamelCase(value,value.toCharArray());

       /* Set<Integer> set = new LinkedHashSet<Integer>(
                Arrays.asList(1,2,3,4,5,6));

        ArrayList<List<List<Integer>>> results =
                new ArrayList<List<List<Integer>>>();
        compute(set, new ArrayList<List<Integer>>(), results);
        for (List<List<Integer>> result : results)
        {
            System.out.println(result);
        }*/

       /*reverseCamelCase("BillIsOk\n" +
               "ThisIsGood.");*/

        //System.out.println("abc \r\n test");

        //permutation("abc");

        /*String[] database = {"a","b","c"};
        for(int i=1; i<=database.length; i++){
            String[] result = getAllLists(database, i);
            for(int j=0; j<result.length; j++){
                System.out.println(result[j]);
            }
        }*/

        /*char[] database = {'a', 'b', 'c'};
        char[] buff = new char[database.length];
        int k = database.length;
        for(int i=1;i<=k;i++) {
            permGen(database,0,i,buff);
        }*/



    }


    public static void permGen(char[] s,int i,int k,char[] buff) {
        if (i < k) {
            for (int j = 0; j < s.length; j++) {

                buff[i] = s[j];
                permGen(s, i + 1, k, buff);
            }
        } else {

            System.out.println(String.valueOf(buff));

        }
    }



    public static String[] getAllLists(String[] elements, int lengthOfList) {
        //initialize our returned list with the number of elements calculated above
        int n = (int) Math.pow(elements.length, lengthOfList);
        System.out.println("n :"+n);
        String[] allLists = new String[(int) Math.pow(elements.length, lengthOfList)];

        //lists of length 1 are just the original elements
        if (lengthOfList == 1) return elements;
        else {
            //the recursion--get all lists of length 3, length 2, all the way up to 1
            String[] allSublists = getAllLists(elements, lengthOfList - 1);

            //append the sublists to each element
            int arrayIndex = 0;

            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < allSublists.length; j++) {
                    //add the newly appended combination to the list
                    allLists[arrayIndex] = elements[i] + allSublists[j];
                    arrayIndex++;
                }
            }
            return allLists;
        }
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }



    public static String convertToCamelCase(String content, char[] content_char){
        boolean capitalizeNext=true;
        boolean is_prev_char_special=false;
        StringBuffer sb = new StringBuffer();

        for(int i=0 ; i<content_char.length; i++){
            // If not white space character and capitalizeNext is set, Capitalize.
            if(!Character.isWhitespace(content_char[i]) && capitalizeNext){
                sb.append(Character.toUpperCase(content_char[i]));
                capitalizeNext=false;
                is_prev_char_special=false;
            } else if(Character.isWhitespace(content_char[i])){
                if(is_prev_char_special) {
                    sb.append(content_char[i]);
                }
                capitalizeNext=true;
            } else if(content_char[i] == '!' || content_char[i] == '.' ||
                    content_char[i] == '?' || content_char[i] == ','){
                is_prev_char_special=true;
                sb.append(content_char[i]);
            } else {
                sb.append(Character.toLowerCase(content_char[i]));
                is_prev_char_special=false;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static String reverseCamelCase(String str, char[] content_char)
    {
        boolean isFirstCharater=true;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<content_char.length;i++)
        {
            if(content_char[i]=='\n')
            {
                sb.append("\n");
                isFirstCharater=true;
            }

            else {
                if (isFirstCharater) {
                    sb.append(content_char[i]);
                    isFirstCharater = false;
                } else if (Character.isUpperCase(content_char[i])) {
                    sb.append(" ");
                    sb.append(Character.toLowerCase(content_char[i]));
                } else {
                    sb.append(content_char[i]);
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static List<Integer> findUpperCaseLetterPosition(String str)
    {
        List<Integer> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++) {
            boolean upperCase = Character.isUpperCase(chars[i]);
            if(upperCase)
            {
                System.out.println("Char "+chars[i]+" And Position is "+i);
                list.add(i);
            }
        }
        return list;
    }


    public static void camelCase(String str)
    {
        System.out.println("****Original***********************************");
        System.out.println(str);
        System.out.println("***********************************************");
        str = str.replace("\r","");
        StringBuilder sb = new StringBuilder();
        List<String> strList;
        //tokenize , store it in List
        String[] split = str.split(" ");
        for (String s : split) {
            if(s.contains("\n"))
            {
                sb.append(processNewLineString(s));
            }
            else {
                sb.append(s.substring(0, 1).toUpperCase() + s.substring(1, s.length()));
            }
        }
        System.out.println("*****Remove White Space and Camel Case**********");
        System.out.println(sb.toString());
        System.out.println("***********************************************");
        List<Integer> charposition = findCharposition(sb.toString(), "\n");
        System.out.println("****Final , After Special Char and new line check ******");
        str = checkPreviousChars(sb.toString(),charposition);
        System.out.println(str);
    }

    public static String checkPreviousChars(String str,List<Integer> list)
    {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (Integer integer : list) {
            String findChar = str.substring(integer-1,integer);
            if(!(findChar.contains("?") || findChar.contains(",") || findChar.contains(".")))
            {
                sb.append(str.substring(start,integer));
            }
            else
            {
                sb.append(str.substring(start,integer)+str.substring(integer,integer+1));
            }
            start=integer+1;
        }
        sb.append(str.substring(start,str.length()));
        return sb.toString();
    }

    public static String processNewLineString(String s)
    {
        StringBuilder sb=new StringBuilder();
        String[] string = s.split("\n");
        for (int i=0;i<string.length;i++) {
            sb.append(string[i].substring(0,1).toUpperCase()+string[i].substring(1,string[i].length()));
            if(i<string.length-1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static List<Integer> findCharposition(String str, String c)
    {
        List<Integer> list=new ArrayList<>();
        int start = 0;
        while (true) {
            int found = str.indexOf(c, start);
            if (found != -1) {
                list.add(found);
            }
            if (found == -1) break;
            start = found + 1;  // move start up for next iteration
        }
        //System.out.println(list);
        return list;
    }

    public static void capitalize(String str)
    {
        StringBuilder sb = new StringBuilder();
        String result = null;
        List<Integer> charposition = findSpecialChar(str);;
        for (Integer integer : charposition) {
           str = str.substring(0, integer + 1) + str.substring(integer + 1, integer + 2).toUpperCase() + str.substring(integer + 2, str.length());
        }
        System.out.println(str);


    }



    public static int findCharPos(String str) {
        char[] content_char = str.toCharArray();
        int line_start = -1;
        int line_end = -1;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(content_char[i])) {
                if (line_start < 0) {
                    line_start = i;
                    if (line_start > line_end) {
                        System.out.println("Line start -->" + i);
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    public static List<Integer> findSpecialChar(String str)
    {
        List<Integer> list=new ArrayList<>();
        int count = 0;
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Incorrect format of string");

        }
        Pattern p = Pattern.compile("[`~!@#$%^&*()_+[\\\\]\\\\\\\\;\\',./{}|:\\\"<>?]");
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            Matcher m = p.matcher(Character.toString(chars[i]));
            boolean b = m.find();
            if (b == true) {
                System.out.println("There is a special character in my string "+chars[i]+" And Position "+i);
                count++;
                list.add(i);

            }
        }
        System.out.println("count "+count);
        System.out.println("list "+list);
        return list;
    }

    private static void compute(Set<Integer> set,
                                List<List<Integer>> currentResults,
                                List<List<List<Integer>>> results)
    {
        if (set.size() < 2)
        {
            results.add(new ArrayList<List<Integer>>(currentResults));
            return;
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Integer first = list.remove(0);
        for (int i=0; i<list.size(); i++)
        {
            Integer second = list.get(i);
            Set<Integer> nextSet = new LinkedHashSet<Integer>(list);
            nextSet.remove(second);

            List<Integer> pair = Arrays.asList(first, second);
            currentResults.add(pair);
            compute(nextSet, currentResults, results);
            currentResults.remove(pair);
        }
    }
}
