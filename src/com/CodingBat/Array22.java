package src.com.CodingBat;

import java.util.*;

/**
 * @author Ravi Bhavsar
 */
public class Array22 {

  public static void main(String[] args) {
    int[] nums = {-1,0,1,3,4,5,7,8,9,11,12};
    int[] nums2 = {5,1,3,4,5,4,2,3};
    int[] nums1 = {2, 1};
    //zeroFront(nums1);
    //System.out.println(fizzArray3(5, 10));
    int[] nums3={2, 2, 2};
    //notAlone(nums3, 2);
    //evenOdd(nums3);
    //duplicateValue(nums);
    //duplicate_HashSet(nums);
    //duplicate_HashMap(nums);
    //maxmin(nums);
    //findMissingNumber(nums);
    String original="Selenium";
   // strReverse(original);
    int len = 2;
    //bigDiff_V2(nums);
    //centeredAvg(nums);
    //sum13_v2(nums);
    //sum34_v2(nums);
    //has22_v2(nums);
    //lucky_v2(nums);
    //sum28_v2(nums);
    //more14_v2(nums);
    //either24_v2(nums);
    //matchUp(nums1,nums2);
    //has77_v2(nums1);
    //has12_v2(nums1);
    //modeThree(nums1);
    //haveThree(nums1);
    //twoTwo(nums1);
    //System.out.println(sameEnds(nums1,len));
    //System.out.println(tripleUp(nums1));
    //shiftLeft(nums1);
    //tenRun(nums1);
    //pre4(nums2);
    //post4(nums2);
    int[] nums4={1, 10, 9,8,50,4,21,5};
    //System.out.println(isEverywhere(nums4, 2));
    //System.out.println(sameEnds_v1(nums4, 2));

    //shiftLeft_v1(nums4);

    //System.out.println(haveThree_v1(nums4));
    //System.out.println(findPattern77(nums4));
    //System.out.println(tripleUp_v1(nums4));
    //System.out.println(secondHighest(nums4));
    //fibonacci(8);
   swap(10,5);
  }

  private static void swap(int x,int y) {

    x = x + y;  // x now becomes 15
    y = x - y;  // y becomes 10
    x = x - y;  // x becomes 5

    System.out.println("x :->"+x+" y :->"+y);

  }

  private static void fibonacci(int n) {
    int n1=0;
    int n2=1;
    int n3=0;
    System.out.print(n1+","+n2+",");
    while(n>n3)
    {
      n3=n1+n2;
      System.out.print(n3);
      if(n!=n3) { // not print comma
        System.out.print(",");
      }
      n1=n2;
      n2=n3;
    }

  }

  private static int secondHighest(int[] nums) {
    int temp;
    for(int i=0;i<nums.length;i++)
    {
      for(int j=i+1;j<nums.length;j++)
      {
          if(nums[i]>nums[j])
          {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
          }
      }
    }

    return nums[nums.length-2];

  }

  private static boolean tripleUp_v1(int[] nums) {
    boolean flag=false;
    for(int i=0;i<nums.length-2;i++)
    {
      if(nums[i]+1==nums[i+1] && nums[i+1]+1==nums[i+2])
      {
        flag=true;
        break;
      }
    }
    return flag;
  }

  private static boolean findPattern77(int[] nums) {
    boolean flag=false;
    for(int i=0;i<nums.length-1;i++)
    {
      if((nums[i]==7 && nums[i]==nums[i+1]) || (i<nums.length-2 && nums[i]==7 && nums[i]==nums[i+2]))
      {
        flag=true;
        break;
      }
    }
  return flag;
  }

