public class LargestPrimeFactor {
    public static int getLargestPrime(int number){

        int largestPrime = -1;

        while(number % 2 == 0){
            largestPrime = 2;
            number = number / 2;
        }

        for(int i = 3; i <= Math.sqrt(number); i = i + 2){
            while(number % i == 0){
                largestPrime = i;
                number = number / i;
            }
        }

        if(number  > 2){
            largestPrime = number;
        }

        return largestPrime;
    }
}
