public class PalindromeNumber {

    public static boolean isPalindrome(int number){
        int numberCopy = number;
        int reversedNumber = 0;
        while(numberCopy != 0){
            int lastDigit = numberCopy % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            numberCopy = numberCopy / 10;
        }

        return number == reversedNumber;
    }
}