  private static boolean haveThree_v1(int[] nums) {
    boolean flag=false;
    int count=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==3)
      {
        count++;
      }
    }

    if(count==3)
    {
      for(int i=0;i<nums.length-1;i++)
      {
        if(nums[i]==3 && nums[i]==nums[i+1])
        {
          flag=false;
          break;
        }
        else
        {
          flag=true;
        }
      }
    }

    return flag;

  }

  private static void shiftLeft_v1(int[] nums) {
    int[] temp=new int[nums.length];
    if(nums.length>0) {
      int j = 0;
      temp[nums.length - 1] = nums[0];
      for (int i = 1; i < nums.length; i++) {

        temp[j] = nums[i];
        j++;
      }
    }

    for (int i : temp) {
      System.out.println(i);
    }

  }

  private static boolean sameEnds_v1(int[] nums, int len) {
    int count = nums.length; // array length
    boolean flag=true;
    for(int i=0,j=count-len;i<len;i++) // start from 0 and count-len
    {
      if(nums[i]==nums[j])
      {
        flag=true;
        j++;
      }
      else
      {
        flag=false;
        break;
      }
    }
    return flag;
  }

  private static boolean isEverywhere(int[] nums, int val) {
    boolean flag=true;
    if(nums.length==0 || nums.length==1)
    {
      return flag;
    }
    for(int i=0;i<nums.length-1;i++)
    {
      if(nums[i]==val || nums[i+1]==val)
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

  // 2, 1
  private static void evenOdd(int[] nums) {
    // Even: left
    // Odd: right
    int left_idx=0;
    int right_idx=nums.length - 1;
    int is_even=0;

    // evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]

    while(right_idx>left_idx){
        while(right_idx >= 0 &&  nums[right_idx] % 2 != 0){
            right_idx--;
        }
        while(left_idx < nums.length && nums[left_idx] % 2  == 0){
            left_idx++;
        }
        // swap the left and right elements

        if(right_idx>left_idx && nums[left_idx] % 2 != 0 && nums[right_idx] %2 == 0){
            System.out.println("Came here");
            int temp=nums[left_idx];
            nums[left_idx]=nums[right_idx];
            nums[right_idx]=temp;
            left_idx++;
            right_idx--;
        }
    }

    for (int num : nums) {
      System.out.println(num);
    }

    
  }

  private static int[] notAlone(int[] nums, int a) {

    for(int i=1;i<nums.length-1;i++)
    {
      if(nums[i]==a && nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
      {
        if(nums[i-1]>nums[i+1])
        {
          nums[i]=nums[i-1];
        }
        if(nums[i-1]<nums[i+1])
        {
          nums[i]=nums[i+1];
        }
      }
    }

    return nums;

  }

  private static int[] fizzArray3(int a, int b) {
    int[] temp=new int[b-a];
    int idx=0;
    for(int i=a;i<b;i++)
    {
      temp[idx++]=i;

    }
    return temp;
  }

  private static int[] zeroFront(int[] nums) {

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        nums[i] = nums[count];
        nums[count] = 0;
        count++;
      }
    }

    return nums;
  }

  private static int[] post4(int[] nums) {

    List<Integer> list=new ArrayList<Integer>();
    int pos=0;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==4)
      {
        break;
      }
      list.add(nums[i]);
    }
    int[] values=new int[list.size()];
    for (int i=0;i<values.length;i++) {
      values[i]=list.get(i);
    }

    return values;




  }

  private static void strReverse(String original) {

    String rev = "";
    for(int i=original.length()-1;i>=0;i--)
    {
      rev = rev + original.charAt(i);
    }
    System.out.println("reverse :"+rev);
  }

  private static void findMissingNumber(int[] nums) {

    for(int i=0;i<nums.length-1;i++)
    {
      if(nums[i+1]!=nums[i]+1)
      {
        System.out.println("NUmber :"+(nums[i]+1));
      }
    }
  }

  private static void maxmin(int[] nums) {

    int max=nums[0];
    int min=nums[0];
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]>max)
      {
        max=nums[i];
      }
      else if(nums[i]<min)
      {
        min=nums[i];
      }
    }
    System.out.println("Max: "+max+" & Min: "+min);
  }

  private static void duplicate_HashMap(int[] nums) {

    Map<Integer,Integer> store = new HashMap<Integer,Integer>();
    for (int num : nums) {
      Integer count = store.get(num);
      if(count==null)
      {
        store.put(num,1);
      }
      else
      {
        store.put(num,++count);
      }
    }
    System.out.println(store);

   Set<Map.Entry<Integer, Integer>> entries = store.entrySet();
    for (Map.Entry<Integer, Integer> entry : entries) {
      if(entry.getValue()>1)
      {
        System.out.println(entry.getKey());
      }
    }

  }

  private static void duplicate_HashSet(int[] nums) {
    Set<Integer> hashSet = new HashSet<Integer>();
    for (int num : nums) {
      boolean flag = hashSet.add(num);
      if(flag==false)
      {
        System.out.println("Duplicate Value : "+num);
      }
    }
  }

  private static void duplicateValue(int[] nums) {

    for(int i=0;i<nums.length;i++)
    {
      for(int j=i+1;j<nums.length;j++)
      {
        if(nums[i]==nums[j])
        {
          System.out.println("Duplicate number :"+nums[i]);
        }
      }
    }
  }

  private static int[] pre4(int[] nums1) {
    int position=0;
    for(int i=0;i<nums1.length;i++)
    {
      if(nums1[i]==4)
      {
        position=i;
      }
    }
    int[] nums=new int[position];
    for(int i=0;i<position;i++)
    {
      nums[i]=nums1[i];
    }

    return nums;
  }

  private static void tenRun(int[] nums) {
    int[] num1=new int[nums.length];
    int x=0;
    for(int i=0;i<nums.length;i++)
    {
     if(x==0)
     {
      if(nums[i]%10==0)
      {
        x=nums[i];
        num1[i]=x;
      }
      else
      {
        num1[i]=nums[i];
      }
    }
    else
     {
       if(nums[i]%10==0)
       {
         x=nums[i];
         num1[i]=x;
       }
       else
       {
         num1[i]=x;
       }
     }
    }
    for (int i : num1) {
      System.out.println(i);
    }
  }

  private static void shiftLeft(int[] nums1) {
    int[] temp=new int[nums1.length];
    int j=0;
    temp[nums1.length-1]=nums1[0];
    for(int i=1;i<nums1.length;i++)
    {
      temp[j]=nums1[i];
      j++;
    }
    for (int i : temp) {
      System.out.println(i);
    }
  }

  private static boolean tripleUp(int[] nums) {
    for(int i=0;i<nums.length-2;i++)
    {
      //System.out.println(nums[i]+":"+(nums[i+1]+1)+":"+(nums[i+2]+2));
      if(nums[i]+1==nums[i+1] && nums[i]+2==nums[i+2])
      {
        return true;
      }
    }
    return false;

  }

  private static boolean sameEnds(int[] nums1,int len) {
    for(int i=0;i<len;i++)
    {
      if(nums1[i] != nums1[nums1.length-len+i])
      {
        return false;
      }
    }
    return true;

  }

  private static void twoTwo(int[] nums1) {
    boolean flag = false;
    for(int i=0;i< nums1.length;i++)
    {
      if(nums1[i]==2 && nums1[nums1.length-1]!=2)
      {
        if(nums1[i]==nums1[i+1]) {
          flag = true;
          i++;
        }
        else
        {
          flag=false;
        }
      }


    }
    System.out.println("flag :"+flag);
  }

  private static void haveThree(int[] nums1) {

    int count=0;
    boolean flag=false;
    for(int i=0;i<nums1.length;i++)
    {
      if(nums1[i]==3)
      {
        count++;
      }
    }
    System.out.println("count :"+count);
    for(int i=0;i<nums1.length-1;i++)
    {
      if(count==3 && nums1[i]==3 && nums1[i]!=nums1[i+1])
      {
        flag=true;
      }
      else
      {
        flag=false;
      }
    }
    System.out.println("flag :"+flag);
  }

  private static void modeThree(int[] nums1) {

    boolean even=false;
    boolean odd=false;
    for(int i=0;i<nums1.length-2;i++)
    {
      if(nums1[i]%2==0 && nums1[i+1]%2==0 && nums1[i+2]%2==0)
      {
        even=true;
      }
      if(nums1[i]%2!=0 && nums1[i+1]%2!=0 && nums1[i+2]%2!=0)
      {
        odd=true;
      }
    }

    if(even || odd)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }

  }

  private static void has12_v2(int[] nums1) {
    int pos1=0;
    boolean found12=false;
    for(int i=0;i<nums1.length-1;i++)
    {
      if(nums1[i]==1)
      {
        pos1=i;
      }
    }

    for(int i=pos1;i<nums1.length;i++)
    {
      if(nums1[i]==2)
      {
        found12=true;
      }
    }

    System.out.println("found12 :"+found12);

  }

  private static void has77_v2(int[] nums1) {

    boolean flag = false;
    for(int i=0;i<nums1.length-1;i++)
    {
      if(nums1.length>i+2 && nums1[i]==7 && nums1[i]==nums1[i+2])
      {
        flag=true;
      }
      if(nums1[i]==7 && nums1[i]==nums1[i+1])
      {
        flag=true;
      }
    }

    System.out.println("flag :"+flag);


  }

  private static void matchUp(int[] nums1,int[] nums2) {
    int count=0;
    for(int i=0;i<nums1.length;i++)
    {
      if(Math.abs(nums1[i]-nums2[i])<=2)
      {
        count++;
      }
    }
    System.out.println("Count :"+count);
  }

  private static void either24_v2(int[] nums) {
    boolean found2=false;
    boolean found4=false;

    for(int i=0;i<nums.length-1;i++)
    {
      if(nums[i]==2 && nums[i]==nums[i+1])
      {
        found2=true;
      }
      if(nums[i]==4 && nums[i]==nums[i+1])
      {
        found4=true;
      }
    }

    if(found2 && found4)
    {
      System.out.println("false");
    }

    else if(found2 && !found4)
    {
      System.out.println("true");
    }

    else if(!found2 && found4)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }



  }

  private static void more14_v2(int[] nums) {
    int count1=0;
    int count4=0;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==1)
      {
        count1++;
      }
      if (nums[i]==4) {
        count4++;
      }
    }
    if(count1>count4)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }

  private static void sum28_v2(int[] nums) {
    int sum=0;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==2)
      {
        sum=sum+nums[i];
      }
    }
    if(sum==8)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }

  private static void lucky_v2(int[] nums) {
    boolean one=false;
    boolean three=false;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==1)
      {
        one=true;
      }
      if(nums[i]==3)
      {
        three=true;
      }
    }
    if(one && three)
    {

    }
  }

  private static void has22_v2(int[] nums) {
    boolean flag=false;
    for(int i=0;i<nums.length-1;i++)
    {
      if(nums[i]==2 && nums[i+1]==2)
      {
        flag=true;
      }
    }
    System.out.println("has22 :"+flag);
  }

  private static void sum34_v2(int[] nums) {
    int sum=0;
    boolean flag=false;

    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==3)
      {
        flag=true;
      }
      else if(nums[i] ==4)
      {
        if(flag) {
          flag = false;
        }
        else
        {
          sum=sum+nums[i];
        }
      }
      else if(!flag)
      {
        sum=sum+nums[i];
      }
    }

    System.out.println("sum :"+sum);



  }

  public boolean twoNextToTwo(int[] nums) {
    boolean flag=true;
    for(int i=0;i< nums.length-1;i++)
    {
      if(nums[i]==2)
      {
        if(nums[i]==nums[i+1]) {
          flag = true;
          i++;
        }
        else
        {
          flag=false;
        }
      }
    }
    return flag;
  }

  public int countBirst(String str) {

    int pos=0;
    int count=0;
    while(true)
    {
      pos = str.indexOf("hi", pos);
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

    return count;

  }







  private static void sum13_v2(int[] nums) {
    int sum=0;
    boolean found13=false;
    for(int i=0;i<nums.length;i++) {
      if(nums[i]!=13)
      {
        if(!found13) {
          sum = sum + nums[i];
        }
        found13=false;
      }
      else
      {
        found13=true;
      }
    }
    System.out.println("sum :"+sum);
  }

  private static void centeredAvg(int[] nums) {
    int len = nums.length;
    System.out.println("len :"+len);
    if(len%2==0)
    {
      System.out.println(nums[len/2]+nums[len/2-1]);
    }
    else
    {
      System.out.println(nums[len/2]);
    }

  }

  private static void bigDiff_V2(int[] nums) {

    int max=nums[0];
    int min=nums[0];
    for (int num : nums) {
      if(num>max)
      {
        max=num;
      }
      if(num<min)
      {
        min=num;
      }
    }
    System.out.println("Max :"+max);
    System.out.println("Min :"+min);

    System.out.println("Diff :"+(max-min));


  }



}
