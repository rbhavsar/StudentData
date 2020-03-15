package src.com.CodingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author rbhavsar
 * Created on 2/13/20.
 */
public class RemoveElementCollection {
  public static void main(String[] args) {

    Set<String> master = new HashSet<>();
    master.add("A");
    master.add("B");
    master.add("C");

    List<String> remove = new ArrayList<>();
    remove.add("A");
    remove.add("B");

    List<String> rolesToRemove = Arrays.asList(new String[]
        {"A", "B"});

    master.removeAll(rolesToRemove);

    System.out.println(master);






//    List<String> masterList = Arrays.asList(new String[]
//        {"A", "B","C" });
//    List<String> rolesToRemove = Arrays.asList(new String[]
//        {"A", "B" });
//    System.out.println(masterList);
//    System.out.println(rolesToRemove);
//    masterList.remove("B");
//    System.out.println(masterList);
  }
}
