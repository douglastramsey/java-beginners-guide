/*
  Chapter 5 - Self Test - Question 4  

  Change the sort in Try This 5-1 so that it sorts
  an array of strings.
*/
public class Bubble2 {
    public static void main(String args[]) {
        String strings[] = { "House", "Home", "Apple", "Car",
                             "Mouse", "Elephant", "Tiger", "Keyboard",
                             "Container", "Java", "Image", "Database" };
        
        int a, b, size;
        String t;

        size = 12; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
          System.out.print(" " + strings[i]);
        System.out.println();

        // This is the Bubble sort.
        for(a=1; a < size; a++)
          for(b=size-1; b >= a; b--) {
              if(strings[b-1].compareTo(strings[b]) > 0) { //if out of order
                //exchange elements
                t = strings[b-1];
                strings[b-1] = strings[b];
                strings[b] = t;
            }
        }

        // display sorted array
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
          System.out.print(" " + strings[i]);
        System.out.println();
    } 
}