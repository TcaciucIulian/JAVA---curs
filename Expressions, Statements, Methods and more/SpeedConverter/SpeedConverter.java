public class SpeedConverter {

    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }


        return kilometersPerHour * 0.621;

    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid number");
        }
        else {
            double milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(" km/h = " + kilometersPerHour + " to mi/h = " + milesPerHour);
        }
    }
}
