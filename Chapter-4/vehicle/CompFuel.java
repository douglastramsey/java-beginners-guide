package vehicle;

// This class declares an object of type Vehicle.
class CompFuel {
    public static void main(String args[]) {
        
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        double gallons;
        int dist = 252;

        // assign values to fields to minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                           gallons + " gallons of fuel.");


        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                           gallons + " gallons of fuel.");
    }
}