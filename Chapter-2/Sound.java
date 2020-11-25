/*
  Try This 2-1
  Compute the distance to a lightning
  strike whose sound takes 7.2 seconds
  to reach you.
  
  Extra challenge:
  Compute the distance to a large object,
  such as a rock wall, by timing the echo.
*/
class Sound {
  public static void main(String args[]) {
      double dist, echo;

      dist = 7.2 * 1100;

      System.out.println("The lightning is " + dist + " feet away.");

      //Extra challenge
      echo = dist / 2;

      System.out.println("The rock wall is " + echo + " feet away.");
  }    
}
