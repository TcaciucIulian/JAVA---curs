public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 20, "Black" );
        super.addHamburgerAddition1("Chips", 3);
        super.addHamburgerAddition2("Coca-Cola", 2);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe");
    }
}
