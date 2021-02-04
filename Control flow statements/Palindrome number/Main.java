public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        int i = 1;
        while(i < 1000) {
            if((i % 3 == 0) && (i % 5 == 0)){
                sum = sum + i;
                count = count + 1;
            }

            if(count == 5){
                break;
            }

            i++;
        }

        System.out.println("Sum : " + sum);
    }
}
