/*
  Chapter 3 - Question 10

  Read characters from a keyboard. Covert all
  lowercase letters to uppercase, and all uppercase
  to lowercase. Stop when the user enters a period.
  Display the number of case changes that have taken place.
*/
class ChangeCase {
    public static void main(String args[]) 
      throws java.io.IOException {
      
        char input, convert, ignore;
        int count = 0;

        do {
          
          input = (char) System.in.read();

          // discard any other characters in the input buffer
          do {
            ignore = (char) System.in.read();
          } while(ignore != '\n');

          
          // check UPPERCASE; if so, convert
          if((int) input >= 65 && (int) input <= 90) {
            convert = (char) (input + 32);
            System.out.println("Converted to: " + convert);
            count++;
          }
            
          // check lowercase; if so, convert
          if((int) input >= 97 && (int) input <= 122) {
            convert = (char) (input - 32);
            System.out.println("Converted to: " + convert);
            count++;
          }
        } while(input != '.');

        System.out.println("Number of converted letters is: " + count);
    }
}
