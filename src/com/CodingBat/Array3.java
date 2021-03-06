package src.com.CodingBat;

import java.util.*;

/**
 * @author Ravi Bhavsar
 */
public class Array3 {

  public static void main(String[] args) {
    int[] nums={5, 4, 9, 4, 9, 5};
    //int[] ints = fix34(nums);
    int[] ints = fix34_v1(nums);
    for (int anInt : ints) {
      System.out.println(anInt);
    }

    int[] nums1={1, 4, 2, 1, 4, 4, 4};
    maxSpan(nums1);
  }

  private static void maxSpan(int[] nums) {
    /*
    *
    * 0  1  2  3  4  5  6
    * ---------------------
    * 1, 4, 2, 1, 4, 4, 4
    *
    * Hash Map:
    *
    * [1]: 0, 3
    * [4]: 1, 6
    * [2]: 2, 2
    *
    * Max: 4
    * */
    //int[] ele = new int[2];
    Map<Integer,int[]> map=new HashMap<Integer, int[]>();
    int max_span_size=0;
    for(int i=0;i<nums.length;i++)
    {
      int[] ele = map.get(nums[i]);

      if(ele == null){
        int[] temp = { i, i};
        map.put(nums[i],temp);
        ele=temp;
      } else {
        ele[1]=i;
      }

      int curr_size=ele[1] - ele[0] + 1;
      if (curr_size > max_span_size){
        max_span_size=curr_size;
      }
    }
    System.out.println("Max span length is " + max_span_size);
  }

  private static int[] fix34_v1(int[] nums) {
    //Tejas Patel
    //1, 3, 4, 1, 1, 3, 4
    List<Integer> list4=new ArrayList<Integer>();
    List<Integer> list5=new ArrayList<Integer>();
    List<Integer> wanted=new ArrayList<Integer>();



    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==4)
      {
        list4.add(i);
        wanted.add(i+1);
      }
      if(nums[i]==5)
      {
        list5.add(i);
      }
    }

    List<Integer> intersection = new ArrayList<Integer>(list5);
    intersection.retainAll(wanted);

    for (Integer integer : intersection) {
      list5.remove(list5.indexOf(integer));
      wanted.remove(wanted.indexOf(integer));
    }

    for(int i=0;i<list5.size();i++)
    {
      int temp=nums[wanted.get(i)];
      nums[wanted.get(i)]=nums[list5.get(i)];
      nums[list5.get(i)]=temp;
    }

  return nums;
    /*
    0 1 2 3 4 5 6
    ——————----------
    1 3 1 4 4 3 1

    3 -> { 1, 5 }
    4 -> { 3, 4 }

    wanted: 2, 6

    swap(2, 3) ->
    swap(6, 4) ->  

     0  1  2  3  4  5  6  7  8  9  10  11
     -------------------------------------
    [5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3,  5]

    3 -> { 1, 8, 10 }
    4 -> { 3, 5, 7 }
    wanted: 2, 9, 11

    swap(2, 3)
    swap(9, 5)
    swap(11, 7)

     0  1  2  3  4  5  6  7  8  9  10  11
     -------------------------------------
    [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3,  4]



     */
  }

  private static int[] fix34(int[] nums) {

    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==3)
      {
        for(int j=0;j<nums.length;j++)
        {
          if(nums[j]==4)
          {
          int temp=nums[i+1];
          nums[i+1]=nums[j];
          nums[j]=temp;
          }
        }
      }
    }


    return nums;
  }

}
