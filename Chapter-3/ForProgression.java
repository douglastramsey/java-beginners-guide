/*
  Chapter 3 - Question 9

  Use a for loop to generate the progression
  1, 2, 4, 8, 16, 32 and so on.
*/
class ForProgression {
    public static void main(String args []) {
        
        int i, prev;

        for (i=1; i <= 100; ) {
          System.out.println(i);
          prev = i;
          i += prev;
        }
    }
}
