/*
   Chapter 1 - Question 9

   The moon's gravity is about 17 percent that of earth's. 
   Write a program that computes your effective weight on the moon.
*/
class MoonWeight {
    public static void main(String args[]) {
        double moon_weight; // holds the moon's gravity relative to earth
        double earth_weight; // holds a person's weight
  
        earth_weight = 215; // start with earth weight
  
        moon_weight = earth_weight * 0.17; // convert to moon weight
  
        System.out.print(earth_weight + " lbs on earth is ");
        System.out.println(moon_weight + " lbs on the moon.");
    }  
  }
