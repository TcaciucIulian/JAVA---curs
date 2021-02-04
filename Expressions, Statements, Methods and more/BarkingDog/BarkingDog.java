public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Invalid hour");
            return false;
        }

        if(isBarking){
            if(hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        }

        return false;
    }
}
