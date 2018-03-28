package com.CodingBat;

import sun.awt.image.ImageWatched;

import java.util.*;

public class ArraysTesting {

    public static void main(String[] args) {

        char[] balls = { 'R', 'R', 'W', 'B', 'W', 'R', 'W' };
        /*arrange(balls);
        for (int i=0; i < balls.length; i++) {
            System.out.print(balls[i] + " ");
        }*/

        orders(balls);

        int[] nums = {0,1,7,2,7,1};
        int[] numbers = {7, 1, 2, 9, 7, 2, 1};
        //maxMirror(numbers);
        //int[] outer = {1, 2,2,4,3, 6};
        int num = 9;
        //ArrayList temps = twoSum_old(nums,num);
        //System.out.println("temps "+temps);
        /*for (Object temp : temps) {
            System.out.println("temp "+temp);
        }*/

        //print1And0(nums);

        int[] arry1 = {1,2,3};
        int[] arry2 = {2,3,10};

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013};
        System.out.println("Original array : "+Arrays.toString(my_array1));
        /*for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }*/


        //reverse(my_array1);
        //secondMax(my_array1);
        //secondSmall(my_array1);

        int[] arr = {1,2,0,3,0,1,0,9};
        moveZero(arr);


        //System.out.println(macthUp(arry1,arry2));


        //System.out.println("has77 "+has77(nums));

        //has12(nums);

        String str = "OOPOOP Concepts AreOOPS haha OOPShahaOOP!!";
        //System.out.println("Index :"+str.indexOf("there"));

        //System.out.println("count :"+findOOP(str));

        //System.out.println(doubleChar("The"));

       // System.out.println(countHi("abc hihi hohi"));



        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(4);

        //AddNumbers(list1,list2);


        int palindromNumber = 123;
        //palindrome(palindromNumber);

        //System.out.println(catDog("catdog"));


       /*int[] temp= squareUp_Old(3);
        for (int i : temp) {
            System.out.println("i "+i);
        }*/

        //seriesUp(3);

        // int[] Inner = {2, 3, 4};
        //maxSubArray(nums);
        //System.out.println(linearIn(outer,Inner));
        /*for (int i : fix34(nums)) {
            System.out.println(i);
        }*/

        // System.out.println(canBalance(nums));

        //System.out.println(sum67(nums));
        //System.out.println(has22(nums));
        // System.out.println(more14(nums));
        //reverse(123);

        //System.out.println(only14(nums));
        //System.out.println(either24(nums));
        /*ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(29);
        nums.add(19);*/


        //List<Integer> temp = doubling(nums);
        //System.out.println(temp);

      /*  List<String> values = new ArrayList<String>();
        values.add("a");
        values.add("b");
        values.add("c");*/

