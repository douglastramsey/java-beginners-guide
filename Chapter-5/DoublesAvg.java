/*
  Chapter 5 - Self Test - Question 3
  
  Use an array to find the average of 10 double values.
*/
class DoublesAvg {
    public static void main(String args[]) {
        double sample[] = new double[10];
        int i;
        double initialval = 10.2, sum = 0, avg = 0;

        for(i = 0; i < 10; i++) {
          sample[i] = initialval;
          initialval *= 2.42;
        }

        for(i = 0; i < 10; i++) {
          sum += sample[i];
          System.out.println("This is sample[" + i + "]: " +
                             sample[i]);
        }

        avg = sum / sample.length;

        System.out.println("Average is " + avg);
    }
}