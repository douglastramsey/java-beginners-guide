/* 
  Try This 2-2: a truth table for the logical operators.
  
  Extra challenge: Use and display 1's and 0's,
  rather than true and false.
*/
class LogicalOpTable {
  public static void main(String args []) {

    boolean p, q;

    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

    p = true; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p));

    p = true; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p));
    
    p = false; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p));
    
    p = false; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p));

    System.out.println();

    // Extra challenge
    int r, s;

    System.out.println("R\tS\tAND\tOR\tXOR\tNOT");

    r = 1; s = 1;
    System.out.print(r + "\t" + s + "\t");
    System.out.print((r&s) + "\t" + (r|s) + "\t");
    System.out.print((r^s) + "\t");
    if(r != 1) System.out.println("1");
    if(r == 1) System.out.println("0");

    r = 1; s = 0;
    System.out.print(r + "\t" + s + "\t");
    System.out.print((r&s) + "\t" + (r|s) + "\t");
    System.out.print((r^s) + "\t");
    if(r != 1) System.out.println("1");
    if(r == 1) System.out.println("0");
    
    r = 0; s = 1;
    System.out.print(r + "\t" + s + "\t");
    System.out.print((r&s) + "\t" + (r|s) + "\t");
    System.out.print((r^s) + "\t");
    if(r != 1) System.out.println("1");
    if(r == 1) System.out.println("0");
  
    r = 0; s = 0;
    System.out.print(r + "\t" + s + "\t");
    System.out.print((r&s) + "\t" + (r|s) + "\t");
    System.out.print((r^s) + "\t");
    if(r != 1) System.out.println("1");
    if(r == 1) System.out.println("0");
  }    
}
