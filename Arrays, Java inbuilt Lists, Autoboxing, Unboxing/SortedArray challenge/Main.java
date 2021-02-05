import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getArray(7);
        System.out.println("Printing read array..");
        printArray(myArray);
        System.out.println("-------------------------------------------");
        int[] sortedArray = sortArray(myArray);
        System.out.println("Printing sorted array..");
        printArray(sortedArray);
    }

    public static int[] getArray(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + " numbers : ");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }

        for(int i=0; i<sortedArray.length-1; i++)
            for(int j=i; j<sortedArray.length; j++)
                if(sortedArray[i] > sortedArray[j]){
                    int aux = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = aux;
                }

        return sortedArray;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
