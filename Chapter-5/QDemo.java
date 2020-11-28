/*
  Try This 5-2

  A queue class for characters.

  Extra: Modified to store int as well.
*/
class Queue {
    char q1[]; // this array holds the queue
    int q2[]; // this array holds the queue
    String type; // holds type of queue
    int putloc, getloc; // the put and get indices

    Queue(int size, String type) {
        if(type == "ch") q1 = new char[size];
        if(type == "integer") q2 = new int[size];
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {       
        if(putloc==q1.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q1[putloc++] = ch;
    }

    // put an integer into the queue
    void put(int integer) {
        if(putloc==q2.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q2[putloc++] = integer;
    }

    // get a character from the queue
    char getchar() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q1[getloc++];
    }

    // get an integer from the queue
    int getint() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q2[getloc++];
    }
}

// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100, "ch");
        Queue smallQ = new Queue(4, "ch");
    
        char ch;
        int i, integer;

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

        
        /*** EXTRA ***/
        Queue bigintQ = new Queue(100, "integer");
        Queue smallintQ = new Queue(4, "integer");

        System.out.println("Using bigintQ to store 1-100.");
        // put some letters into bigintQ
        for(i=0; i < 100; i++)
          bigintQ.put(i);
        
        // retrieve and display elements from bigintQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 100; i++) {
            integer = bigintQ.getint();
            if(integer != 0) System.out.print(integer);
        }

        System.out.println("\n");

        System.out.println("Using smallintQ to generate errors.");
        // Now, use smallintQ to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + i);
            
            smallintQ.put(i);

            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            integer = smallintQ.getint();

            if(integer != 0) System.out.print(integer);
        }
    }
}
