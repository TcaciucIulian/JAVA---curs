import java.util.Scanner;

public class InputCalculator {
    private static Scanner scanner = new Scanner(System.in);

        public static void inputThenPrintSumAndAverage(){
                int sum = 0;
                int count = 0;

                while(true){
                    System.out.println("Enter number :");
                    boolean isAnInt = scanner.hasNextInt();

                    if(isAnInt) {
                        int number = scanner.nextInt();
                        sum = sum + number;
                        count++;
                    }
                    else{
                        break;
                    }

                    scanner.nextLine();
                }

                scanner.close();
                System.out.println("Sum : " + sum + " and AVG : " + sum/count);

        }
}
