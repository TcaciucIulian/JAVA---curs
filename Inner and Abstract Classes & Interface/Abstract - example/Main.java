public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Doberman");
        dog.breathe();
        dog.eat();


        Parrot parrot = new Parrot("Australian");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
