public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            System.out.println("Invalid numbers");
            return -1;
        }

        int greatest = -1;
        for(int i = 1; i <= first && i <= second; i++){
            if(first % i == 0 && second % i == 0){
                greatest = i;
            }
        }

        return greatest;
    }
}
