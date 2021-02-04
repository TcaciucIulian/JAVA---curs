public class TeenNumberChecker {
    public static boolean hasTeen(int x1, int x2, int x3){
        return isTeen(x1) || isTeen(x2) || isTeen(x3);
    }

    public static boolean isTeen(int x1){
        return x1 >= 13 && x1 <= 19;
    }
}
