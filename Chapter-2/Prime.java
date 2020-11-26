/* 
  Chapter 2 - Question 10

  Write a program that finds all of the prime numbers
  between 2 and 100.
*/
class Prime {
    public static void main(String args[]) {
        for (int count = 2; count <= 100; count++) {
            
            boolean prime = true;
            
            for (int check = count - 1; check >= 2; check--) {
               if (count % check == 0) prime = false;
            }
            
            if (prime) System.out.println(count);
        }
    }
}