        //System.out.println(moreY(values));

    }

    private static void orders(char[] balls) {

        Hashtable<Character,Integer> table = new Hashtable<Character, Integer>();
        table.put('R',0);
        table.put('B',0);
        table.put('W',0);

        for(int i=0;i<balls.length;i++)
        {
            char myballColor = balls[i];
            int value = table.get(myballColor);
            value++;
            table.put(myballColor,value);
        }

        int number_r = table.get('R');
        int number_b = table.get('B');
        int number_w = table.get('W');
        int curidx=0;

       // while(number_r > 0 || number_b > 0 || number_w > 0){
        for(;(number_r > 0 || number_b > 0 || number_w > 0);) {
            if (number_r > 0) {
                balls[curidx] = 'R';
                number_r--;
                curidx++;
                continue;
            }
            if (number_b > 0) {
                balls[curidx] = 'B';
                number_b--;
                curidx++;
                continue;
            }
            if (number_w > 0) {
                balls[curidx] = 'W';
                number_w--;
                curidx++;
                continue;
            }
            //}
        }
        System.out.println(balls);

    }

    // R first, B middle, white last
    public static void arrange(char[] balls){
        int ridx = 0;
        int widx = balls.length-1;

        for(int curridx=0;  curridx < balls.length; curridx++){
            if (balls[curridx] == 'R'){
                swap(balls, curridx, ridx);
                ridx++;
            }
            if (balls[curridx] == 'W'){
                // First we need to search for the next white ball.
                while( widx >= curridx && balls[widx] == 'W' ){
                    widx--;
                }
                if(widx >= curridx && balls[widx] != 'W'){
                    swap(balls, curridx, widx);
                    widx--;
                }
                if(balls[curridx] == 'R'){
                    swap(balls, curridx, ridx);
                    ridx++;
                }
            }
        }
    }

    public static void swap(char[] balls, int a, int b){
        char temp=balls[a];
        balls[a]=balls[b];
        balls[b]=temp;
    }

    private static void moveZero(int[] arr) {

        int[] finalArr = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                finalArr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(finalArr));

    }

    private static void secondSmall(int[] my_array1) {
        int min=my_array1[0];
        int secondMin=my_array1[0];

        ///2,1,3,4

        for(int i=0;i<my_array1.length;i++)
        {
            if(my_array1[i]<min) // 3<1
            {
                secondMin=min; // sec = 2
                min=my_array1[i];// min = 1
            }
            else if(my_array1[i]<secondMin) //3<2
            {
                    secondMin=my_array1[i];
            }
        }
        System.out.println("min "+min);
        System.out.println("secondMin "+secondMin);
    }

    private static void secondMax(int[] my_array1) {
       int max=my_array1[0];
       int secondMax=my_array1[0];

       for(int i=0;i<my_array1.length;i++)
       {
           if(my_array1[i]>max)
           {
               secondMax=max;
               max=my_array1[i];
           }
           else if(my_array1[i]>secondMax)
           {
               secondMax = my_array1[i];
           }
       }
        System.out.println("max "+max);
        System.out.println("secondmax "+secondMax);

    }

    public static void reverse(int[] my_array1)
    {
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }


    public static boolean catDog(String str)
    {
        String word1="cat";
        String word2="dog";

        int catCount = countWord(str,word1);
        int dogCount = countWord(str,word2);

        if(catCount==dogCount)
        {
            return true;
        }

        return false;

    }

    public static int countWord(String str,String word)
    {
        int start=0;
        int count = 0;
        while(start>=0)
        {
           int found =  str.indexOf(word,start);
           if(found==-1) break;
           if(found!=-1)
           {
               count++;
           }
           start=found+word.length();
        }

        return count;
    }


    public static String doubleChar(String str)
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static int findOOP(String str)
    {
        int start = 0;
        String word = "OOP";
        int count=0;
        while(start>=0)
        {
            int found = str.indexOf(word,start);
            if(found==-1) break;
            if(found!=-1)
            {
                count++;
            }
            start=found+word.length();
        }

        return count;
    }

    public static void has12(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {

            }
        }
        
    }

    public static boolean has77(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]==nums[i+2])
            {
                return true;
            }
        }

        return false;
    }

    public static int macthUp(int[] arry1, int[] arry2)
    {
        int count=0;
        for(int i=0;i<arry1.length;i++)
        {
            int x = Math.abs(arry1[i] - arry2[i]);
            if((x>0) && (x<3))
            {
                count++;
            }
        }
        return count;
    }

    public static void print1And0(int[] nums)
    {
        int left=0;
        int temp;
        int right=nums.length-1;
        while(right > left) {
            while (right > left && nums[left] != 1) {
                left = left + 1;
            }
            while (right > left && nums[right] != 0) {
                right = right - 1;
            }
            if (right > left) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left = left + 1;
                right = right - 1;
            }
        }
        for (int num : nums) {
            System.out.println("num :"+num);
        }
    }


    public static boolean palindrome(int number)
    {
        int rev = 0;
        int reminder = 0;

        while(number>0)
        {
            reminder = number%10;
            rev = reminder+rev*10;
            number=number/10;

        }

        System.out.println("rev :"+rev);

        return true;
    }

    public static ArrayList<Integer> AddNumbers(LinkedList<Integer> list1,LinkedList<Integer> list2)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        int j=0;
        int reminder,ans=0;
        if(list1.size()==list2.size())
        {
           for(int i=0;i<list1.size();i++)
           {
                if(list1.get(i)+list2.get(j)>9)
                {
                    reminder = (list1.get(i)+list2.get(j))%10;
                    temp.add(reminder+ans);
                    ans = (list1.get(i)+list2.get(j))/10;
                }
                else {
                    temp.add(list1.get(i) + list2.get(j)+ans);
                }
                j++;
           }
        }
    return temp;
    }



    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = len - 1; i + count < len && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }

    public static int maxMirror_r(int[] nums) {
        int n = nums.length;
        int[] numsReversed = new int[n];
        for (int i = 0; i < n; i++) {
            numsReversed[i] = nums[n - i - 1];
        }

        int[][] scores = new int[n + 1][n + 1];
        int max = 0;

        for (int i = 0; i < n; i++) {
            scores[0][i] = 0;
            scores[i][0] = 0;
        }
        System.out.println("scores :"+scores);
        for (int[] score : scores) {
            for (int i : score) {
                System.out.println("i :"+i);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums[i - 1] == numsReversed[j - 1]) {
                    int currScore = scores[i - 1][j - 1] + 1;
                    scores[i][j] = currScore;
                    max = Math.max(currScore, max);
                } else {
                    scores[i][j] = 0;
                }
            }
        }
        return max;
    }

    private static int twoElements(int[] nums, int count) {


        return 0;
    }


    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        int x = n - 1, pass = 1, index = 0;

        if (n == 0) {
            return result;
        }

        for (int i = n - 1; i < result.length; i += n) {
            index = i;
            for (int k = 1; k <= pass; k++) {
                if (k == 0) {
                    break;
                }
                result[index] = k;
                index--;
            }
            pass++;
        }
        return result;
    }

    public static int[] squareUp_Old(int n) {
        int[] temp = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {

                temp[(i * n) - j] = j;
            }
        }
        return temp;
    }

    public static int[] seriesUp(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        int count = 0;
        int[] temp = new int[sum];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                temp[count] = j;
                count++;
            }
        }

        return temp;
    }

    public static ArrayList twoSum_old(int[] nums, int target) {
        ArrayList result = new ArrayList();
        if (nums == null || nums.length < 2) {
            result.add(0);
            result.add(0);
            return result;
        }
        int required_num = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            //System.out.println("Value :-"+map.containsKey(nums[i])+" nums[i] :"+nums[i]);
            required_num = target - nums[i];
            if (map.containsKey(required_num)) {
                result.add(nums[i]);
                result.add(required_num);
            }
            System.out.println(target - nums[i]);
            map.put(nums[i], i);
        }

        return result;
    }

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length >= 2) {
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < numbers.length; i++) {
                if (!h.isEmpty() && h.containsKey(target - numbers[i])) {
                    int[] k = {h.get(target - numbers[i]) + 1, i + 1};
                    return k;
                }

                h.put(numbers[i], i);
            }
        }

        int[] k = {-1, -1};
        return k;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int end = outer.length;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < end; i++) {
            set.add(outer[i]);
        }
        Integer[] outer1 = set.toArray(new Integer[set.size()]);

        for (Integer integer : outer1) {
            //System.out.println(integer);
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            //System.out.println(it.next());
        }


        int[] Match = new int[inner.length];
        int k = 0;
        for (int i = 0; i < outer1.length; i++) {
            for (int j = 0; j < inner.length; j++) {
                if (outer1[i] == inner[j]) {
                    Match[k] = inner[j];
                    k++;
                }
            }
        }
        int count = 0;
        for (int j = 0; j < inner.length; j++) {

            if (Match[j] == inner[j]) {
                count++;
            }
        }
        if (count == inner.length) {
            return true;
        }
        return false;
    }

    public static int maxSubArray(int[] A) {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
            max = Math.max(max, sum[i]);
        }

        return max;
    }

    public static boolean canBalance(int[] nums) {
        if (nums.length % 2 == 0) {
            int left = nums.length / 2;
            int leftSum = 0;
            for (int i = 0; i < left; i++) {
                leftSum = leftSum + nums[i];
            }
            System.out.println("leftSum :" + leftSum);
            int rightSum = 0;
            for (int i = nums.length - 1; i >= left; i--) {
                rightSum = rightSum + nums[i];
            }
            System.out.println("Right Sum :" + rightSum);
            if (leftSum == rightSum) {
                return true;
            }
        } else if (nums.length % 2 != 0) {
            int left = nums.length / 2;
            int leftSum = 0;
            for (int i = 0; i <= left; i++) {
                leftSum = leftSum + nums[i];
            }
            System.out.println("leftSum :" + leftSum);
            int rightSum = 0;
            for (int i = nums.length - 1; i > left; i--) {
                rightSum = rightSum + nums[i];
            }
            System.out.println("Right Sum :" + rightSum);
            if (leftSum == rightSum) {
                return true;
            }
        }


        return false;
    }

    public static int[] fix34(int[] nums) {
        int position3 = 0;
        int position4 = 0;
        int shift = 0;
        int swap = 0;
        int j = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                position3 = i;
                swap = nums[i + 1];
            }
            if (nums[i] == 4) {
                position4 = i;
            }

            temp[j] = nums[i];
            j++;

        }

        for (int i = 0; i < temp.length; i++) {
            if (i == position3) {
                temp[position3 + 1] = 4;
                temp[position4] = swap;
                break;
            }
        }

        return temp;
    }

    public static List<String> moreY(List<String> values) {
        List<String> temp = new ArrayList<String>();

        for (String value : values) {
            temp.add("y" + value + "y");
        }

        return temp;
    }

    public static List<Integer> doubling(List<Integer> nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (num > 13 && num < 19) {
            } else {
                temp.add(num);
            }
        }
        return temp;
    }

    public static boolean either24(int[] nums) {
        boolean flag2 = false;
        boolean flag4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i == nums.length - 1) {
                    break;
                }
                if (nums[i + 1] == 2) {
                    flag2 = true;
                }
            }
            if (nums[i] == 4) {
                if (i == nums.length - 1) {
                    break;
                }
                if (nums[i + 1] == 4) {
                    flag4 = true;
                }
            }
        }
        if (flag2 == true && flag4 == true) {
            return false;
        } else if (flag2 == true) {
            return true;
        } else if (flag4 == true) {
            return true;
        }
        return false;
    }

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 4 && num != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean reverse(int n) {
        int rev = 0;
        while (n > 0) {
            //rev = n % 10; //rev =3
            rev = rev * 10 + n % 10;// 0+3 -- 30+2 - 320+1
            n = n / 10; // n=12 -- n=1
        }

        System.out.println(rev);

        return true;
    }

    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int num : nums) {

            if (num == 1) {
                count1++;
            }
            if (num == 4) {
                count4++;
            }
        }
        if (count1 > count4) {
            return true;
        }
        return false;
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i == nums.length - 1) {
                    break;
                }
                if (nums[i + 1] == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int sum67(int[] nums) {
        boolean sixAndSeverPresent = false;
        int notpresentSum = 0;
        for (int num : nums) {
            if (num == 6 || num == 7) {
                sixAndSeverPresent = true;
            } else {
                notpresentSum = notpresentSum + num;
            }
        }

        if (sixAndSeverPresent) {
            int j = 0;
            int k = 0;
            List<Integer> includeNumbers = new ArrayList<Integer>();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 6) {
                    j = i;
                }
                if (nums[i] == 7) {
                    k = i;
                }
            }
            int a = 0;
            while (j > a) {
                includeNumbers.add(nums[a]);
                a++;
            }

            a = nums.length - 1;

            while (k < a) {
                includeNumbers.add(nums[a]);
                a--;
            }

            int sum = 0;
            for (Integer includeNumber : includeNumbers) {
                sum = sum + includeNumber;
            }
            return sum;
        }
        return notpresentSum;
    }

    public static int sum13(int[] nums) {
        System.out.println("nums.length :" + nums.length);
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int num : nums) {
            if (num == 13) {
                count++;
            }
        }
        System.out.println("count :" + count);
        int sum = 0;
        int j = 0;
        int k = 0;
        int[] notConsider = new int[count * 2];
        int[] consider = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                System.out.println("nums[i]" + nums[i] + "nums[i+1] :" + nums[i + 1]);
                notConsider[k] = nums[i];
                System.out.println("notConsider[k]" + notConsider[k]);
                notConsider[k + 1] = nums[i + 1];
                System.out.println("notConsider[k+1]" + notConsider[k + 1]);
                k++;
            }
        }
        for (int i : notConsider) {
            System.out.println("i " + i);

        }
        return 0;
    }
}


