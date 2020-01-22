package main.java.study.leetcode;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @author ICG-DL-002
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Test001 {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    int target = 9;

    for (int item : twoSum3(nums, target)) {
      System.out.println(item);
    }
  }

  public static int[] twoSum(int[] nums, int target) {
    int size = nums.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return null;
  }

  public static int[] twoSum2(int[] nums, int target) {
    int i = 0;
    int k = 1;
    return findAns(i, k, nums, target);
  }


  private static int[] findAns(int i, int k, int[] nums, int target) {

    if (nums[i] + nums[fun(i, k)] == target) {
      return new int[] {i, fun(i, k)};
    } else {
      i = i + 1;
      if (fun(i, k) > nums.length - 1) {
        i = 0;
        k = k + 1;
      }
      if (k > nums.length - 1) {
        return null;
      }
      return findAns(i, k, nums, target);
    }

  }

  private static int fun(int i, int k) {
    return i + k;
  }
  
  public static int[] twoSum3(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      if(map.containsKey(target-nums[i])){
        return new int[] {i, map.get(target-nums[i])};
      }
      map.put(nums[i], i);
    }
    return null;
  }


}
