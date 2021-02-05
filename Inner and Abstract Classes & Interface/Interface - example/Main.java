import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player iulian = new Player("Iulian", 200, 20);
        System.out.println(iulian.toString());
        saveObject(iulian);

        iulian.setHitPoints(150);
        System.out.println(iulian);
        iulian.setWeapon("Gun");
        saveObject(iulian);
        loadObject(iulian);
        System.out.println(iulian);


        ISaveable wolf = new Monster("Wolf", 200, 40);
        System.out.println(wolf);
        saveObject(wolf);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1 - to enter a string\n" +
                "0 - to quit");

        while(!quit){
            System.out.println("Choose an option");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    break;
            }

        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
