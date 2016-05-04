// using hash tables
import java.util.*;

public class hashy{
  public static void main(String[] args){
    Hashtable<String, Integer> nums = new Hashtable<String, Integer>();
    nums.put("swan", 1);
    nums.put("do",2);
    System.out.println(nums.get("do"));
    nums.put("do", 3);
    System.out.println(nums.get("do"));
    
  }
}
