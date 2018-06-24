package src.com.CodingBat;

import java.util.HashMap;
import java.util.Map;

public class CollectionChallenge {

    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<String, String>();
        //map.put("a","aaa");
        map.put("b","aaa");
        map.put("c","cake");

        for(Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //map = mapBully(map);
        //System.out.println(map);

        //map = mapAB2(map);
        //System.out.println("map :-"+map);

        //map = mapAB3(map);
        //System.out.println(map);
        int[] values = {1, 2, 100};
        //System.out.println(countEvens(values));
        //System.out.println(bigDiff(values));
        System.out.println(centeredAverage(values));


    }

    public static Map<String,String> mapBully(Map<String,String> map)
    {
        if(map.containsKey("a"))
        {
            map.put("b",map.get("a"));
            map.put("a",map.get("a"));

        }
        if(map.containsKey("c"))
        {
            map.remove("c");

        }
        map.put("fries",map.get("a"));
        return map;

    }

    public static Map<String,String> mapAB2(Map<String,String> map)
    {
        System.out.println("Value of a :"+map.get("a"));
        System.out.println("Value of b :"+map.get("b"));
        if(map.get("a")==map.get("b"))
        {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }

    public static Map<String,String> mapAB3(Map<String,String> map)
    {
       if(map.get("b")==null)
       {
           map.put("b",map.get("a"));
           return map;
       }
       else if(map.get("a")==null)
       {
           map.put("a",map.get("b"));
           return map;
       }
       else if(map.get("a")==null && map.get("b")==null)
       {
           return map;
       }


     return map;
    }

    public static int countEvens(int[] values)
    {
        int count=0;
        for (int value : values) {
            if(value%2==0)
            {
                count++;
            }

        }
        return count;
    }

    public static int bigDiff(int[] nums)
    {
        int min=nums[0];
        int max=nums[0];
        for(int num:nums) {
            if (min > num)
            {
                min=num;
            }
            if(max < num)
            {
                max=num;
            }
        }

        return max-min;

    }

    public static int centeredAverage(int[] nums)
    {

        int min = findMin(nums);
        int max = findMax(nums);
        int sum = 0;
        int i=0;
        int len = nums.length;
        int[] temp=new int[len-2];
        for (int num : nums) {
            if(num!=min && num!=max) {
               temp[i]=num;
                System.out.println("temp[i] :"+temp[i]);
               i++;
            }
        }

        for (int t : temp) {
            sum=sum+t;
        }
        return sum/(len-2);
    }

    private static int findMin(int[] nums)
    {
        int min=nums[0];
        for(int num:nums)
        {
            if(min>num)
            {
                min=num;
            }
        }
        System.out.println("Min :"+min);
        return min;
    }

    private static int findMax(int[] nums)
    {
        int max=nums[0];
        for (int num : nums) {
            if(max<num)
            {
                max=num;
            }
        }
        System.out.println("Max :"+max);
        return max;
    }


}
