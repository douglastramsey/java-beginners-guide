/*
  While packages aren't covered until Chapter 9,
  for ease of working, created a vehicle pacakge
  for all related exercises in Chapter 4.
*/
package vehicle;

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // This is a simple constructor to work with initial exercises
    Vehicle() {
      return;
    }
    // This is a constructor for Vehicle
    Vehicle(int p, int f, int m) {
      passengers = p;
      fuelcap = f;
      mpg = m;
    }
    
    // Return the range.
    int returnrange() {
     return fuelcap * mpg;
    }

    // Display the range.
    void displayrange() {
      System.out.println("Range is " + fuelcap * mpg);
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
