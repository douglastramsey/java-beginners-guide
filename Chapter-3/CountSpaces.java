/*
  Chapter 3 - Question 1

  A program that reads characters from the keyboard
  until a period is received. Count the number of
  spaces and report the total at the end.
*/
public class CountSpaces {
    public static void main(String args []) 
      throws java.io.IOException {
        
        char choice;
        int count = 0;

        do {
          
          choice = (char) System.in.read();
          if(choice == ' ') count++;
    
        } while(choice != '.');

        System.out.println("Number of spaces is: " + count);
    }
}
