public class AreaCalculator {

    // circle area
    public static double area(double radius){
        if(radius < 0) {
            System.out.println("Invalid radius");
            return -1;
        }

        return Math.PI * Math.pow(radius, 2);
    }

    // Overloading -> by number of parameters
    // rectangle area
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            System.out.println("Invalid numbers");
            return -1;
        }

        return x * y;
    }

}
