/*
  Try This 6-1 Improving the Queue Class
*/
class Queue2 {
    // these members are now private
    private char q[];
    int putloc, getloc; // the put and get indices

    Queue2(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {       
        if(putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // get a character from the queue
    char getchar() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue class.
class QDemo2 {
    public static void main(String args[]) {
        Queue2 bigQ = new Queue2(100);
        Queue2 smallQ = new Queue2(4);
    
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some letters into bigQ
        for(i=0; i < 26; i++)
          bigQ.put((char) ('A' + i));
        
        // retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.getchar();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + 
                             (char) ('Z' - i));
            
            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.getchar();

            if(ch != (char) 0) System.out.print(ch);
        }
    }
}