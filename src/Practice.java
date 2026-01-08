import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: o(n) where n = array.length
  // Space Complexity: o(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: o(n^2) where n^2 = martix x marix length
  // Space Complexity: o(n^2)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: o(n) where n = array.length
  // Space Complexity: o(n)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: o(n^2) where n^2 = the n * n
  // Space Complexity: o(n)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: o(n) where n = nums.length
   * Space Complexity: o(n)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    // [1,1,1,2,2,3,]
    // my expected 1
    // variable to update
    int mostFreqInt = nums[0];
    int maxCount = 0;

    //create hashmap to store each number and their frequency
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int num: nums){
      // creates a hash freq, adding a new entry for each num
      if (!map.containsKey(num)) {
        map.put(num, 1);
      } else{
        map.put(num, map.get(num) + 1);
      }
      // updates value to see if its freqeuncy is greater than the current
      if (map.get(num) > maxCount) {
        maxCount = map.get(num);
        mostFreqInt = num;
      }
    
    }
    // return the mostFreqInt
    return mostFreqInt;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity:  o(n^2) where n = nums.length
   * Space Complexity:  o(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
 
    // variables to update
    int mostFreqInt = nums[0];
    int maxCount = 0;

    // loop through a single num
    for(int num: nums){
      // store that num
      int numToCheck = num;
      int count = 0;

      // check to see if the num to check
      for(int i = 0; i < nums.length; i++){
        if(nums[i] == numToCheck){
          count++;
        }
      }

      // update values
      if (count > maxCount) {
        mostFreqInt = numToCheck;
        maxCount = count;
      }
    
    }

    // return the mostFreqInt
    return mostFreqInt;
  }
}