// A program that uses the Vehicle class.
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Display the range.
    void range() {
        System.out.println("Rank is " + fuelcap * mpg);
    }
}

// This class declares an object of type Vehicle.
class AddMeth {
    public static void main(String args[]) {
        
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // assign values to fields to minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Minivan can carry " + minivan.passengers +
                           ".");
        minivan.range(); // display range of minivan

        System.out.println("Sportscar can carry " + sportscar.passengers +
                           ".");
        sportscar.range(); // display range of sportscar
    }
}