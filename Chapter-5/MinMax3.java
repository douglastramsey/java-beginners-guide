/*
  Chapter 5 - Self Test - Question 13

  Rewrite this class so that it uses a for-each style for loop.

  Find the minimum and maximum values in an array.
*/
  class MinMax3 {
    public static void main(String args[]) {
        int nums[] = { 99, -10, 100123, 18, -978,
                       5623, 463, -9, 287, 49 };
        int min, max;

        min = max = nums[0];

        for(int i : nums) {
            if(i < min) min = i;
            if(i > max) max = i;
        }

        System.out.println("min and max: " + min + " " + max);
    }
}
